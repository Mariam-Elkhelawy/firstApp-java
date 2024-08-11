package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = findViewById(R.id.myFirstTextView);
        myTextView.setText("Hello from java!");
        EditText myEditText = findViewById(R.id.editText);
        String input =myEditText.getText().toString();
        Button button = findViewById(R.id.myBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Toast.makeText(MainActivity.this,
                     "You Clicked the button",
                     Toast.LENGTH_SHORT).show();
            }
        });

    }
}