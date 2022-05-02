package com.example.p2app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button save;
    ArrayList<String> addArray = new ArrayList<>();
    EditText text;
    ListView showText;

    Button save2;
    ArrayList<String> addArray2 = new ArrayList<>();
    EditText text2;
    ListView showText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.editTextTextPersonName);
        showText = (ListView) findViewById(R.id.list);
        save = (Button) findViewById(R.id.button);

        save.setOnClickListener(view -> {
            String getInput = text.getText().toString();

            if (addArray.contains(getInput)){
                Toast.makeText(MainActivity.this, "" +
                        "Allerede tilføjet", Toast.LENGTH_SHORT).show();
            }
            else if (getInput.trim().equals("")){
                Toast.makeText(MainActivity.this, "Ingen tekst", Toast.LENGTH_SHORT).show();
            }
            else {
                addArray.add(getInput);
                ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, addArray);
                showText.setAdapter(adapter);
                ((EditText)findViewById(R.id.editTextTextPersonName)).setText("");
            }
        });

        text2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        showText2 = (ListView) findViewById(R.id.list2);
        save2 = (Button) findViewById(R.id.button2);

        save2.setOnClickListener(view -> {
            String getInput = text2.getText().toString();

            if (addArray2.contains(getInput)){
                Toast.makeText(MainActivity.this, "Allerede tilføjet", Toast.LENGTH_SHORT).show();
            }
            else if (getInput.trim().equals("")){
                Toast.makeText(MainActivity.this, "Ingen tekst", Toast.LENGTH_SHORT).show();
            }
            else {
                addArray2.add(getInput);
                ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, addArray2);
                showText2.setAdapter(adapter);
                ((EditText)findViewById(R.id.editTextTextPersonName2)).setText("");
            }
        });
    }
}
