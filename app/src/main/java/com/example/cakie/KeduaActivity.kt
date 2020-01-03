package com.example.cakie

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.kedua.*

class KeduaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kedua)
        funBtn()

    }
    private fun funBtn() {
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, KetigaActivity::class.java)
            startActivity(intent)
            finish()
        }
            back.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

        }
    }
}