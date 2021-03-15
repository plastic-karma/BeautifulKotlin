package scopefunctions

import domain.Metrics
import domain.create

/**
 * We have an object which we like to perform clean-up operations upon, like
 * flushing buffers and writing actual data  to disk. `try { } finally` lets us do that.
 * But is there a better way in Kotlin
 */
val metrics: Metrics = create()
metrics.use { metrics ->
    // do important stuff
    metrics.emitLatency("import stuff, but really verbose", 10)
}


