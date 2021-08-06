package com.duv.applicationnotification

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService


class MyFirebaseInstanceIdService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        Log.i("Firebase Message", "New token received -> $token")
    }
}
