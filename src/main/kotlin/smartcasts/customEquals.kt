package smartcasts

import domain.Payload

class MyClass(val value: Payload) {

    /**
     * We want to write custom equals logic, but the contract requires us to accept Any?. So we check if the object is
     * null or not of our type and if it is return false. Otherwise we cast the object and do our custom comparison.
     * Is there a better way in Kotlin to do that?
     */
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is MyClass) {
            return false
        } else {
            val thOther: MyClass = other as MyClass
            // do some complicated stuff
            return thOther.value == this.value
        }
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }
}
