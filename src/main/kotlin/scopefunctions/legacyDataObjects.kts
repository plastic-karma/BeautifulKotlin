package scopefunctions

import LegacyDataObject
import java.time.Instant

/**
 * Some legacy code does not have proper constructors and we need to set
 * data after the object is created.
 */
val data = LegacyDataObject()
data.name = "Hello"
data.updateTime = Instant.now()
