package com.example.adrianch.eva2_1_intentos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    EditText edtxttel;
    Button btnllam;
    Intent hacerLlamada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edtxttel = (EditText) findViewById(R.id.edtxttel);
        btnllam = (Button) findViewById(R.id.btnllam);
    }

    public void llamar(View v){
        String numeroUri = "tel:"+edtxttel.getText().toString();
        //ACTION_DIAL = Pantalla de marcación
        hacerLlamada = new Intent(Intent.ACTION_CALL, Uri.parse(numeroUri));
        startActivity(hacerLlamada);
    }
}
