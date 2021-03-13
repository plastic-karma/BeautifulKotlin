package collectionenhancements

import LegacyDataObject
import domain.DomainObject
import domain.create

/**
 * We get a map of [LegacyDataObject] and we want to map that to a map of [DomainObject]
 */
val dataObjects: Map<String, List<LegacyDataObject>> = create()

/**
 * We iterate over all entries an map the values. Can we do better in Kotlin?
 */
val domainObjects: Map<String, List<DomainObject>> = dataObjects
    // get all entries in map
    .entries
    // map all values while preserving the key
    .map { it.key to it.value.map { dataObject -> DomainObject(dataObject.name) } }
    // convert list of pairs back to map
    .toMap()
