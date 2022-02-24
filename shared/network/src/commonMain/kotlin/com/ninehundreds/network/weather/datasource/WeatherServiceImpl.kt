package com.ninehundreds.network.weather.datasource

import com.ninehundreds.network.weather.datasource.model.WeatherForecast
import com.ninehundreds.network.weather.datasource.model.WeatherLocation
import io.ktor.client.*


class WeatherServiceImpl(private val client: HttpClient): WeatherService {

    companion object {
        private const val url = "https://www.metaweather.com/api/"
    }

    override suspend fun getLocationByName(name: String): List<WeatherLocation> {
        TODO("Not yet implemented")
    }

    override suspend fun getForecastForLocation(locationId: Int): WeatherForecast {
        TODO("Not yet implemented")
    }


}