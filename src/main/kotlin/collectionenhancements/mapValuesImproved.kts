package collectionenhancements

import LegacyDataObject
import domain.DomainObject
import domain.create

/**
 * We get a map of [LegacyDataObject] and we want to map that to a map of [DomainObject]
 */
val dataObjects: Map<String, List<LegacyDataObject>> = create()

/**
 * In Kotlin, we can use [mapValues] function that transforms values of a map.
 * See https://kotlinlang.org/docs/collection-transformations.html for more.
 */
val domainObjects: Map<String, List<DomainObject>> = dataObjects.mapValues {
    it.value.map { dataObject -> DomainObject(dataObject.name) }
}
