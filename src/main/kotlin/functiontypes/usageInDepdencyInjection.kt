package functiontypes

import com.fasterxml.jackson.databind.ObjectMapper
import com.google.inject.Provides
import domain.MetricsFactory

// Usage in dependency injection
@Provides
fun provideDomainLogic(
    metricsFactory: MetricsFactory,
    objectMapper: ObjectMapper): MyDomainLogicImproved {
    return MyDomainLogicImproved(
        // Method references have a (function) type, so we can use them here.
        mapObject = objectMapper::readValue,
        createMetrics = metricsFactory::newMetrics
    )
}
