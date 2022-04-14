package com.example.uccapplication.adapter

import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import com.example.uccapplication.R

class CoursesAdapter : RecyclerView.Adapter<CoursesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
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
