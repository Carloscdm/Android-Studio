package com.example.a21632699.intentimplicitos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edText;
    Button butLLam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edText = (EditText)findViewById(R.id.editTextNum);
        butLLam = (Button)findViewById(R.id.buttonLlamada);
    }

    public void realizarLlamada (View view) {
        String stelf = edText.getText().toString();

        Uri telf = Uri.parse("telf: "+ stelf);
        Intent llamada = new Intent(Intent.ACTION_DIAL, telf);
        if (llamada.resolveActivity(getPackageManager()) != null) {
            startActivity(llamada);
        }

    }
}
