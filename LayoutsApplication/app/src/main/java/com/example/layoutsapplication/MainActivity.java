package com.example.layoutsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     RadioGroup rGroup;
    RadioButton rButton1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rGroup=(RadioGroup)findViewById(R.id.rg);
        rButton1=(RadioButton) findViewById(R.id.radioButton);
        b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedID=rGroup.getCheckedRadioButtonId();
                rButton1=(RadioButton) findViewById(selectedID);
                Toast.makeText(MainActivity.this,rButton1.getText(),Toast.LENGTH_SHORT).show();
                if(rButton1.getText().equals("Relative")){
                    Intent in = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(in);
                }
            }
        });
    }

}