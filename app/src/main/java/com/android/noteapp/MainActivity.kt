package com.android.noteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.android.noteapp.screen.NoteScreen
import com.android.noteapp.screen.NoteViewModel
import com.android.noteapp.ui.theme.NoteAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoteAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                   val noteViewModel : NoteViewModel by viewModels()
                    NotesApp(noteViewModel = noteViewModel)

                }
            }
        }
    }
}

@Composable
fun NotesApp(noteViewModel: NoteViewModel = viewModel()){
    val noteList = noteViewModel.getAllNotes()
    NoteScreen(notes = noteList,
        onAddNote = {noteViewModel.addNote(it)} ,
        onRemoveNote = {noteViewModel.removeNote(it)}
    )
}