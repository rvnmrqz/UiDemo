package io.rvnmrqz.uidemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.rvnmrqz.uidemo.R

class ListAdapter(private val itemCount: Int = 20) :
    RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_view, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        // do nothing
    }

    override fun getItemCount(): Int {
        return itemCount
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}