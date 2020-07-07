package com.itis.summertemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class CityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city)

        val id = intent?.extras?.getInt("ID", -343) ?: 0
        val city = CityRepository.cities.find { it.id == id }

        Snackbar.make(
            findViewById(android.R.id.content),
            city.toString(),
            Snackbar.LENGTH_INDEFINITE
        ).show()
    }
}
