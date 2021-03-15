import domain.create
import domain.process

/**
 * We are getting a list from somewhere and we only want to process the first element.
 * We need to check, if the list is not empty and then access the element.
 * Can we do better in Kotlin?
 */

val list: List<String> = create()

if(list.isNotEmpty()) {
    process(list[0])
} else {
    process(null)
    // OR
    error("List must not be empty")
}
