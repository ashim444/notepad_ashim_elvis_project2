package com.example.ashimghimire.notepad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ashimghimire.notepad.Note;
import com.example.ashimghimire.notepad.NoteAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    //AppNoteDataBase appNoteDataBase;
    private MyViewModel viewObj;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //appNoteDataBase = Room.databaseBuilder(getApplicationContext(),
          //                                AppNoteDataBase.class, "table_note").build();
        findView();

        RecyclerView recyclerView=findViewById(R.id.recyView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        final NoteAdapter theAdapter = new NoteAdapter();

        viewObj= ViewModelProviders.of(this).get(MyViewModel.class);
        viewObj.getAllNotes().observe(this, new Observer<List<Note>>() {
            @Override
            public void onChanged(List<Note> notes) {
                Toast.makeText(MainActivity.this, "asddddddas", Toast.LENGTH_LONG).show();
                theAdapter.setNotes(notes);
            }
        });
        recyclerView.setAdapter(theAdapter);




    }

    private void findView() {
        findViewById(R.id.add_note_btn).setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_note_btn:
                startActivity(new Intent(MainActivity.this, EditorActivity.class));
                break;
        }
    }
}
