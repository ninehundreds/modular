package com.ninehundreds.network.weather.datasource.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherLocation (
    @SerialName("title")
    var title: String? = null,

    @SerialName("location_type")
    var locationType: String? = null,

    @SerialName("woeid")
    var woeId: Int? = null,

    @SerialName("latt_long")
    var latLng: String? = null
)