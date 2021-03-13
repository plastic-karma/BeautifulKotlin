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
 * This is our working map.
 */
val payLoadByIdMutable = mutableMapOf<String, MutableList<Payload>>()

/**
 * Let's group our payloads by use case
 */
payloads.forEach {
    val useCase = payloadUseCase(it)
    if (useCase !in payLoadByIdMutable) {
        payLoadByIdMutable[useCase] = mutableListOf()
    }
    payLoadByIdMutable[useCase]!!.add(it)
}

/**
 * Kotlin differentiates between mutable and immutable lists. So this 'seals' the lists that we have just created.
 */
val payloadsByUseCase: Map<String, List<Payload>> = payLoadByIdMutable.mapValues { it.value.toList() }
