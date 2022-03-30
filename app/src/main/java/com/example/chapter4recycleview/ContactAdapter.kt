package com.example.chapter4recycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4recycleview.databinding.MyContactItemBinding
//pakai binding
class ContactAdapter (private val listContact : ArrayList<Contact>) :
        RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = MyContactItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder (view)
    }

    class ViewHolder (private val itemBinding: MyContactItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root)
    {
            fun bind (contact: Contact){
                itemBinding.tvText.text = contact.nama
                itemBinding.tvNohp.text = contact.noHp
                itemBinding.tvGambarone.setImageResource(contact.image)
            }
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val  contact = listContact[position]
        holder.bind(contact)
    }
    override fun getItemCount(): Int{
        return listContact.size
    }
}








