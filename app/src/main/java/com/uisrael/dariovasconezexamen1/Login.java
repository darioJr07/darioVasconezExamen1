package com.uisrael.dariovasconezexamen1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView usu,pass;
    EditText usuario, password;
    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usu=findViewById(R.id.txUsuario);
        pass=findViewById(R.id.txPassword);
        usuario=findViewById(R.id.etUsuario);
        password=findViewById(R.id.etPassword);
        ingresar=findViewById(R.id.btnIngresar);
    }

    public void login(View V){


        if (usuario.getText().toString().equals("DARIO") && password.getText().toString().equals("uisrael2019")){
            Toast.makeText(getApplicationContext(),"ACCESO CORRECTO", Toast.LENGTH_SHORT).show();
            Intent abrir = new Intent(Login.this, Registro.class);
            abrir.putExtra("valorEnviado", usuario.getText().toString());
            startActivity(abrir);
        }
        else {
            Toast.makeText(getApplicationContext(),"ACCESO INCORRECTO", Toast.LENGTH_SHORT).show();
        }
    }
}
