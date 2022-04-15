package com.example.uccapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uccapplication.adapter.CoursesAdapter
import com.example.uccapplication.databinding.ActivityCoursesBinding
import com.example.uccapplication.models.CourseModel

class Courses : AppCompatActivity() {


    private lateinit var binding: ActivityCoursesBinding
    private  var coursesModelArrayList : ArrayList<CourseModel> = ArrayList()
    private  var coursesAdapter: CoursesAdapter?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        binding = ActivityCoursesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        coursesAdapter = CoursesAdapter(coursesModelArrayList,this)

        binding.idRVCourses.layoutManager = LinearLayoutManager(this)
        binding.idRVCourses.adapter = coursesAdapter


        setCourses()
    }

   private  fun setCourses(){


       coursesModelArrayList.add(CourseModel("MTH103","Discrete Mathematics","3","ITT102 Discrete Mathematics","Semester 2nd"))
       coursesModelArrayList.add(CourseModel("ITT403","Data Communication and Networks II","3","ITT201 Data Communication and Networks I","Semester 3rd"))
       coursesModelArrayList.add(CourseModel("ITT411","Project +","0","None","Semester 8th"))
       coursesModelArrayList.add(CourseModel("ITT303","JAVA","3","ITT200  C++","Semester Ist"))
       coursesModelArrayList.add(CourseModel("ITT405","Human Computer Interaction & Interface Design","3","PSY100 Introduction to Psychology, ITT205 System Analysis and Design","Semester 6th"))
       coursesModelArrayList.add(CourseModel("ITT401","Intelligent System","3","ITT300 Discrete Mathematics II","Semester 7th"))
       coursesModelArrayList.add(CourseModel("MTH103","Discrete Mathematics","3","ITT102 Discrete Mathematics","Semester 8th"))


   }
}