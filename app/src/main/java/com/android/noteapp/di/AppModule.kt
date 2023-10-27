package com.android.noteapp.di

import android.content.Context
import androidx.room.Room
import com.android.noteapp.data.NoteDateBase
import com.android.noteapp.data.NoteDateBaseDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Singleton
    @Provides
    fun provideNotesDao(noteDateBase: NoteDateBase) : NoteDateBaseDao
    = noteDateBase.noteDao()

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context) : NoteDateBase
    = Room.databaseBuilder(
        context,
        NoteDateBase::class.java ,
        "notes_db")
        .fallbackToDestructiveMigration()
        .build()
}


