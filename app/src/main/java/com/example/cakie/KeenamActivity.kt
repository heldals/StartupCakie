package com.example.cakie

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.keenam.*

class KeenamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.keenam)

    back_3.setOnClickListener {
        val intent = Intent(this, KelimaActivity::class.java)
        startActivity(intent)
    }
    }
}
