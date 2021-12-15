package com.example.szendvicsek;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button searchButton, newButton;
    private EditText price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        newButton.setOnClickListener(v -> {
            Intent atlepInsert = new Intent(this, InsertActivity.class);
            startActivity(atlepInsert);
            finish();
        });
        searchButton.setOnClickListener(v->{
            Intent atlepSearch = new Intent(this, SearchResultActivity.class);
            if (!price.getText().toString().isEmpty()){
                startActivity(atlepSearch);
                finish();
            }
            else Toast.makeText(this, "A mező nem maradhat üresen!", Toast.LENGTH_SHORT).show();
        });
    }

    private void init() {
        searchButton = findViewById(R.id.searchButton);
        newButton = findViewById(R.id.newButton);
        price = findViewById(R.id.price);
    }
}