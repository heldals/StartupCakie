package com.example.cakie

import android.content.Intent
import android.os.Bundle
import  androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.kelima.*

class KelimaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kelima)

        tambah2.setOnClickListener{
            val intent = Intent(this, KeenamActivity::class.java)
            startActivity(intent)
        }
        back_2.setOnClickListener {
            val intent = Intent(this, KeempatActivity::class.java)
            startActivity(intent)

    }}
}
