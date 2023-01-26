package com.example.optikal_99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HalamanProduk2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_produk2)
    }

    fun pli(view: View?) {
        val i = Intent(applicationContext, HalamanKeranjang1::class.java)
        startActivity(i)
    }

    fun kkl(view: View?) {
        val i = Intent(applicationContext, KategoriLensa::class.java)
        startActivity(i)
    }

    fun ckt(view: View?) {
        val i = Intent(applicationContext, HalamanKeranjang1::class.java)
        startActivity(i)
    }
}