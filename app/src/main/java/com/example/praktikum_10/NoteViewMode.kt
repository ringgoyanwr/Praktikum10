package com.example.praktikum_10

import Catatan.Note
import Catatan.NoteRepository
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class NoteViewMode (application: Application) : AndroidViewModel(application)
{
    private var repository: NoteRepository =
        NoteRepository(application)
    private var allNotes: LiveData<List<Note>> = repository.getAllNotes()
    fun insert(note: Note) {
        repository.insert(note)
    }
    fun update(note: Note) {
        repository.update(note)
    }
    fun delete(note: Note) {
        repository.delete(note)
    }
    fun deleteAllNotes() {
        repository.deleteAllNotes()
    }
    fun getAllNotes(): LiveData<List<Note>> {
        return allNotes
    }
}
