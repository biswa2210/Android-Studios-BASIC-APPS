package com.example.kgtolb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText kgIn;
    Button submit;
    TextView pound;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kgIn=(EditText) findViewById(R.id.kgIn);
        submit=(Button)findViewById(R.id.button);
        pound=(TextView)findViewById(R.id.output);
        iv=(ImageView)findViewById(R.id.KgImg);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kgIn.getText().toString().isEmpty()){
                    pound.setText("Empty Input Value\nTry Again");

                }
                else{
                Log.d("input",kgIn.getText().toString()+"kg");
                Log.d("output",(Double.parseDouble(kgIn.getText().toString())*2.205)+"lbs");
                pound.setText("-: POUND VALUE :- \n"+String.format("%.2f",(Double.parseDouble(kgIn.getText().toString())*2.205))+"lbs");
                iv.setImageResource(R.drawable.lbicon);
                }

            }
        });

    }
    public void onClickOnKgIn(View view){
        Log.d("Response","Clicked Kg Input Editable Text ");
        iv=(ImageView)findViewById(R.id.KgImg);
        iv.setImageResource(R.drawable.kgicon);
    }
}