package com.example.ashimghimire.notepad;

import android.app.Application;

import com.example.ashimghimire.notepad.AppNoteDataBase;
import com.example.ashimghimire.notepad.Note;
import com.example.ashimghimire.notepad.NoteDao;

import java.util.List;

import androidx.lifecycle.LiveData;

public class NoteRepertoire {
    private NoteDao notedao;
    private LiveData<List<Note>> allNotes;

    public NoteRepertoire(Application application) {
        AppNoteDataBase database = AppNoteDataBase.getDAOInstance(application);
        notedao = database.noteDao();
        allNotes = notedao.getAllNotes();
    }

    public void insert(Note note) {

    }


    public LiveData<List<Note>> getAllNotes() {
        return allNotes;
    }


///////////////////////////Insert Thread



//
//    public void delete(Note note) {
//        Thread t1 = new Thread(new DeleteThreadClass(notedao, note));
//        t1.start();
//    }
//
//    public void update(Note note) {
//
//        Thread t1 = new Thread(new UpdateThreadClass(notedao, note));
//        t1.start();
//    }
//
//    public void deleteAll() {
//
//        Thread t1 = new Thread(new DeleteAllNoteThreadClass(notedao));
//        t1.start();
//    }
//    ///////////////////////////Update Thread
//    private static class UpdateThreadClass implements Runnable {
//        private NoteDao notedao;
//        private Note note;
//
//        public UpdateThreadClass(NoteDao notedao, Note note) {
//            this.notedao = notedao;
//            this.note = note;
//        }
//
//        @Override
//        public void run() {
//            notedao.update(note);
//
//        }
//    }
//
//
//    ///////////////////////////Delete Thread
//    private static class DeleteThreadClass implements Runnable {
//        private NoteDao notedao;
//        private Note note;
//
//        public DeleteThreadClass(NoteDao notedao, Note note) {
//            this.notedao = notedao;
//            this.note = note;
//        }
//
//        @Override
//        public void run() {
//            notedao.delete(note);
//
//        }
//    }
//
//    ///////////////////////////Delete All Note Thread
//    private static class DeleteAllNoteThreadClass implements Runnable {
//        private NoteDao notedao;
//
//
//        public DeleteAllNoteThreadClass(NoteDao notedao) {
//            this.notedao = notedao;
//
//        }
//
//        @Override
//        public void run() {
//            notedao.deleteAllNotes();
//
//        }
//    }


}






/*
    private RunnableThreadClass runner;
    private Note note;
    private NoteDao notedao;
    public ThreadCallingClass(NoteDao notedao, Note note) {
        this.notedao=notedao;
        this.note=note;
        runner=new RunnableThreadClass(notedao,note);
        runner.start();

    }
*/