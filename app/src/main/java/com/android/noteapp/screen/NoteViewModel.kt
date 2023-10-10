package com.android.noteapp.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.android.noteapp.data.NoteDataSource
import com.android.noteapp.model.Note

class NoteViewModel : ViewModel() {
    var noteList = mutableStateListOf<Note>()

    init {
        noteList.addAll(NoteDataSource().loadNotes())
    }

    fun addNote(note: Note){ noteList.add(note) }

    fun removeNote(note: Note){noteList.remove(note)}

    fun getAllNotes(): List<Note>{return noteList}
}