package com.example.profesoresi.appintentexplicito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText)findViewById(R.id.etxNombre);
        btn = (Button)findViewById(R.id.btnEntrar);
    }

    public void nuevaPantalla(View v){
        Intent intent = new Intent(this, Activity2.class);

        intent.putExtra("Nombre",et.getText().toString());

        startActivity(intent);
    }

}
