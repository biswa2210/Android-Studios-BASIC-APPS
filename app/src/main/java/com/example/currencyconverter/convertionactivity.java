package com.example.currencyconverter;
/*
CREATED BY BISWARUP BHATTACHARJEE
EMAIL    : bbiswa471@gmail.com
PHONE NO : 6290272740
*/
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.math.BigDecimal;
public class convertionactivity extends AppCompatActivity {
    public TextView usertxt;
    public Button rublebtn;
    public Button kdinnarbtn;
    public Button pobtn;
    public Button dollarbtn;
    public Button erobtn;
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertionactivity);
        String username=getIntent().getStringExtra("User");
        usertxt=(TextView)findViewById(R.id.usernmtxt);
        usertxt.setText("Welcome "+username);
        rublebtn=(Button)findViewById(R.id.rubbtn);
        rublebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rublebtn.animate().rotationXBy(360).start();
                EditText rupees=(EditText)findViewById(R.id.editTextNumber3);
                String rupes=rupees.getText().toString();
                double rs=Double.parseDouble(rupes);
                double ruble=rs/1.02;
                BigDecimal rub = new BigDecimal(ruble).setScale(2, RoundingMode.HALF_UP);
                String rubles=Double.toString(rub.doubleValue());
                try {
                    Thread.sleep(3*1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                Intent intent=new Intent(convertionactivity.this,successfullconvertion.class);
                intent.putExtra("Ruble",rubles);
                startActivity(intent);
            }
        });
        kdinnarbtn=(Button)findViewById(R.id.kdbtn);
        kdinnarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kdinnarbtn.animate().rotationXBy(360).start();
                EditText rupees=(EditText)findViewById(R.id.editTextNumber3);
                String rupes=rupees.getText().toString();
                double rs=Double.parseDouble(rupes);
                double kd=rs/244.64;
                BigDecimal kdin=new BigDecimal(kd).setScale(2,RoundingMode.HALF_UP);
                String kds=Double.toString(kdin.doubleValue());
                Intent intent=new Intent(convertionactivity.this,successfullconvertion.class);
                intent.putExtra("Kdinnar",kds);
                startActivity(intent);
            }
        });
        pobtn=(Button)findViewById(R.id.poundbtn);
        pobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pobtn.animate().rotationXBy(360).start();
                EditText rupees=(EditText)findViewById(R.id.editTextNumber3);
                String rupes=rupees.getText().toString();
                double rs=Double.parseDouble(rupes);
                double pound=rs/98.29;
                BigDecimal pds=new BigDecimal(pound).setScale(2,RoundingMode.HALF_UP);
                String pounds=Double.toString(pds.doubleValue());
                Intent intent=new Intent(convertionactivity.this,successfullconvertion.class);
                intent.putExtra("Pounds",pounds);
                startActivity(intent);
            }
        });
        dollarbtn=(Button)findViewById(R.id.usdbtn);
        dollarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dollarbtn.animate().rotationXBy(360).start();
                EditText rupees=(EditText)findViewById(R.id.editTextNumber3);
                String rupes=rupees.getText().toString();
                double rs=Double.parseDouble(rupes);
                double usd=rs/74.82;
                BigDecimal usds=new BigDecimal(usd).setScale(2,RoundingMode.HALF_UP);
                String usudollar=Double.toString(usds.doubleValue());
                Intent intent=new Intent(convertionactivity.this,successfullconvertion.class);
                intent.putExtra("Usd",usudollar);
                startActivity(intent);
            }
        });
        erobtn=(Button)findViewById(R.id.eurobtn);
        erobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                erobtn.animate().rotationXBy(360).start();
                EditText rupees=(EditText)findViewById(R.id.editTextNumber3);
                String rupes=rupees.getText().toString();
                double rs=Double.parseDouble(rupes);
                double erobtn=rs/88.98;
                BigDecimal erobtns=new BigDecimal(erobtn).setScale(2,RoundingMode.HALF_UP);
                String euro=Double.toString(erobtns.doubleValue());
                Intent intent=new Intent(convertionactivity.this,successfullconvertion.class);
                intent.putExtra("Euro",euro);
                startActivity(intent);
            }
        });


    }
}
