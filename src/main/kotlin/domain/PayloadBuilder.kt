package domain

class PayloadBuilder {

    fun withId(value: String) {}
    fun withUpdate(value: String) {}
    fun withTest(value: String) {}
    fun withRandom(value: String) {}
    fun withText(value: String) {}

    fun build(): Payload = Payload("id")
}
