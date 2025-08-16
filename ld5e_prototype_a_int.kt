Kotlin
data class IoTDevice(
    val id: String,
    val deviceType: String,
    val serialNumber: String,
    val firmwareVersion: String,
    val sensorData: List<SensorData>
)

data class SensorData(
    val sensorType: String,
    val reading: Double,
    val unit: String,
    val timestamp: Long
)

data class ParserConfig(
    val deviceIdPattern: String,
    val firmwareVersionPattern: String,
    val sensorDataPattern: String
)

class IoTDeviceParser(private val config: ParserConfig) {
    fun parseDeviceData(data: String): IoTDevice {
        // TO DO: Implement parsing logic
        return IoTDevice("", "", "", "", emptyList())
    }
}