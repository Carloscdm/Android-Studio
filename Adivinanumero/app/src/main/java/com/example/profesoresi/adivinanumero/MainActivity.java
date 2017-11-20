package com.example.profesoresi.adivinanumero;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int intentos = 7;
    private Random rdm = new Random();
    private int numSecreto;

    private TextView txvIntentos;
    private TextView txvPista;
    private EditText etxNumero;
    private Button btnPrueba;
    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numSecreto = rdm.nextInt(100) + 1;

        txvIntentos = (TextView)findViewById(R.id.txvIntentos);
        txvIntentos.setText(String.format(getResources().getString(R.string.intentos), intentos));
        txvPista = (TextView)findViewById(R.id.txvPista);
        etxNumero = (EditText)findViewById(R.id.etxNumero);
        btnPrueba = (Button)findViewById(R.id.btnProbar);
        layout = (RelativeLayout)findViewById(R.id.lytFondo);
    }

    public void comprobar(View view) {
        intentos--;
        boolean acertado = false;

        if (numSecreto > Integer.parseInt(etxNumero.getText().toString())) {
            txvPista.setText(getResources().getString(R.string.pista_may));
        } else if (numSecreto < Integer.parseInt(etxNumero.getText().toString())) {
            txvPista.setText(getResources().getString(R.string.pista_men));
        } else {
            txvPista.setText(getResources().getString(R.string.pista_ok));
            acertado = true;
        }

        if (acertado) {
            btnPrueba.setText(getResources().getString(R.string.boton_fin));
            btnPrueba.setEnabled(false);
            layout.setBackgroundColor(Color.parseColor("#FF57FF2C"));
        } else if (intentos == 0) {
            txvPista.setText(String.format(getResources().getString(R.string.pista_ko), numSecreto));
            btnPrueba.setText(getResources().getString(R.string.boton_fin));
            btnPrueba.setEnabled(false);
            layout.setBackgroundResource(R.color.resultadoKO);
        }
        txvIntentos.setText(String.format(getResources().getString(R.string.intentos), intentos));

    }
}
