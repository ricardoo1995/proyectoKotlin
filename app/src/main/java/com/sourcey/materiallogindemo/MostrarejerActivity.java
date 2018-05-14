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
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.Bind;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MostrarejerActivity extends AppCompatActivity {
//hola a todos
    private ListView lvItems;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musculacion_activity);
//        Intent i = new Intent(ImcActivity.this,MainActivity.class);
        //      startActivity(i);
        lvItems=(ListView) findViewById(R.id.lvItems);
        adaptador = new Adaptador(this, GetArrayItems());
        lvItems.setAdapter(adaptador);
    }
    private ArrayList<Entidad> GetArrayItems(){
        ArrayList<Entidad> listIems =new ArrayList<>();
        listIems.add(new Entidad(R.drawable.uno      , "Curl con Barra","• De pie, sostenga una barra con las manos colocadas a una separación ligeramente mayor que la anchura de sus hombros, con las palmas hacia adelante.\n" +
                "\n" +
                "• Flexione ambos brazos sin impulsarse con el cuerpo.\n" +
                "\n" +
                "• Descienda la barra de forma lenta. Mantenga la espalda derecha durante todo el ejercicio."));
        listIems.add(new Entidad(R.drawable.dos     , "XXX","XXXX"));
        listIems.add(new Entidad(R.drawable.tres       , "XXX","XXXX"));
        listIems.add(new Entidad(R.drawable.cuatro       , "XXX","XXXX"));
        listIems.add(new Entidad(R.drawable.ci       , "XXX","XXXX"));
        listIems.add(new Entidad(R.drawable.six       , "XXX","XXXX"));
        listIems.add(new Entidad(R.drawable.seven       , "XXX","XXXX"));


        return listIems;

    }
}
