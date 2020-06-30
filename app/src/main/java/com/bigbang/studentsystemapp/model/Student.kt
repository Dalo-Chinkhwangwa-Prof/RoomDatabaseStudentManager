package com.bigbang.studentsystemapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students")
data class Student(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "student_id")
    var studentID: Int,

    @ColumnInfo(name = "student_name")
    var studentName: String,

    @ColumnInfo(name = "student_gpa")
    var studentGPA: Double,

    @ColumnInfo(name = "student_course")
    var studentCourse: String
)