package functiontypes

import LegacyDataObject
import java.time.Instant

/**
 * In Kotlin we can specify a receiver of a function. It will be available as 'this'
 * to the function. The function can only be called on objects of the receiver.
 *
 * My mental model =
 *          Function types
 *          + extension functions
 *          + receiver types
 *          = 'anonymous extension functions'
 */
fun LegacyDataObject.initialize(
    initializer: LegacyDataObject.() -> Unit
): LegacyDataObject {
    this.initializer()
    return this
}

/**
 * This is the Kotlin idiomatic way.
 */
val dataObject = LegacyDataObject().initialize {
    name = "hello"
    updateTime = Instant.now()
}




