package com.example.promul_chat_con_dos_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tituloSecond;
    TextView textoChatSecond;
    EditText mensajeAEnviarPorSecond;
    Button botonEnviarSecond;

    public static String MENSAJE_DE_SECOND =  "com.example.promul_chat_con_dos_activities.SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();

        tituloSecond = (TextView) findViewById(R.id.tituloSecond);
        textoChatSecond = (TextView) findViewById(R.id.textoChatSecond);
        mensajeAEnviarPorSecond = (EditText) findViewById(R.id.mensajeAEnviarPorSecond);
        botonEnviarSecond = (Button) findViewById(R.id.botonEnviarSecond);

        textoChatSecond.setText(intent.getStringExtra(MainActivity.MENSAJE_DE_MAIN));
    }

    public void enviarPorSecond(View view){
        String mensaje = String.valueOf(mensajeAEnviarPorSecond.getText());
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(MENSAJE_DE_SECOND, mensaje);
        startActivity(intent);
    }
}















