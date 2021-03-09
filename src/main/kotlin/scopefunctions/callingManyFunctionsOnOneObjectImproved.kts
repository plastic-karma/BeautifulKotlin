package scopefunctions

import domain.PayloadBuilder
import domain.process

/**
 * In Kotlin we can use [with] which takes an object and passes it as 'this' receiver to the lambda. So all calls inside
 * the lambda without an explicit receiver will be called against the object passed.
 */
process(
    with(PayloadBuilder()) {
        withId("id")
        withRandom("1234")
        withTest("test")
        withUpdate("update")
        withText("Hello")
        build()
    }
)
