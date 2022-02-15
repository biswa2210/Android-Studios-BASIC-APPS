package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public Button btngo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngo=(Button)findViewById(R.id.gobtn);

        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText user=(EditText)findViewById(R.id.editTextTextPersonName);
                String usernm=user.getText().toString();
                Intent intent=new Intent(MainActivity.this,convertionactivity.class);
                intent.putExtra("User",usernm);
                startActivity(intent);
            }
        });
    }
}