package collectionenhancements

import LegacyDataObject
import domain.DomainObject
import domain.create

/**
 * We are getting a list of [LegacyDataObject] and we want to transform
 * them into [DomainObject].
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
 * Let's create our working list
 */
val domainObjects = mutableListOf<DomainObject>()

/**
 * Iterate over each data object, transform it and if it is not null, add it to list.
 */
dataObjects.forEach {
    val domainObject = transform(it)
    if (domainObject != null) {
        domainObjects.add(domainObject)
    }
}

/**
 * 'seal' the list from mutable to immutable.
 */
val domainObjectsFinal = domainObjects.toList()

