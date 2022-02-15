package com.example.namerollprint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView nm;
    TextView roll;
    TextView section;
    TextView Enroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nm=(TextView)findViewById(R.id.nm);
        roll=(TextView)findViewById(R.id.roll);
        section=(TextView)findViewById(R.id.section);
        Enroll=(TextView)findViewById(R.id.enroll);
        nm.setText(getIntent().getStringExtra("name"));
        roll.setText(getIntent().getStringExtra("roll"));
        section.setText(getIntent().getStringExtra("section"));
        Enroll.setText(getIntent().getStringExtra("enroll"));


    }
}