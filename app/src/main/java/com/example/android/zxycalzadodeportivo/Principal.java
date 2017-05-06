package com.example.android.zxycalzadodeportivo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class Principal extends AppCompatActivity {
    private Spinner sexoCombo;
    private String [] sexoOpciones;
    private ArrayAdapter sexoAdapter;

    private Spinner tipoCombo;
    private String[] tipoOpciones;
    private ArrayAdapter tipoAdapter;

    private Spinner marcaCombo;
    private String[] marcaOpciones;
    private ArrayAdapter marcaAdapter;

    private EditText cantidad;
    private EditText cotizacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        sexoCombo = (Spinner)findViewById(R.id.cmdsexo);
        sexoOpciones = this.getResources().getStringArray(R.array.sexo);
        sexoAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, sexoOpciones);
        sexoCombo.setAdapter(sexoAdapter);

        tipoCombo = (Spinner)findViewById(R.id.cmdtipo);
        tipoOpciones = this.getResources().getStringArray(R.array.tipo);
        tipoAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, tipoOpciones);
        tipoCombo.setAdapter(tipoAdapter);

        marcaCombo = (Spinner)findViewById(R.id.cmdmarca);
        marcaOpciones = this.getResources().getStringArray(R.array.marca);
        marcaAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, marcaOpciones);

        cantidad = (EditText)findViewById(R.id.txtcantidad);
        cotizacion = (EditText)findViewById(R.id.txtcotizacion);

    }
}
