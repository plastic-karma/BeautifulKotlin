package reifiedtypes

import com.fasterxml.jackson.databind.ObjectMapper
import domain.Payload

/**
 * Kotlin allows us to preserve type information with a reified keyword.
 */
inline fun <reified T> ObjectMapper.readValue(data: String): T {
    return this.readValue<T>(data, T::class.java)
}


fun functionWithTypeInformationImproved(rawData: String) {
    val objectMapper = ObjectMapper()

    /**
     * Sometimes, we want to use generics, and use the type that we have specified. But JVM erases types at runtime,
     * so we need to pass class objects to preserve that type. Example in Jackson library.
     */
    val payload1: Payload = objectMapper.readValue<Payload>(rawData)

    /**
     * Kotlin can also infer the type by looking at where it is used.
     */
    val payload2: Payload = objectMapper.readValue(rawData)
}
