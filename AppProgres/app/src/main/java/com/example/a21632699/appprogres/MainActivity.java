package com.example.a21632699.appprogres;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void iniciarpdh (View view){
        pd = new ProgressDialog(MainActivity.this);
        pd.setMax(100);
        pd.setMessage("Loading..."); 	pd.setTitle("ProgressDialog");
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL); 	pd.show(); // Display Progress Dialog
        pd.setCancelable(false);
        new Thread(new Runnable() {
            public void run() {
                try {
                    while (pd.getProgress() <= 					pd.getMax()) {
                        Thread.sleep(200);
                        pd.incrementProgressBy(5);
                        if (pd.getProgress() == 					pd.getMax()) {
                            pd.dismiss();
                        }
                    }
                } catch (Exception e) {}
            }
        }).start();

    }
    public void iniciarpds (View view){
        pd = new ProgressDialog(MainActivity.this);
        pd.setMessage("Loading...");
        pd.setTitle("ProgressDialog"); 	pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pd.show(); // Display Progress Dialog
        pd.setCancelable(false);
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                pd.dismiss();
            }
        }).start();

    }
}
