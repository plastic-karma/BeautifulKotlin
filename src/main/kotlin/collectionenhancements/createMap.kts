package collectionenhancements

import domain.process

/**
 * We want to create a map with some static entries. In plain Java or in Google's Immutables,
 * we would create a map or a map builder, add values to the map and then copy the map or
 * create a map from a builder. Can we to better in Kotlin ?
 */
val map = mutableMapOf<String, Int>()
    map["1"] = 1
    map["2"] = 2
    map["3"] = 3
    map["4"] = 4
    map["5"] = 5
    process(map.toMap())
