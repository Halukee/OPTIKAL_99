package com.example.optikal_99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HalamanAccesories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_accesories)
    }
    fun kkl(view: View?) {
        val i = Intent(applicationContext, HalamanKategori::class.java)
        startActivity(i)

    }
}