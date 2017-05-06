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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
}
