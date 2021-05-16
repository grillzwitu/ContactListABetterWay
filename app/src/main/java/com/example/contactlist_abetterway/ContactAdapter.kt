package com.example.contactlist_abetterway

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist_abetterway.databinding.ActivityContactListItemsBinding

class ContactAdapter: RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
    private val contacts = mutableListOf<ContactLst>()

    fun  setUpContacts(contacts: List<ContactLst>) {
        this.contacts.addAll(contacts)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        return ContactViewHolder(ActivityContactListItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bindItem(contact)
    }

    override fun getItemCount(): Int {
        return  contacts.size
    }

    inner class ContactViewHolder(private val binding: ActivityContactListItemsBinding):RecyclerView.ViewHolder(binding.root){
        fun  bindItem(contact: ContactLst){
            binding.nameTextView.text = contact.name
            binding.numberTextView.text = contact.number
        }
    }
}