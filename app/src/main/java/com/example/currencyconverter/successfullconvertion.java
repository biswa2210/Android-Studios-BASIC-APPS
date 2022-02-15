package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class successfullconvertion extends AppCompatActivity {
    public TextView contxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successfullconvertion);
        String ruble=getIntent().getStringExtra("Ruble");
        String Euro=getIntent().getStringExtra("Euro");
        String kds=getIntent().getStringExtra("Kdinnar");
        String usd=getIntent().getStringExtra("Usd");
        String pounnd=getIntent().getStringExtra("Pounds");
        contxt=(TextView)findViewById(R.id.textView5);
        if (ruble!= null && !ruble.isEmpty())
            contxt.setText(ruble + " rubles");
        else if(Euro != null && !Euro.isEmpty())
            contxt.setText(Euro + " euros");
        else if(kds != null && !kds.isEmpty())
            contxt.setText(kds + " kds");
        else if(usd != null && !usd.isEmpty())
            contxt.setText(usd + " usds");
        else if(pounnd != null && !pounnd.isEmpty())
            contxt.setText(pounnd + " pounds");
    }
}