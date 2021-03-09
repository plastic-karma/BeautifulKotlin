package reifiedtypes

import com.fasterxml.jackson.databind.ObjectMapper
import domain.Payload

fun functionWithTypeInformation(rawData: String) {
    val objectMapper = ObjectMapper()

    /**
     * Sometimes, we want to use generics, and use the type that we have specified. But JVM erases types at runtime,
     * so we need to pass class objects to preserve that type. Example in Jackson library.
     */
    val payload = objectMapper.readValue<Payload>(rawData, Payload::class.java)
}
