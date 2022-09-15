package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    Button b1,b2,b3,b4;
    EditText e1,e2;
    int a,b,c=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView3);
        t3 = (TextView) findViewById(R.id.textView5);
        t4 = (TextView) findViewById(R.id.textView6);
        t5 = (TextView) findViewById(R.id.textView2);
        e1 = (EditText) findViewById(R.id.editTextTextPersonName);
        e2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              a=Integer.parseInt(e1.getText().toString());

                b= Integer.parseInt(e2.getText().toString());
                c=a+b;
                t4.setText(Integer.toString(c));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(t2.getText().toString());
                b= Integer.parseInt(t1.getText().toString());
                c=a-b;
                t4.setText(Integer.toString(c));

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(t2.getText().toString());
                b= Integer.parseInt(t1.getText().toString());
                c=a/b;
                if(b==0){
                    Toast toast=Toast.makeText(MainActivity.this,"Division by zero is not possible",Toast.LENGTH_LONG);
                }
                else{
                    t4.setText(Integer.toString(c));
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(t2.getText().toString());
                b= Integer.parseInt(t1.getText().toString());
                c=a*b;
                t4.setText(Integer.toString(c));

            }
        });
    }
}