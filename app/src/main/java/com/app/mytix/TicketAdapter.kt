package com.app.mytix

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TicketAdapter(
    private val listTicket: ArrayList<Ticket>
) : RecyclerView.Adapter<TicketAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgTicket: ImageView =
            itemView.findViewById(R.id.imgTicket)

        val txtConcert: TextView =
            itemView.findViewById(R.id.txtConcert)

        val txtCategory: TextView =
            itemView.findViewById(R.id.txtCategory)

        val txtDate: TextView =
            itemView.findViewById(R.id.txtDate)

        val txtPrice: TextView =
            itemView.findViewById(R.id.txtPrice)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_ticket, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTicket.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ticket = listTicket[position]

        holder.imgTicket.setImageResource(ticket.image)
        holder.txtConcert.text = ticket.concert
        holder.txtCategory.text = ticket.category
        holder.txtDate.text = ticket.date
        holder.txtPrice.text = ticket.price
    }
}