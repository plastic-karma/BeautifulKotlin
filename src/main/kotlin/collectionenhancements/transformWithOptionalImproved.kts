package collectionenhancements

import LegacyDataObject
import domain.DomainObject
import domain.create

/**
 * We are getting a list of [LegacyDataObject] and we want to transform them
 * into [DomainObject].
 */
val dataObjects: List<LegacyDataObject> = create()

/**
 * We have a transform function that can return null.
 */
fun transform(dataObject: LegacyDataObject): DomainObject? {
    return if (dataObject.name.startsWith("CUST")) {
        DomainObject(dataObject.name)
    } else null
}

/**
 * [mapNotNull] does all the heavy lifting for us (mapping values and filtering null)
 * See also https://kotlinlang.org/docs/collection-transformations.html
 */
val domainObjects = dataObjects.mapNotNull(::transform)

