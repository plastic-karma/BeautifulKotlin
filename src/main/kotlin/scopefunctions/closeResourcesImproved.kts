package scopefunctions

import domain.Metrics
import domain.create

/**
 * The use function (essentially an extension of AutoClosable) takes care of all the closing and exception handling
 * for us. See also https://kotlinlang.org/docs/scope-functions.html#function-selection
 */
create<Metrics>().use { metrics ->
    // do important stuff
    metrics.emitLatency("import stuff, but really verbose", 10)
}
