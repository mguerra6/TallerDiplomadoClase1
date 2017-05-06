package com.example.android.zxycalzadodeportivo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        marcaCombo.setAdapter(marcaAdapter);

        cantidad = (EditText)findViewById(R.id.txtcantidad);
        cotizacion = (EditText)findViewById(R.id.txtcotizacion);
    }

    public void Calcular(View v)
    {
        int op;
        double n1, n2, res = 0;
        if(validar())
        {
            n1 = Double.parseDouble(cajanumero1.getText().toString());
            n2 = Double.parseDouble(cajanumero2.getText().toString());
            op = comboOpciones.getSelectedItemPosition();
            switch (op){
                case 0:
                    res = n1 + n2;
                    break;
                case 1:
                    res = n1 - n2;
                    break;
                case 2:
                    res = n1 * n2;
                    break;
                case 3:
                    res = n1 / n2;
                    break;
            }
            cotizacion.setText(""+precio);
            cantidad.requestFocus();
        }

    }

    public boolean validar()
    {
        if(cantidad.getText().toString().isEmpty())
        {
            cantidad.setError(this.getResources().getString(R.string.error_vacio));
            cantidad.requestFocus();
            return false;
        }else if(cantidad.getText().toString() <= 0)
                {
                    cantidad.setError(this.getResources().getString(R.string.error_menor_cero));
                    cantidad.requestFocus();
                }
        return true;
    }
}
