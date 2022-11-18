package com.example.shoponline.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.Spinner
import com.example.shoponline.R

class MainActivity : AppCompatActivity() {

    lateinit var checkPhone: CheckBox
    lateinit var checkComputer: CheckBox
    lateinit var checkHealth: CheckBox
    lateinit var checkBooks: CheckBox
    lateinit var checkOther: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // выпадающий список городов
        val spinnerCity = findViewById<Spinner>(R.id.choice_city)
        adapterSpinnerCity(spinner = spinnerCity)

        checkPhone = findViewById(R.id.btn_check_phone)
        checkPhone.isChecked = true

        checkComputer = findViewById(R.id.btn_check_computer)
        checkHealth = findViewById(R.id.btn_check_health)
        checkBooks = findViewById(R.id.btn_check_books)
        checkOther = findViewById(R.id.btn_check_other)
        // Переключение кнопок check
        checkBoxMenu()


    }

    private fun adapterSpinnerCity(spinner: Spinner) {
        ArrayAdapter.createFromResource(
            this,
            R.array.city,
            android.R.layout.simple_list_item_1
        ).also { adapterSpinner ->
            adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapterSpinner
        }
    }

    private fun checkBoxMenu() {
        // Кнопка Phone
        checkPhone.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                checkPhone.isChecked = true
                checkComputer.isChecked = false
                checkBooks.isChecked = false
                checkHealth.isChecked = false
                checkOther.isChecked = false
            } else {
                checkPhone.isChecked = false
            }
        }

        // Кнопка Computer
        checkComputer.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                checkPhone.isChecked = false
                checkComputer.isChecked = true
                checkBooks.isChecked = false
                checkHealth.isChecked = false
                checkOther.isChecked = false
            } else {
                checkComputer.isChecked = false
            }
        }

        // Кнопка Books
        checkBooks.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                checkPhone.isChecked = false
                checkComputer.isChecked = false
                checkBooks.isChecked = true
                checkHealth.isChecked = false
                checkOther.isChecked = false
            } else {
                checkBooks.isChecked = false
            }
        }

        // Кнопка Health
        checkHealth.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                checkPhone.isChecked = false
                checkComputer.isChecked = false
                checkBooks.isChecked = false
                checkHealth.isChecked = true
                checkOther.isChecked = false
            } else {
                checkHealth.isChecked = false
            }
        }

        // Кнопка Other
        checkOther.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                checkPhone.isChecked = false
                checkComputer.isChecked = false
                checkBooks.isChecked = false
                checkHealth.isChecked = false
                checkOther.isChecked = true
            } else {
                checkOther.isChecked = false
            }
        }
    }
}