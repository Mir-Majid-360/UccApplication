package com.example.uccapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uccapplication.adapter.FacultyAdapter
import com.example.uccapplication.databinding.ActivityFacultyDirectoryBinding
import com.example.uccapplication.models.FacultyModel


class FacultyDirectory : AppCompatActivity() {


    private lateinit var binding: ActivityFacultyDirectoryBinding


    private  var facultyModelArrayList: ArrayList<FacultyModel> = ArrayList()
    private var facultyAdapter: FacultyAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFacultyDirectoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // Activity Title
        binding.toolbar.tvToolbar.text ="Faculty Directory"

        facultyAdapter = FacultyAdapter(facultyModelArrayList,this)



       binding.idRvFaculties
           .layoutManager = LinearLayoutManager(this)
        binding.idRvFaculties .adapter = facultyAdapter

        setFaculty()
    }


    private fun setFaculty() {

        facultyModelArrayList?.add(FacultyModel("Natalie Rose", "+876", "ithod@ucc.edu.jm"))
        facultyModelArrayList?.add(FacultyModel("Otis Osbourne", "+876", "oosbourne@faculty.ucc.edu.jm"))
        facultyModelArrayList?.add(FacultyModel("Neil Williams", "+876", "nwilliams@faculty.ucc.edu.jm"))
        facultyModelArrayList?.add(FacultyModel("Henry Osbourne", "+876", "hosbourne@faculty.ucc.edu.jm"))
        facultyModelArrayList?.add(FacultyModel("Cecil White", "+876", "cwhite@faculty.ucc.edu.jmm"))
        facultyModelArrayList?.add(FacultyModel("Stephen Gentles", "+876", "sgentles@faculty.ucc.edu.jm"))
        facultyModelArrayList?.add(FacultyModel("Rochelle McBean", "+876", "rmcbean@faculty.ucc.edu.jm"))
        facultyModelArrayList?.add(FacultyModel("Karen Wilson", "+876", "kwilson@faculty.ucc.edu.jm"))
        facultyModelArrayList?.add(FacultyModel("Bryanna Chang", "+876", "bchang@faculty.ucc.edu.jm"))
        facultyModelArrayList?.add(FacultyModel("Shanae Owen", "+876", "sowens@faculty.ucc.edu.jm"))


    }
}



