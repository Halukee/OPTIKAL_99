package com.example.optikal_99

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_halaman_cek_out1.*
import kotlinx.android.synthetic.main.activity_main.*

class HalamanCekOut1 : AppCompatActivity() {
    val CHANNEL_ID = "channelID"
    val CHANNEL_NAME = "channerName"
    val NOTIFICATION_ID = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buatNotifikasi()

        val intent = Intent(this, MainActivity::class.java)
        val pendingIntent = TaskStackBuilder.create(this).run {
            addNextIntentWithParentStack(intent)
            getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT)
        }

        val notificatin = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("Belajar Notifikasi")
            .setContentText("Ini isi dari notifikasi kita ya")

            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)
            .build()

        val notifikasiManager = NotificationManagerCompat.from(this)
        btn_kirim_notif.setOnClickListener {
            notifikasiManager.notify(NOTIFICATION_ID, notificatin)
        }
    }

    fun buatNotifikasi() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES .O){
            val channel = NotificationChannel(
                CHANNEL_ID,
                CHANNEL_NAME,
                NotificationManager.IMPORTANCE_DEFAULT
            )
                .apply {
                    lightColor = Color.GREEN
                    enableLights(true)
                }

            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }
    }

}