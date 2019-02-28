package com.example.ashimghimire.notepad;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class EditorActivity extends AppCompatActivity {

    EditText titleText;
    EditText subjectText;
    EditText descText;


    Spinner prioritySpin;
    int      priority;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);
        createSpinner();
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    private void createSpinner() {
        prioritySpin = findViewById(R.id.editor_note_priority);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.priorityArray, android.R.layout.simple_spinner_item);

        prioritySpin.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.actnSave:



                break;

            default: super.onOptionsItemSelected(item);
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_editor, menu);
        return true;
    }
}
