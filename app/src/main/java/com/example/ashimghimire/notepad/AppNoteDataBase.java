package com.example.ashimghimire.notepad;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities =  Note.class, version = 1, exportSchema = false)
public abstract class AppNoteDataBase extends RoomDatabase {


    public  abstract NoteDao noteDao();
    private static AppNoteDataBase dAOInstance;
    public static synchronized AppNoteDataBase getDAOInstance(Context c){
        if(dAOInstance==null)
        {
            dAOInstance= Room.databaseBuilder(c.getApplicationContext(),AppNoteDataBase.class,
                          "table_note").fallbackToDestructiveMigration().build();
        }

        return dAOInstance;

    }




}
