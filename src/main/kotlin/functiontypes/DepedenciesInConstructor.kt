package functiontypes

import domain.MetricsFactory
import domain.Payload
import com.fasterxml.jackson.databind.ObjectMapper

/**
 * This class depends on two other classes ObjectMapper and MetricsFactory. But upon closer examination, we can see that
 * it really only depends on a single method each. So this class is not really interested in an ObjectMapper and a
 * MetricsFactory  as types. It is interested in the behavior of providing a metrics object and mapping an object.
 * See [MyDomainLogicImproved] on how to better model this.
 */
class MyDomainLogicOld(
    private val objectMapper: ObjectMapper,
    private val metricsFactory: MetricsFactory) {

    fun doStuff(rawData: String) {
        val metrics = metricsFactory.newMetrics()
        val payload = objectMapper.readValue(rawData, Payload::class.java)

        // do important stuff with payload

        metrics.emitLatency("doStuff.TIME.${payload.id}", 10)
    }
}
