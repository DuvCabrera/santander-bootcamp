package com.duv.contatos.model.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.duv.contatos.R
import com.duv.contatos.model.ContactModel
import kotlinx.android.synthetic.main.contacts_item.view.*

class ContactAdapter ( val contactsList: ArrayList<ContactModel>)
    :RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.contacts_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ContactAdapter.ViewHolder, position: Int) {
        holder.bindItem(contactsList[position])
    }

    override fun getItemCount(): Int = contactsList.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(contact: ContactModel){
            itemView.contact_name.text = contact.name
            itemView.contact_phone.text = contact.phoneNumber
        }
    }

}
