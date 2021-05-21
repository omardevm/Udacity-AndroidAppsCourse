package com.omar.toyapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null
    private val dummyWeatherData = arrayOf(
        "Today, May 17 - Clear - 17°C / 15°C",
        "Tomorrow - Cloudy - 19°C / 15°C",
        "Thursday - Rainy- 30°C / 11°C",
        "Friday - Thunderstorms - 21°C / 9°C",
        "Saturday - Thunderstorms - 16°C / 7°C",
        "Sunday - Rainy - 16°C / 8°C",
        "Monday - Partly Cloudy - 15°C / 10°C",
        "Tue, May 24 - Meatballs - 16°C / 18°C",
        "Wed, May 25 - Cloudy - 19°C / 15°C",
        "Thu, May 26 - Stormy - 30°C / 11°C",
        "Fri, May 27 - Hurricane - 21°C / 9°C",
        "Sat, May 28 - Meteors - 16°C / 7°C",
        "Sun, May 29 - Apocalypse - 16°C / 8°C",
        "Mon, May 30 - Post Apocalypse - 15°C / 10°C"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.textView = this.findViewById(R.id.textView) as TextView
        for (data: String in dummyWeatherData) {
            this.textView!!.append(data + "\n\n\n")
        }
    }
}