package com.omar.toyapp.network

import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import java.util.*

object NetworkUtils {
    private const val DYNAMIC_WEATHER_URL: String = "https://andfun-weather.udacity.com/weather"
    private const val STATIC_WEATHER_URL: String =
        "https://andfun-weather.udacity.com/staticweather"
    private const val FORECAST_BASE_URL: String = STATIC_WEATHER_URL
    private const val format: String = "json"
    private const val units: String = "metric"
    private const val numDays: Int = 14

    private const val QUERY_PARAM = "q"
    private const val LAT_PARAM = "lat"
    private const val LON_PARAM = "lon"
    private const val FORMAT_PARAM = "mode"
    private const val UNITS_PARAM = "units"
    private const val DAYS_PARAM = "cnt"


    fun buildUrl(locationQuery: String): URL? = null

    fun buildUrl(lat: Double, long: Double): URL? = null

    @Throws(IOException::class)
    fun getResponseFromUrl(url: URL): String? {
        val urlConnection: HttpURLConnection = url.openConnection() as HttpURLConnection
        return try {
            val inputStream = urlConnection.inputStream
            val scanner = Scanner(inputStream)
            scanner.useDelimiter("\\A")
            val hasInput = scanner.hasNext()
            if (hasInput) {
                scanner.next()
            } else {
                null
            }

        } finally {
            urlConnection.disconnect()
        }
    }

}