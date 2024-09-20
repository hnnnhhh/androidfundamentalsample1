package com.example.androidfundamentalsample1;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btnSubmit;
    TextView tvOutput;

    //change 1 sample

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.et_name);
        btnSubmit = findViewById(R.id.btn_submit);
        tvOutput = findViewById(R.id.tv_output);

        //on click listener of button
        btnSubmit.setOnClickListener(v -> {
            // get the value of etName
            String name = etName.getText().toString();
            tvOutput.setText(String.format("hello %s", name));
        });

    }
}