package com.akirachix.myauthorlistapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(val AuthorsList: List<authors_class>): RecyclerView.Adapter< AuthorsVeiwHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorsVeiwHolder {
        var itemVeiw = LayoutInflater.from(parent.context).inflate(R.layout.author_list_details,parent,false)
        return AuthorsVeiwHolder(itemVeiw)
    }

    override fun onBindViewHolder(holder: AuthorsVeiwHolder, position: Int) {
        val contact = AuthorsList[position]
        holder.tvName.text = contact.name
        holder.tvDate.text = contact.date
        holder.tvTitle.text = contact.title
        holder.tvLink.text = contact.link
        holder.tvPreview.text = contact.Preview
    }

    override fun getItemCount(): Int {
        return AuthorsList.size
    }
}
class AuthorsVeiwHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)
    var tvLink = itemView.findViewById<TextView>(R.id.tvLink)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
}

