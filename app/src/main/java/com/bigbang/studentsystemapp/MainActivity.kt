package com.bigbang.studentsystemapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.bigbang.studentsystemapp.model.Student
import com.bigbang.studentsystemapp.model.db.SchoolDatabase


class MainActivity : AppCompatActivity() {
    lateinit var schoolDatabase: SchoolDatabase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        schoolDatabase = Room.databaseBuilder(
            this,
            SchoolDatabase::class.java,
            "school.db"
        )
            .allowMainThreadQueries()
            .build()

        Log.d("TAG_X", "on probation -> "+schoolDatabase.getSchoolDAO().getStudentsAboveGPA(3.0)[0].studentName)


        schoolDatabase.getSchoolDAO().callForAssembly().forEach{ student ->

            Log.d("TAG_X", "${student.studentName} is present!!")
        }
    }
}