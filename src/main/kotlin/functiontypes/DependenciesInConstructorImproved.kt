package functiontypes

import domain.Metrics
import domain.Payload

/**
 * This class depends on two functions:
 *  One takes String and Class<Payload> objects as input and returns a Payload object.
 *  The other takes no inputs and returns a metrics object.
 * Note, that we got rid of all concrete dependencies.
 * https://kotlinlang.org/docs/lambdas.html#function-types
 */
class MyDomainLogicImproved(
    private val mapObject: (String, Class<Payload>) -> Payload,
    private val createMetrics: () -> Metrics) {

    fun doStuff(rawData: String) {
        val metrics = createMetrics()
        val payload = mapObject(rawData, Payload::class.java)

        // do important stuff with payload

        metrics.emitLatency("doStuff.TIME.${payload.id}", 10)
    }
}

