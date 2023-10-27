package com.android.noteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.android.noteapp.model.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDateBase : RoomDatabase(){
    abstract fun noteDao(): NoteDateBaseDao
}