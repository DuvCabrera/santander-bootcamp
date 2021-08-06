package com.duv.applicationnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.installations.FirebaseInstallations
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {

    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend = findViewById(R.id.button_send_notification)
        btnSend.setOnClickListener {
            this.showNotfication("1234", "bootcamp Android", "Kotlin Android curso")
        }

        FirebaseInstallations.getInstance().getToken(true).addOnCompleteListener {
            val token = it.result!!.token
            // DO your thing with your firebase token
            // Log and toast
            val msg = "Token -> $token"
            Log.d("Firebase Message", msg)

        }
    }
}
