package com.example.a21632699.appmenu;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cl = (ConstraintLayout)findViewById(R.id.clContenedor);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menumain, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.action_settings) {
            Toast.makeText(this, "Se ha pulsado el botón settings del menú", Toast.LENGTH_LONG).show();
        } else if(item.getItemId()==R.id.menu_green){
            crear_dialogo("Verde").show();
            cl.setBackgroundColor(Color.GREEN);
        }else if(item.getItemId()==R.id.menu_rojo){
            cl.setBackgroundColor(Color.RED);
            crear_dialogo("Rojo").show();
        }else if(item.getItemId()==R.id.menu_salir){
            crear_dialogo_Sin().show();

        }
        return(true);
    }
    private Dialog crear_dialogo(String mg){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage(mg);
        return builder.create();
    }
    private Dialog crear_dialogo_Sin(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setCancelable(false);
        builder.setMessage("¿Desea reiniciar el contador?");
        builder.setPositiveButton("Aceptar",    new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        return builder.create();
    }



}
