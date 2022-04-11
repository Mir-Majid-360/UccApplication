package com.example.uccapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.uccapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivTimeTable.setOnClickListener {
            val intent = Intent(this, TimeTable::class.java)
            startActivity(intent)
        }
        binding.ivCourses.setOnClickListener {
            val intent = Intent(this, Courses::class.java)
            startActivity(intent)
        }
        binding.ivAdmission.setOnClickListener {
            val intent = Intent(this, Admissions::class.java)
            startActivity(intent)
        }
        binding.ivFacultyDirectory.setOnClickListener {
            val intent = Intent(this, FacultyDirectory::class.java)
            startActivity(intent)
        }


    }

}