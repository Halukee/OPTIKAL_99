package com.example.optikal_99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HalamanPesanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_pesanan)
    }
    fun kkp(view: View?) {
        val i = Intent(applicationContext,HalamanMenu::class.java)
        startActivity(i)

    }
}