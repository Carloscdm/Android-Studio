package com.example.profesoresi.appevento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Utilizamos R para acceder a algún recurso
        Button btn = (Button)findViewById(R.id.boton);

        // creamos un event listener por medio de una clase anónima
        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.helloTextView);
                tv.setText("¡Hola Mundo!");
            }
        };

        // asignamos al botón el listener definido
        btn.setOnClickListener(listener);

    }
}
