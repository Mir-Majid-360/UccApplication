package com.example.uccapplication.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import com.example.uccapplication.R

class TimetableAdapter : RecyclerView.Adapter<TimetableAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // item courses not created yet..
        // replace timetable item by course item...
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_timetable, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {}
    override fun getItemCount(): Int {
        return 0
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}