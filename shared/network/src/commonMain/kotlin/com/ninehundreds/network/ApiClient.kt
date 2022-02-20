package com.ninehundreds.network

import co.touchlab.kermit.Kermit
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.features.auth.*
import io.ktor.client.features.auth.providers.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.serialization.json.Json

class ApiClient {

    var baseUrl: String? = null
    private val log = Kermit()

    private val networkLogger = object : Logger {
        override fun log(message: String) {
            log.v("Modular") { message }
        }
    }

    private val jsonSerializer = KotlinxSerializer(Json {
        coerceInputValues = true
        ignoreUnknownKeys = true
    })

    fun getClient(user: String? = null, pass: String? = null): HttpClient {

        return HttpClient().config {

            install(Logging) {
                logger = networkLogger
                level = LogLevel.ALL
            }

            install(JsonFeature) {
                serializer = jsonSerializer
            }

            install(HttpTimeout) {
                requestTimeoutMillis = 10000
                connectTimeoutMillis = 10000
                socketTimeoutMillis = 10000
            }

            if(user != null && pass != null) {
                install(Auth) {
                    basic {
                        credentials { BasicAuthCredentials(user, pass) }
                    }
                }
            }

            defaultRequest {
                baseUrl?.let { hostName ->
                    base(hostName)
                }
            }

        }
    }

    fun HttpRequestBuilder.base(baseUrl: String, token: String? = null) {

        if (token != null) {
            header(HttpHeaders.Authorization, "Bearer $token")
        }

        val target = "https://".plus(baseUrl)
        url.takeFrom(URLBuilder().takeFrom(target).apply {
            encodedPath += url.encodedPath
        })

    }

}