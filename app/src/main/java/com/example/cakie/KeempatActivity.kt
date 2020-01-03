package com.example.cakie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.keempat.*

class KeempatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keempat)

        kelolajajan.setOnClickListener {
            val intent = Intent(this, KelimaActivity::class.java)
            startActivity(intent)
        }
         button3.setOnClickListener {
             val intent = Intent(this,KelimaActivity::class.java)
         }
//            private fun funBtn() {
//                kelolajajan.setOnClickListener{
//                    val intent = Intent(this, KelimaActivity::class.java)
//                    startActivity(intent)
//                    finish()
//        }
    }
}