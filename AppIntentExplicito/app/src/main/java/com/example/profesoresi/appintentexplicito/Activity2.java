package com.example.profesoresi.appintentexplicito;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by profesoresi on 18/10/2017.
 */

public class Activity2 extends AppCompatActivity {

    TextView tv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        tv = (TextView)findViewById(R.id.txvSaludo);

        String nombre = getIntent().getStringExtra("Nombre");
        tv.setText("Bienvenido " + nombre);


    }

}
