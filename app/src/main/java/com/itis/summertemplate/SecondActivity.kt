package com.itis.summertemplate

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        count = intent?.extras?.getInt(MainActivity.KEY_COUNT, -343) ?: 0

        Snackbar.make(
            findViewById(android.R.id.content),
            "Count: $count",
            Snackbar.LENGTH_INDEFINITE
        ).show()

        button.setOnClickListener {
            count++
        }

        button3.setOnClickListener {
            setResult(Activity.RESULT_OK, Intent().putExtra(MainActivity.KEY_COUNT, count))
            finish()
        }

        rv_city.adapter = CityAdapter(CityRepository.cities) { id ->
            val intent = Intent(this, CityActivity::class.java)
            intent.putExtra("ID", id)
            startActivity(intent)
        }
    }
}
