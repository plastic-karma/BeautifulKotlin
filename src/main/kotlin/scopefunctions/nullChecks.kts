package scopefunctions

import domain.create
import domain.process

val str: String? = create()

/**
 * Since Kotlin supports null-safety as a first-class feature, we cannot simply access an objects operations, if
 * it could be null. We need to check for null first.
 */
if (str != null) {
    process(str.reversed().capitalize())
}

