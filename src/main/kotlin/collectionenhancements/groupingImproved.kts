package collectionenhancements

import domain.Payload
import domain.create

/**
 * We have a list of payloads that we want to group
 */
val payloads : List<Payload> = create()

/**
 * This is our grouping function. It returns a use case based on the id.
 */
fun payloadUseCase(payload: Payload): String {
    return when {
        payload.id.startsWith("1") -> "CUSTOMER"
        payload.id.startsWith("2") -> "VENDOR"
        else -> "UNKNOWN"
    }
}

/**
 * [groupBy] does all the heaving lifting for us.
 * See also https://kotlinlang.org/docs/collection-grouping.html
 */
val payloadsByType: Map<String, List<Payload>> = payloads.groupBy { payloadUseCase(it) }
                                               //payloads.groupBy(::payloadUseCase)
