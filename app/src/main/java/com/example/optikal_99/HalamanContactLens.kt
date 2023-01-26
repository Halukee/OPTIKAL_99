package com.example.optikal_99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HalamanContactLens : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_contact_lens)
    }

    fun kkl(view: View?) {
        val i = Intent(applicationContext, HalamanKategori::class.java)
        startActivity(i)
    }

    fun psn(view: View?) {
        val i = Intent(applicationContext,HalamanProduk3::class.java)
        startActivity(i)
    }

    fun myt(view: View?) {
        val i = Intent(applicationContext,HalamanProduk3::class.java)
        startActivity(i)
    }

    fun lls(view: View?) {
        val i = Intent(applicationContext,HalamanProduk2::class.java)
        startActivity(i)
    }

    fun lsn(view: View?) {
        val i = Intent(applicationContext,HalamanContactLens::class.java)
        startActivity(i)
    }

    fun ckt(view: View?) {
        val i = Intent(applicationContext, HalamanKeranjang2::class.java)
        startActivity(i)
    }

    fun prt(view: View?) {
        val i = Intent(applicationContext, HalamanProduk3::class.java)
        startActivity(i)
    }
}