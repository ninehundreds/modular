package com.ninehundreds.network.weather.datasource.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Weather (
    @SerialName("id")
    var id: Int? = null,

    @SerialName("weather_state_name")
    var stateName: String? = null,

    @SerialName("weather_state_abbr")
    var stateAbbr: String? = null,

    @SerialName("wind_direction_compass")
    var directionCompass: String? = null,

    @SerialName("created")
    var created: String? = null,

    @SerialName("min_temp")
    var minTemp: Float? = null,

    @SerialName("max_temp")
    var maxTemp: Float? = null,

    @SerialName("the_temp")
    var currentTemp: Float? = null,

    @SerialName("wind_speed")
    var windSpeed: Float? = null,

    @SerialName("wind_direction")
    var windDirection: Float? = null,

    @SerialName("air_pressure")
    var air_pressure: Float? = null,

    @SerialName("humidity")
    var humidity: Int? = null,

    @SerialName("visibility")
    var visibility: Float? = null,

    @SerialName("predictability")
    var predictability: Int? = null
)
