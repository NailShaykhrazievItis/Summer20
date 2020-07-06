package com.itis.summertemplate

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count = savedInstanceState?.getInt(KEY_COUNT, 0) ?: 0
        textView.text = "Hello World: $count"

        btn_increase.setOnClickListener {
            count++
            updateTextCount()
        }
        btn_increase.setOnLongClickListener {
            Toast.makeText(this, "Long Click: $count", Toast.LENGTH_LONG).show()
            true
        }
        btn_next.setOnClickListener {
//            MainActivity -> OS -> Manifest -> Second
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(KEY_COUNT, count)
            startActivityForResult(intent, KEY_REQUEST)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == KEY_REQUEST && resultCode == Activity.RESULT_OK) {
            data?.extras?.getInt(KEY_COUNT)?.also {
                count = it
                updateTextCount()
                Toast.makeText(this, "Long Click: $it", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(KEY_COUNT, count)
        super.onSaveInstanceState(outState)

    }

    private fun updateTextCount() {
        textView.text = "Hello World: $count"
    }

    companion object {
        const val KEY_COUNT = "count"

        private const val KEY_REQUEST = 55
    }
}
