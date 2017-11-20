package com.example.a21632699.appintentexplicito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnEntrar;
    EditText etxNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        etxNombre = (EditText) findViewById(R.id.etxNombre);
    }

    public void nuevaPantalla (View v){
        Intent intent = new Intent(this, Activity2.class);

        intent.putExtra("Nombre",etxNombre.getText().toString());

        startActivity(intent);
    }

}
