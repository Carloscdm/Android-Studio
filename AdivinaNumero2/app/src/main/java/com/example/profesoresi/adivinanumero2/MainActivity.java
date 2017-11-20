package com.example.profesoresi.adivinanumero2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etxNom, etxInt;
    Button btnAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxNom = (EditText)findViewById(R.id.etxNombre);
        etxInt = (EditText)findViewById(R.id.etxIntentos);
        btnAcc = (Button)findViewById(R.id.btnAcceder);
    }

    public void acceder(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("NOMBRE", etxNom.getText().toString());
        i.putExtra("INTENTOS", Integer.parseInt(etxInt.getText().toString()));

        startActivity(i);
    }
}
