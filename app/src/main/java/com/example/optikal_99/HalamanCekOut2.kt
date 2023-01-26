package com.example.optikal_99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HalamanCekOut2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_cek_out2)
    }
    fun kkj(view: View?) {
        val i = Intent(applicationContext, HalamanKeranjang2::class.java)
        startActivity(i)

    }
    fun klm(view: View?) {
        val i = Intent(applicationContext,HalamanPesanan::class.java)
        startActivity(i)

    }
}