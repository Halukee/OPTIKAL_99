package com.example.optikal_99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HalamanKeranjang1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_keranjang1)
    }

    fun kkl(view: View?) {
        val i = Intent(applicationContext, HalamanProduk2::class.java)
        startActivity(i)
    }

    fun lpu(view: View?) {
        val i = Intent(applicationContext,HalamanPesanan::class.java)
        startActivity(i)
    }
}