package com.bigbang.studentsystemapp.model.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.bigbang.studentsystemapp.model.Student

@Dao
interface StudentDAO {

    @Insert
    fun registerNewStudent(student: Student)

    @Query("SELECT * FROM students WHERE student_gpa < :gpa")
    fun getStudentsAboveGPA(gpa: Double) : List<Student>

    @Delete
    fun unregisterStudent(student: Student)

    @Query("SELECT * FROM students")
    fun callForAssembly() : List<Student>

}