package scopefunctions

import LegacyDataObject
import java.time.Instant

/**
 * We can use apply method. Apply takes a function/lambda that has the object it is called with as the receiver.
 * It also returns the same object. See also https://kotlinlang.org/docs/scope-functions.html and
 * https://kotlinlang.org/docs/scope-functions.html#function-selection
 */
val data = LegacyDataObject().apply {
    name = "Hello";
    updateTime = Instant.now()
}
