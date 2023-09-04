package io.rvnmrqz.uidemo.adapter


import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import io.rvnmrqz.uidemo.R
import io.rvnmrqz.uidemo.utils.RecyclerPageSnapper

class CardAdapter(private val itemCount: Int = 5) :
    RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    private val cardColors = listOf(
        Color.parseColor("#eb4c34"),
        Color.parseColor("#204399"),
        Color.parseColor("#eba234"),
        Color.parseColor("#3477eb"),
        Color.parseColor("#eb3453")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.card_full_item_view, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return itemCount
    }

    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val cardLayout: CardView = itemView.findViewById(R.id.cardLayout)

        fun bind() {
            val color = cardColors[adapterPosition % cardColors.size]
            cardLayout.setCardBackgroundColor(color)
        }
    }
}

