package scopefunctions

import domain.PayloadBuilder
import domain.process

/**
 * We are creating an object, like a builder and then we are calling
 * many methods on that object. We always repeat the object reference to call the
 * methods upon. Is there a better way in Kotlin to do this?
 */

val payloadBuilder = PayloadBuilder()
payloadBuilder.withId("id")
payloadBuilder.withRandom("1234")
payloadBuilder.withTest("test")
payloadBuilder.withUpdate("update")
payloadBuilder.withText("Hello")

process(payloadBuilder.build())
