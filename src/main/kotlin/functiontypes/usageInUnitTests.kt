package functiontypes

import domain.Metrics
import domain.Payload

fun unitTest() {
    val dummyMetrics = Metrics()
    val domainLogicToTest = MyDomainLogicImproved(
        // Lambdas have a function type, so we can use them here
        // Note also, that we are using anonymous parameters here, because we don't use them.
        mapObject = {_, _ -> Payload("testId") },
        createMetrics = { dummyMetrics }
    )
    domainLogicToTest.doStuff("Hello Kotlin")
    // assert important stuff
}
