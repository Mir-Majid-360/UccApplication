package com.example.uccapplication.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import com.example.uccapplication.R
import com.example.uccapplication.adapter.TimetableAdapter.ViewHolder

class TimetableAdapter : RecyclerView.Adapter<ViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            // item courses not created yet..
            // replace timetable item by course item...
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_timetable, parent, false)
            return ViewHolder(view)
        }

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}