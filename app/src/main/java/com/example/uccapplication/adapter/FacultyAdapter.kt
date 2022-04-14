package com.example.uccapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uccapplication.R
import com.example.uccapplication.adapter.FacultyAdapter.ViewHolder
import com.example.uccapplication.models.FacultyModel

class FacultyAdapter() : RecyclerView.Adapter<ViewHolder>() {


    var facultyModelArrayList: ArrayList<FacultyModel>? = null
    var context: Context? = null



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_faculty_info, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

       val facultyModel:FacultyModel = facultyModelArrayList?.get(position)!!
        holder.name?.setText(facultyModelArrayList?.get(position).toString())
        holder.phone?.setText(facultyModelArrayList?.get(position).toString())
        holder.email?.setText(facultyModelArrayList?.get(position).toString())



    }
    override fun getItemCount(): Int {
        return facultyModelArrayList?.size!!
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


       // var photo: ImageView? =itemView.findViewById(R.id.iv_faculty_photo)

        var name: TextView? = itemView.findViewById(R.id.tv_faculty_name)
        var phone: TextView? = itemView.findViewById(R.id.iv_faculty_photo)
        var email: TextView? = itemView.findViewById(R.id.iv_faculty_email)


    }



}

