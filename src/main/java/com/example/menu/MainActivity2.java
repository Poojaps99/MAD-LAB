package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    EditText te1,te2,te3,te4;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1=(TextView) findViewById(R.id.tv1);
        tv2=(TextView) findViewById(R.id.tv2);
        tv3=(TextView) findViewById(R.id.tv3);
        te1=(EditText) findViewById(R.id.te1);
        te2=(EditText) findViewById(R.id.te2);
        te3=(EditText) findViewById(R.id.te3);
        te4=(EditText) findViewById(R.id.te4);
        b1=(Button) findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(te1.getText().toString());
                int n2=Integer.parseInt(te2.getText().toString());
                int n3=Integer.parseInt(te3.getText().toString());
                int r=(n1*n2*n3)/100;
                te4.setText(Integer.toString(r));
            }
        });
    }
}
