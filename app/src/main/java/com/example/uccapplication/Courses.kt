package com.example.uccapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uccapplication.databinding.ActivityCoursesBinding
import com.example.uccapplication.databinding.ActivityMainBinding

class Courses : AppCompatActivity() {


    private lateinit var binding: ActivityCoursesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)


    }
}