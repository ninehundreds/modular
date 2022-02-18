package com.ninehundreds.network.weather.datasource.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherForecast (
    @SerialName("consolidated_weather")
    var consolidatedWeather: ArrayList<Weather>? = null,

    @SerialName("time")
    var time: String? = null,

    @SerialName("sun_rise")
    var sunrise: String? = null,

    @SerialName("sun_set")
    var sunset: String? = null,

    @SerialName("timezone_name")
    var timezoneName: String? = null,

    @SerialName("parent")
    var parentLocation: WeatherLocation? = null,

    @SerialName("sources")
    var sources: ArrayList<Sources>? = null,

    @SerialName("title")
    var title: String? = null,

    @SerialName("location_type")
    var locationType: String? = null,

    @SerialName("woeid")
    var woeId: Int? = null,

    @SerialName("latt_long")
    var latLng: String? = null,

    @SerialName("timezone")
    var timezone: String? = null
)

@Serializable
data class Sources (

    @SerialName("title")
    var title: String? = null,

    @SerialName("slug")
    var slug: String? = null,

    @SerialName("url")
    var url: String? = null,

    @SerialName("crawl_rate")
    var crawlRate: Int? = null
)

