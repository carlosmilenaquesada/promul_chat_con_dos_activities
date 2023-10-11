package com.example.promul_chat_con_dos_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tituloMain;
    TextView textoChatMain;
    EditText mensajeAEnviarPorMain;
    Button bontonEnviarMain;

    public static String MENSAJE_DE_MAIN = "com.example.promul_chat_con_dos_activities.MainActivity";

    public int PETICION = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tituloMain = (TextView) findViewById(R.id.tituloMain);
        textoChatMain = (TextView) findViewById(R.id.textoChatMain);
        mensajeAEnviarPorMain = (EditText) findViewById(R.id.mensajeAEnviarPorMain);
        bontonEnviarMain = (Button) findViewById(R.id.botonEnviarMain);
    }

    public void enviarPorMain(View view){
        String mensajeMain = String.valueOf(mensajeAEnviarPorMain.getText());
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(MENSAJE_DE_MAIN, mensajeMain);
        startActivity(intent);
    }

}





































