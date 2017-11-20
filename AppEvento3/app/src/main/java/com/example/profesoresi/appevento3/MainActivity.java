package com.example.profesoresi.appevento3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Context contexto;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botonClick(View v) {
        tv = (TextView)findViewById(R.id.txvSaludo);
        tv.setText("¡Hola Mundo!");

        contexto = getApplicationContext();
        int duracion = Toast.LENGTH_LONG;
        toast = Toast.makeText(contexto, R.string.mensaje, duracion);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();


    }
}
