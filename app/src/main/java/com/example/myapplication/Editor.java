package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;

public class Editor extends AppCompatActivity {

    EditText test_title,test_note;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        test_title = findViewById(R.id.test_one);
        test_note = findViewById(R.id.test_two);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please Wait ...");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.save:
                saveNote();
                return true;
            default:
                return super.onContextItemSelected(item);
        }

    }

    private void saveNote() {
        progressDialog.show();
    }
}