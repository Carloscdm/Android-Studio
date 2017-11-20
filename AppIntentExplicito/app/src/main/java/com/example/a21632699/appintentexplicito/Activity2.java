package com.example.a21632699.appintentexplicito;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by 21632699 on 18/10/2017.
 */

public class Activity2 extends AppCompatActivity {
    TextView tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2layout);
        tv=(TextView)findViewById(R.id.etxNombre);

        String nombre =getIntent().getStringExtra("nombre");
        tv.setText("Bienvenido "+ nombre);

    }

}
