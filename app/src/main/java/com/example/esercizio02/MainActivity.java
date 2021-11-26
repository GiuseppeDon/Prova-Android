package com.example.esercizio02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etdNome;
    TextView txtSaluta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etdNome = findViewById(R.id.edtNome);
        txtSaluta = findViewById(R.id.txtSaluta);
    }

    public void saluta(View v) {
        Context c = getApplicationContext();
        CharSequence text = "Ho salutato!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(c, text, duration);
        toast.show();
        txtSaluta.setText("Vai più vicino, " + etdNome.getText() + ", STUPIDO!");
        Log.i("messaggio", "Ho salutato");

    }

    public void pulisci(View v) {
        Context c = getApplicationContext();
        CharSequence text = "Ho pulito!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(c, text, duration);
        toast.show();
        txtSaluta.setText("");
        etdNome.setText("");
        Log.i("messaggio", "Ho pulito");
    }
}