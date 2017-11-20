package com.example.profesoresi.appintentresultados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static final int NOMBRE = 0;
    private static final int APELLIDO = 1;
    public static final String RESULTADO = "RESULTADO";

    TextView txvNombre, txvApellido;
    Button btnNombre, btnApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvNombre = (TextView)findViewById(R.id.txvNombre);
        txvApellido = (TextView)findViewById(R.id.txvApellido);
        btnNombre = (Button)findViewById(R.id.btnNombre);
        btnApellido = (Button)findViewById(R.id.btnApellido);
    }

    public void introducirNombre(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivityForResult(i, NOMBRE);
    }

    public void introducirApellido(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivityForResult(i, APELLIDO);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {

            String res = data.getStringExtra(RESULTADO);
            if (requestCode == NOMBRE) {
                txvNombre.setText(res);
            } else {
                txvApellido.setText(res);
            }

        } else {
            Toast.makeText(this,"Resultado cancelado",Toast.LENGTH_LONG).show();

        }
    }
}
