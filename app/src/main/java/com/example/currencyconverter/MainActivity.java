package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button Euro,Dollar,Pound,Rubel,AusDollar,CanDollar,Yen,Dinar,Bitcoin;

    EditText editText;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);

        textView = findViewById(R.id.textView);

        Euro = findViewById(R.id.euro);
        Dollar = findViewById(R.id.dollar);
         Pound = findViewById(R.id.pound);

          Rubel = findViewById(R.id.rubel);
           AusDollar = findViewById(R.id.aus_dollar);
            CanDollar = findViewById(R.id.can_dollar);

             Yen = findViewById(R.id.yen);
              Dinar = findViewById(R.id.dinar);
               Bitcoin = findViewById(R.id.bit_coin);


            Euro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String e =  editText.getText().toString();

                    if(TextUtils.isEmpty(e)){

                        editText.setError("Empty user input.");
                    }
                    else{

                        double a,b;

                        a=Double.parseDouble(e);
                        editText.setText(null);

                        Formatter formatter = new Formatter();

                        b=a*0.012;

                       DecimalFormat numberFormat = new DecimalFormat("#.00");

                        textView.setText(""+numberFormat.format(b));

                        //textView.setText(""+b);
                    }
                }
            });

            Dollar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String d = editText.getText().toString();

                    if(TextUtils.isEmpty(d)){

                        editText.setError("Noting to convert.");
                    }else{

                        double a,b;

                        a=Double.parseDouble(d);

                        editText.setText(null);

                        Formatter formatter = new Formatter();

                        b = a*0.014;

                        DecimalFormat numberFormat = new DecimalFormat("#.00");

                        textView.setText(""+numberFormat.format(b));


                    }
                }
            });

        Pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String p = editText.getText().toString();

                if(TextUtils.isEmpty(p)){

                    editText.setError("Empty input.");
                }
                else{

                    double a,b;

                    a = Double.parseDouble(p);
                   editText.setText(null);

                    Formatter formatter = new Formatter();

                    b =a*0.011;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");

                    textView.setText(""+numberFormat.format(b));


                }
            }
        });

        Rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String r = editText.getText().toString();

                if(TextUtils.isEmpty(r)){

                    editText.setText("Empty input.");
                }
                else{

                    double a,b;

                    a = Double.parseDouble(r);

                    editText.setText(null);

                    Formatter formatter = new Formatter();

                    b = a*0.90;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");


                    textView.setText(""+numberFormat.format(b));

                }
            }
        });

        AusDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String aus = editText.getText().toString();

                if(TextUtils.isEmpty(aus)){

                    editText.setText("Empty input");
                }
                else{

                    double a,b;

                    a = Double.parseDouble(aus);

                    editText.setText(null);

                    Formatter formatter = new Formatter();

                    b = a*0.026;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");

                    textView.setText(""+numberFormat.format(b));
                }
            }
        });

        CanDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String can = editText.getText().toString();

                if(TextUtils.isEmpty(can)){

                    editText.setError("Empty Input");
                }
                else{

                    double a,b;

                    a = Double.parseDouble(can);
                    editText.setText(null);

                    Formatter formatter = new Formatter();

                    b = a*0.019;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(b));
                }
            }
        });

        Yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String y = editText.getText().toString();

                if(TextUtils.isEmpty(y)){

                    editText.setError("Empty Input.");
                }
                else{

                    double a,b;

                    a = Double.parseDouble(y);
                    editText.setText(null);

                    Formatter formatter =new Formatter();

                    b = a*1.54;

                    DecimalFormat numberFormat =new DecimalFormat("#.00");

                    textView.setText(""+numberFormat.format(b));
                }

            }
        });

        Dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String d = editText.getText().toString();

                if(TextUtils.isEmpty(d)){

                   editText.setError("Empty Input.");
                }
                else{

                    double a,b;

                    a = Double.parseDouble(d);
                    editText.setText(null);

                    Formatter formatter = new Formatter();

                    b = a*0.0044;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");

                    textView.setText(""+numberFormat.format(b));
                }
            }
        });

        Bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String bit = editText.getText().toString();

                if(TextUtils.isEmpty(bit)){

                    editText.setText("Empty Input.");
                }
                else{

                    double a,b;

                    a = Double.parseDouble(bit);
                    editText.setText(null);

                    Formatter formatter = new Formatter();

                    b = a*0.0000013;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");

                    textView.setText(""+numberFormat.format(b));

                }
            }
        });








    }
}
