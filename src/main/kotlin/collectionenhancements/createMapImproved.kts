package collectionenhancements

import domain.process

/**
 * In Kotlin, we have the builder function [mapOf]. It takes a variable length list of pairs (think key value pair). But
 * we don't need to instantiate the Pair with a constructor call. Kotlin has the [to] infix function which allows us to
 * create pairs in a much more readable way.
 */
process(
    mapOf(
       "1" to 1,
       "2" to 2,
       "3" to 3,
       "4" to 4,
       "5" to 5
   )
)
