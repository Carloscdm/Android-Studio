package com.example.profesoresi.appintentresultados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText etxDato;
    Button btnOk, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etxDato = (EditText)findViewById(R.id.etxDato);
        btnOk = (Button)findViewById(R.id.btnOk);
        btnCancel = (Button)findViewById(R.id.btnCancel);
    }

    public void enviarDato(View v) {
        String dato = etxDato.getText().toString();

        Intent i = getIntent();
        i.putExtra("RESULTADO", dato);

        setResult(RESULT_OK, i);
        finish();

    }

    public void cancelar(View v) {
        setResult(RESULT_CANCELED);
        finish();
    }
}
