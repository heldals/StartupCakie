package com.example.cakie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class KetigaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ketiga)
        funBtn()

    }

    private fun funBtn() {
        val button = findViewById<Button>(R.id.button3)
        button.setOnClickListener{
            val intent = Intent(this, KeempatActivity::class.java)
            startActivity(intent)
        }
    }

}
