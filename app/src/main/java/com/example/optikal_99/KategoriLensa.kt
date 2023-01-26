package com.example.optikal_99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class KategoriLensa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori_lensa)
    }

    fun Haruko(view: View?) {
        val i = Intent(applicationContext,HalamanProduk2::class.java)
        startActivity(i)
    }

    fun kumi(view: View?) {
        val i = Intent(applicationContext,HalamanProduk2::class.java)
        startActivity(i)
    }

    fun kkl(view: View?) {
        val i = Intent(applicationContext, HalamanKategori::class.java)
        startActivity(i)
    }

    fun ckt(view: View?) {
        val i = Intent(applicationContext, HalamanKeranjang1::class.java)
        startActivity(i)
    }
}