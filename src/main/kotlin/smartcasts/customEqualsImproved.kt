package smartcasts

import domain.Payload

class MyClassImproved(val value: Payload) {

    /**
     * In Kotlin we can use smart casts. Notice that we can access `value` attribute of object `other` although it is of
     * type Any?. We can do this because the Kotlin compiler knows, that when we reach the if block, the object cannot
     * be null and it must be of type MyClass. The compiler applies a smart cast from [Any?] to [MyClassImproved]
     */
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is MyClassImproved) {
            return false
        } else {
            // do some complicated stuff
            return other.value == this.value
        }
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }
}
