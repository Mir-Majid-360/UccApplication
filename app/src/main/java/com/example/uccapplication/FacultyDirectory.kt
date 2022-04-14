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

        facultyAdapter = FacultyAdapter(facultyModelArrayList,this)



       binding.idRvFaculties
           .layoutManager = LinearLayoutManager(this)
        binding.idRvFaculties .adapter = facultyAdapter

        setFaculty()
    }


    private fun setFaculty() {

        facultyModelArrayList?.add(FacultyModel("name", "+919149636663", "mirmajid727@gmail.com"))
        facultyModelArrayList?.add(FacultyModel("majid", "+919149636663", "mirmajid360@gmail.com"))
        facultyModelArrayList?.add(FacultyModel("naseer", "+919149636663", "naseerrather58@gmail.com"))
        facultyModelArrayList?.add(FacultyModel("mehraj", "+919149636663", "mehrajb33@gmail.com"))
        facultyModelArrayList?.add(FacultyModel("anyone", "+919149636663", "anyonr123@gmail.com"))


    }
}



