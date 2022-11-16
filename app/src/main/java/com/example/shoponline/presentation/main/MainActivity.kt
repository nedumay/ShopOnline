package com.example.shoponline.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.shoponline.R

class MainActivity : AppCompatActivity() {

    lateinit var spinnerCity: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val city_menu = resources.getStringArray(R.array.city)
        spinnerCity = findViewById(R.id.choice_city)
        ArrayAdapter.createFromResource(
            this,
            R.array.city,
            android.R.layout.simple_list_item_1
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerCity.adapter = adapter
        }
    }
}