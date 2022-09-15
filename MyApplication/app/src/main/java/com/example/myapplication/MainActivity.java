package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3;
    EditText e;
    Button bt;
    Integer a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = (EditText) findViewById(R.id.editTextTextPersonName);
        bt=(Button) findViewById(R.id.button);
        t3=(TextView) findViewById(R.id.textView4);
        t2=(TextView) findViewById(R.id.textView);
        t1=(TextView) findViewById(R.id.textView2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(t2.getText().toString());
                b= Integer.parseInt(t1.getText().toString());
                d=Integer.parseInt(e.getText().toString());
                c=a+b;
                if(c==d) {
                    t3.setText("You won");
                }
                else {
                    t3.setText("You failed");
                }

            }
        });
    }
}