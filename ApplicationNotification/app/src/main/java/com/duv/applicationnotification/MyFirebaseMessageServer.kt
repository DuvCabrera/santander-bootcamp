package com.duv.applicationnotification

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessageServer : FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        Log.i("Firebase Message", "New message received from -> ${remoteMessage.from}")

        if (remoteMessage.notification != null) {
            this.showNotfication("1234",
            remoteMessage.notification?.title.toString(),
            remoteMessage.notification?.body.toString())
        }
    }
}