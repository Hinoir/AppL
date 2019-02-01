package com.personal.tl.appl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent datos = getIntent();
        String nombre= datos.getExtras().getString("nombre");
        String contra = datos.getExtras().getString("contra");

        Toast.makeText(this,nombre+" "+contra,Toast.LENGTH_LONG).show();
    }
}
