package functiontypes

import LegacyDataObject
import java.time.Instant

/**
 * We write our own extension function that takes an initializer lambda.
 */
fun LegacyDataObject.initialize(initializer: (LegacyDataObject) -> Unit): LegacyDataObject {
    initializer(this)
    return this
}

/**
 * We use the initializer extension function
 */
val dataObject = LegacyDataObject().initialize {
    it.name = "hello"
    it.updateTime = Instant.now()
}




