package com.duv.tdd

import android.content.SharedPreferences

class ContactHelper (private val sharedPreferences: SharedPreferences){
    fun getListContatics(): List<Contact> {
        val list = sharedPreferences.getString("contacts", "[]")
        val turnsType = object : TypeToken<List<Contact>>() {}.type
        return Gson().fromJson(list, turnsType)
    }

    fun setListContacts(list: List<Contact>) {
        sharedPreferences.edit().putString("contacts", Gson().toJson(list)).commit()

    }
}