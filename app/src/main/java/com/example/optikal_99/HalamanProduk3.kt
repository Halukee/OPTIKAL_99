package com.example.optikal_99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HalamanProduk3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_produk3)
    }

    fun kkl(view: View?) {
        val i = Intent(applicationContext, HalamanContactLens::class.java)
        startActivity(i)
    }

    fun liu(view: View?) {
        val i = Intent(applicationContext, HalamanKeranjang3::class.java)
        startActivity(i)
    }
}