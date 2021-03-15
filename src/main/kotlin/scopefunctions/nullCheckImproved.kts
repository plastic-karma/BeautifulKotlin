package scopefunctions

import domain.create
import domain.process

val str: String? = create()

/**
 * Let helps us make the null check more concise. It takes a lambda with 'it'
 * as the context object and returns the result of the lambda.
 */
str?.let { process(it.reversed().capitalize()) }
