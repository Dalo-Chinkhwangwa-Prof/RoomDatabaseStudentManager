package com.bigbang.studentsystemapp.model.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bigbang.studentsystemapp.model.Student

@Database(version = 1, entities = [Student::class])
abstract class SchoolDatabase: RoomDatabase() {
    abstract fun getSchoolDAO(): StudentDAO
}