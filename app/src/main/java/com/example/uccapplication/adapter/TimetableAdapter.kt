package com.example.uccapplication.adapter

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.example.uccapplication.R
import com.example.uccapplication.models.TimetableModel

class TimetableAdapter():RecyclerView.Adapter<TimetableAdapter.ViewHolder>() {


    private var timetableModelArrayList: ArrayList<TimetableModel>? = ArrayList()
    var context: Context? = null

    constructor(parcel: Parcel) : this() {

    }

    constructor(list: ArrayList<TimetableModel>, context: Context) : this() {
        this.timetableModelArrayList = list
        this.context = context
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_timetable, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var timetableModel: TimetableModel = timetableModelArrayList?.get(position)!!
        holder.courseCode.text = timetableModelArrayList?.get(position)?.courseCode

    }


    override fun getItemCount(): Int {
        return timetableModelArrayList?.size!!
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var courseCode: TextView = itemView.findViewById(R.id.tv_courseCode)
    }

}



