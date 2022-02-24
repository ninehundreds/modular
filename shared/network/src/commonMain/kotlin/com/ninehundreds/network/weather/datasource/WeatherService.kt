package com.ninehundreds.network.weather.datasource

import com.ninehundreds.network.weather.datasource.model.WeatherForecast
import com.ninehundreds.network.weather.datasource.model.WeatherLocation

interface WeatherService {

    suspend fun getLocationByName(name: String): List<WeatherLocation>

    suspend fun getForecastForLocation(locationId: Int): WeatherForecast

}