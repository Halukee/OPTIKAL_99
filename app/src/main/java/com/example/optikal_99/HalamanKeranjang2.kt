package com.example.optikal_99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HalamanKeranjang2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_keranjang2)
    }

    fun kkl(view: View?) {
        val i = Intent(applicationContext, HalamanProduk1::class.java)
        startActivity(i)
    }

    fun lpu(view: View?) {
        val i = Intent(applicationContext, HalamanCekOut1::class.java)
        startActivity(i)
    }

}