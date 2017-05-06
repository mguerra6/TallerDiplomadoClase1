package com.example.android.zxycalzadodeportivo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

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
    private TextView cotizacion;
    int op1, op2, op3, cant, valor ;


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
        cotizacion = (TextView)findViewById(R.id.txtcotizacion);
    }

    public void Precio(View v)
    {
        cotizacion.setText("");
        cant = Integer.parseInt(cantidad.getText().toString());
        if(validar())
        {

            op1 = sexoCombo.getSelectedItemPosition();
            switch (op1){
                //hombre
                case 0:
                    op2 = tipoCombo.getSelectedItemPosition();
                    switch (op2){
                        //zapatilla
                        case 0:
                                            op3 = marcaCombo.getSelectedItemPosition();
                                            switch (op3){
                                                //nike
                                                case 0:

                                                    valor = cant * 120000;
                                                    cotizacion.setText("$"+valor);
                                                    break;
                                                //adidas
                                                case 1:
                                                    valor = cant * 140000;
                                                    cotizacion.setText("$"+valor);
                                                    break;
                                                //puma
                                                case 2:
                                                    valor = cant * 130000;
                                                    cotizacion.setText("$"+valor);
                                                    break;
                                            }

                                            break;
                        //clasico
                        case 1:
                                            op3 = marcaCombo.getSelectedItemPosition();
                                            switch (op3){
                                                //nike
                                                case 0:
                                                    valor = cant * 50000;
                                                    cotizacion.setText("$"+valor);
                                                    break;
                                                //adidas
                                                case 1:
                                                    valor = cant * 80000;
                                                    cotizacion.setText("$"+valor);
                                                    break;
                                                //puma
                                                case 2:
                                                    valor = cant * 100000;
                                                    cotizacion.setText("$"+valor);
                                                    break;
                                            }
                    }
                    break;

                //mujer
                case 1:
                    op2 = tipoCombo.getSelectedItemPosition();
                    switch (op2){
                        //zapatilla
                        case 0:
                                            op3 = marcaCombo.getSelectedItemPosition();
                                            switch (op3){
                                                //nike
                                                case 0:
                                                    valor = cant * 100000;
                                                    cotizacion.setText("$"+valor);
                                                    break;
                                                //adidas
                                                case 1:
                                                    valor = cant * 130000;
                                                    cotizacion.setText("$"+valor);
                                                    break;
                                                //puma
                                                case 2:
                                                    valor = cant * 110000;
                                                    cotizacion.setText("$"+valor);
                                                    break;
                                            }

                                            break;
                        //clasico
                        case 1:
                                            op3 = marcaCombo.getSelectedItemPosition();
                                            switch (op3){
                                                //nike
                                                case 0:
                                                    valor = cant * 60000;
                                                    cotizacion.setText("$"+valor);
                                                    break;
                                                //adidas
                                                case 1:
                                                    valor = cant * 70000;
                                                    cotizacion.setText("$"+valor);
                                                    break;
                                                //puma
                                                case 2:
                                                    valor = cant * 120000;
                                                    cotizacion.setText("$"+valor);
                                                    break;
                                            }
                    }
                    break;


            }
            cantidad.requestFocus();
        }

    }

    public void Borrar(View v)
    {
        cantidad.setText("");
        cotizacion.setText("");
        cantidad.requestFocus();
    }

    public boolean validar()
    {
        if(cantidad.getText().toString().isEmpty())
        {
            cantidad.setError(this.getResources().getString(R.string.error_menor_cero));
            cantidad.requestFocus();
            return false;
        }
            else if(cant <= 0)
                {
                    cantidad.setError(this.getResources().getString(R.string.error_menor_cero));
                    cantidad.requestFocus();
                    return false;
                }
        return true;
    }
}
