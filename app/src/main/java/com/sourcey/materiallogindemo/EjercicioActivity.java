package com.sourcey.materiallogindemo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.Bind;


public class EjercicioActivity extends AppCompatActivity {
//hola a todos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejerciciomuj);
//        Intent i = new Intent(ImcActivity.this,MainActivity.class);
        //      startActivity(i);

    }
    public void onClick(View view){
        Intent miIntent=null;
        switch(view.getId()){
            case R.id.button8:
                miIntent=new Intent(EjercicioActivity.this,SubirPesoActivity.class);
                break;//hola
            case R.id.button9:
                miIntent=new Intent(EjercicioActivity.this,MostrarejerActivity.class);
                break;
            case R.id.button10:
                miIntent=new Intent(EjercicioActivity.this,BajarPesoActivity.class);
                break;



        }
        startActivity(miIntent);




    }
}