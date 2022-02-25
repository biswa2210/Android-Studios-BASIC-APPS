package com.example.namerollprint;
/*
CREATED BY BISWARUP BHATTACHARJEE
EMAIL    : bbiswa471@gmail.com
PHONE NO : 6290272740
*/
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText nmIn;
    EditText rollIn;
    EditText sec;
    EditText enroll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button)findViewById(R.id.Submitbutton);
        nmIn=(EditText)findViewById(R.id.nameInput);
        rollIn=(EditText)findViewById(R.id.rollInput);
        sec=(EditText)findViewById(R.id.sectionInput);
        enroll=(EditText)findViewById(R.id.enrollInput);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ButtonResponse(nmIn.getText().toString().trim(),rollIn.getText().toString().trim(),sec.getText().toString().trim(),enroll.getText().toString().trim());//Actual Parameter
            }
        });
    }
    public void ButtonResponse(String nmstr,String rollin,String sec,String enroll)//Formal Parameter
    {
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("name",nmstr);
        intent.putExtra("roll",rollin);
        intent.putExtra("section",sec);
        intent.putExtra("enroll",enroll);
        startActivity(intent);
    }
}
