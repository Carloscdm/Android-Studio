package com.example.profesoresi.appevento2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    Button boton;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button)findViewById(R.id.btnSaludar);
        boton.setOnClickListener(this);

    }

    public void onClick(View v) {
        tv = (TextView)findViewById(R.id.txvSaludo);
        tv.setText("¡Hola Mundo!");
    }
}
