package com.example.optikal_99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import kotlinx.android.synthetic.main.activity_halaman_utama.*

class HalamanUtama : AppCompatActivity() {

    private lateinit var scaleGestureDetector: ScaleGestureDetector
    private var scaleFactor = 1.0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)
        scaleGestureDetector = ScaleGestureDetector(this, ScaleListener())
    }
    override fun onTouchEvent(motionEvent: MotionEvent): Boolean {
        scaleGestureDetector.onTouchEvent(motionEvent)
        return true
    }

    fun ckt(view: View?) {
        val i = Intent(applicationContext, HalamanKeranjang1::class.java)
        startActivity(i)
    }

    fun utama(view: View?) {
        val i = Intent(applicationContext, HalamanMenu::class.java)
        startActivity(i)
    }

    fun rso(view: View?) {
        val i = Intent(applicationContext,HalamanContactLens::class.java)
        startActivity(i)
    }

    fun lainnya(view: View?) {
        val i = Intent(applicationContext, HalamanKategori::class.java)
        startActivity(i)
    }

    fun jtu(view: View?) {
        val i = Intent(applicationContext, KategoriLensa::class.java)
        startActivity(i)
    }

    fun kumi(view: View?) {
        val i = Intent(applicationContext, KategoriLensa::class.java)
        startActivity(i)
    }

    fun Haruko(view: View?) {
        val i = Intent(applicationContext, HalamanProduk2::class.java)
        startActivity(i)
    }
    private inner class ScaleListener : ScaleGestureDetector.SimpleOnScaleGestureListener(),
        ScaleGestureDetector.OnScaleGestureListener {
        override fun onScale(scaleGestureDetector: ScaleGestureDetector): Boolean {
            scaleFactor *= scaleGestureDetector.scaleFactor
            scaleFactor = Math.max(0.1f, Math.min(scaleFactor, 10.0f))
            gesture.scaleX = scaleFactor
            gesture.scaleY = scaleFactor

            //img2
            gesture2.scaleX = scaleFactor
            gesture2.scaleY = scaleFactor
            return true
        }
    }
}