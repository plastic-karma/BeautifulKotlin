package domain

class Metrics : AutoCloseable {
    fun emitLatency(name: String, ms: Long) {}
    override fun close() {
    }
}
