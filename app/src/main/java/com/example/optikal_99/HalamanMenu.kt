package com.example.optikal_99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HalamanMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_menu)
    }
    fun home(view: View?) {
        val i = Intent(applicationContext, HalamanUtama::class.java)
        startActivity(i)

    }
    fun kategori(view: View?) {
        val i = Intent(applicationContext, HalamanKategori::class.java)
        startActivity(i)

    }
    fun lokasi(view: View?) {
        val i = Intent(applicationContext, MapsActivity::class.java)
        startActivity(i)

    }
    fun contact(view: View?) {
        val i = Intent(applicationContext, HalamanContact::class.java)
        startActivity(i)

    }
    fun login1(view: View?) {
        val i = Intent(applicationContext, TampilanLogin::class.java)
        startActivity(i)

    }

    fun kkl(view: View?) {
        val i = Intent(applicationContext, HalamanUtama::class.java)
        startActivity(i)

    }
}

