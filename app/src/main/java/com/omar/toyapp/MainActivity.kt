package com.omar.toyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Global variable
    private var toyList: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toyList = findViewById(R.id.tv_toy_names)
        if (toyList != null) {
            val toyNames: List<String> = ToyBox().getToyNames()
            for (toy: String in toyNames) {
                toyList!!.append(toy + "\n\n\n")
            }
        }
    }
}