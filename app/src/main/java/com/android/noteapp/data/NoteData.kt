package com.android.noteapp.data

import com.android.noteapp.model.Note

class NoteDataSource {
    fun loadNotes(): List<Note>{
        return listOf(
            Note(title = "A good day", description = "we went to a vacation on that day and it was fun."),
            Note(title = "Android Compose", description = "Wowww!! I just love to work on android and also enjoy it."),
            Note(title = "Android Compose", description = "Wowww!! I just love to work on android and also enjoy it."),
            Note(title = "Talkative Girls", description = "Bhavna & Komal are very talkative and they create so much disturbance"),
            Note(title = "A movie day", description = "I like this movie but i think it can be more interesting if they made some changes"),
            Note(title = "A good day", description = "we went to a vacation on that day and it was fun."),
            Note(title = "Android Compose", description = "Wowww!! I just love to work on android and also enjoy it."),
            Note(title = "Android Compose", description = "Wowww!! I just love to work on android and also enjoy it."),
            Note(title = "Talkative Girls", description = "Bhavna & Komal are very talkative and they create so much disturbance"),
            Note(title = "A movie day", description = "I like this movie but i think it can be more interesting if they made some changes"),
            Note(title = "Project work", description = "hdkssssssssssssdnkfd")
        )
    }
}