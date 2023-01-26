package com.example.optikal_99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HalamanProduk1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_produk1)
    }

    fun kkl(view: View?) {
        val i = Intent(applicationContext, KategoriLensa::class.java)
        startActivity(i)
    }

    fun pli(view: View?) {
        val i = Intent(applicationContext, HalamanKeranjang2::class.java)
        startActivity(i)
    }

    fun ckt(view: View?) {
        val i = Intent(applicationContext, HalamanKeranjang2::class.java)
        startActivity(i)
    }
}