package com.example.optikal_99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HalamanKategori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_kategori)
    }
    fun kkl(view: View?) {
        val i = Intent(applicationContext,HalamanMenu::class.java)
        startActivity(i)
    }

    fun jtu(view: View?) {
        val i = Intent(applicationContext, KategoriLensa::class.java)
        startActivity(i)
    }

    fun rso(view: View?) {
        val i = Intent(applicationContext, HalamanContactLens::class.java)
        startActivity(i)
    }

    fun acs(view: View?) {
        val i = Intent(applicationContext, HalamanAccesories::class.java)
        startActivity(i)
    }

    fun ckt(view: View?) {
        val i = Intent(applicationContext, HalamanKeranjang1::class.java)
        startActivity(i)
    }
}