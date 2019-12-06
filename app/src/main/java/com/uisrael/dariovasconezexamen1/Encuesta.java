package com.uisrael.dariovasconezexamen1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Encuesta extends AppCompatActivity {
    TextView nombreE;

    Bundle datoD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        nombreE = findViewById(R.id.txNombre);







        datoD = getIntent().getExtras();
        String valorR2 = datoD.getString("valorEnviado2");
        nombreE.setText(valorR2);
    }
}
