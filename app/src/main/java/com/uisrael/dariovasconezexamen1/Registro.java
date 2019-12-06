package com.uisrael.dariovasconezexamen1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    TextView recibir;
    EditText nombre,minicial,pmensual;
    Button calcular,encuetas;
    Bundle dato;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = findViewById(R.id.editText);
        minicial = findViewById(R.id.editText2);
        pmensual = findViewById(R.id.editText3);

        calcular=findViewById(R.id.button);


        recibir = findViewById(R.id.txRecibir);

        dato = getIntent().getExtras();
        String valorR = dato.getString("valorEnviado");
        recibir.setText(valorR);

    }

    public void calculoC(View V){

        int va11 = Integer.parseInt(minicial.getText().toString());
        double cal1 = (2000 - va11)/6;
        pmensual.setText("TU PAGO MENSUAL ES: "+ cal1);


    }

    public void encuentaD(View V){



            Toast.makeText(getApplicationContext(),"ENCUESTA", Toast.LENGTH_SHORT).show();
            Intent encuesta = new Intent(Registro.this, Encuesta.class);
            encuesta.putExtra("valorEnviado2", nombre.getText().toString());
            startActivity(encuesta);


    }
}
