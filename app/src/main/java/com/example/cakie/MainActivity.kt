package com.example.cakie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pertama)
    }

    fun DAFTARSEKARANG(view: View) {
        val intent = Intent(this, KeduaActivity::class.java)
        startActivity(intent);
    }

    fun MASUK(view: View) {
        val intent = Intent(this, KetigaActivity::class.java)
        startActivity(intent);
    }

}
