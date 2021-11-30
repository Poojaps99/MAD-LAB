package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity3 extends AppCompatActivity {
    TextView t1,t3,t5;
    EditText t2,t4,t6,t7;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1=(TextView) findViewById(R.id.t1);
        t3=(TextView) findViewById(R.id.t3);
        t5=(TextView) findViewById(R.id.t5);
        t2=(EditText) findViewById(R.id.t2);
        t4=(EditText) findViewById(R.id.t4);
        t6=(EditText) findViewById(R.id.t6);
        t7=(EditText) findViewById(R.id.t7);
        b2=(Button) findViewById(R.id.b2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(t2.getText().toString());
                int n2=Integer.parseInt(t4.getText().toString());
                int n3=Integer.parseInt(t6.getText().toString());
                double r=Math.pow((1+n2/100),n3)*n1;
                t7.setText(Double.toString(r));
            }
        });
    }
}
