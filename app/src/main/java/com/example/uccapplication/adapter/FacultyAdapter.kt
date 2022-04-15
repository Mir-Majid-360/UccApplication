package com.example.uccapplication.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uccapplication.R
import com.example.uccapplication.adapter.FacultyAdapter.ViewHolder
import com.example.uccapplication.models.FacultyModel

class FacultyAdapter() : RecyclerView.Adapter<ViewHolder>() {


    private var facultyModelArrayList: ArrayList<FacultyModel>? = ArrayList()
    var context: Context? = null

    constructor(list: ArrayList<FacultyModel>,context: Context) : this() {
        this.facultyModelArrayList = list
        this.context = context

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_faculty_info, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


       var  facultyModel:FacultyModel = facultyModelArrayList?.get(position)!!
        holder.name?.text = facultyModelArrayList?.get(position)?.name

      // holder.phone?.setText(facultyModelArrayList?.get(position).toString())
      //  holder.email?.setText(facultyModelArrayList?.get(position).toString())



    }
    override fun getItemCount(): Int {
        Log.d("size", " "+ facultyModelArrayList?.size)
        return facultyModelArrayList?.size!!

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


       // var photo: ImageView? =itemView.findViewById(R.id.iv_faculty_photo)

        var name: TextView? = itemView.findViewById(R.id.tv_faculty_name)


    }



}

