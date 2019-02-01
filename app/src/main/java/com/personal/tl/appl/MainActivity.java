package com.personal.tl.appl;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    private TextView tv_registros;
    private Button btn_Login;
    private EditText et_username;
    private  EditText et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_password = findViewById(R.id.et_password);
        et_username = findViewById(R.id.et_username);

        tv_registros =  findViewById(R.id.tv_register);
        tv_registros.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity.this,Registro.class);
                startActivity(j);
            }
        });
        btn_Login = findViewById(R.id.bt1);
        btn_Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Profile.class);
                i.putExtra("nombre",et_username.getText().toString());
                i.putExtra("contra",et_password.getText().toString());

                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("Salir").setMessage("Desea salir?")
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        }
                ).setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.super.onBackPressed();
                    }
                });

        builder.show();
    }
}
