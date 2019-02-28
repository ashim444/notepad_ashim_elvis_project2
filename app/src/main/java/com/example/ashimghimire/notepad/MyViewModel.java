package com.example.ashimghimire.notepad;

import android.app.Application;

//import com.example.ashimghimire.notepad.data.Note;

import java.util.List;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class MyViewModel extends AndroidViewModel {

    private NoteRepertoire repertoire;
    private LiveData<List<Note>> allNotes;
    public MyViewModel(Application application) {
        super(application);
        repertoire=new NoteRepertoire(application);
        allNotes=repertoire.getAllNotes();

    }

    public void insert(Note note){
        repertoire.insert(note);

    }

//    public void delete(Note note){
//        repertoire.delete(note);
//
//    }
//    public void deleteAll(){
//        repertoire.deleteAll();
//    }
//
//    public void update(Note note){
//        repertoire.update(note);
//    }

    public LiveData<List<Note>> getAllNotes(){
        return allNotes;
    }
}
