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
     * Usage without using class as runtime type information
     */
    val payload1: Payload = objectMapper.readValue<Payload>(rawData)

    /**
     * Kotlin can also infer the type by looking at where it is used.
     */
    val payload2: Payload = objectMapper.readValue(rawData)
}
