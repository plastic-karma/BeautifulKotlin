import domain.create
import domain.process

/**
 * Kotlin provides the extension functions [first] and [firstOrNull] that do all the heavy lifting for us. [first] gets
 * the first element or throws and exception. [firstOrNull] gets the first element or returns null if the list is empty.
 */

val list: List<String> = create()

process(list.first())
process(list.firstOrNull())
