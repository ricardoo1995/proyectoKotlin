package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent miIntent=new Intent(MainActivity.this,LoginActivity.class);
        startActivity(miIntent);

    }
         public void onClick(View view){
             Intent miIntent=null;
              switch(view.getId()){
                  case R.id.button2:
                      miIntent=new Intent(MainActivity.this,ImcActivity.class);
                      break;
                  case R.id.button3:
                      miIntent=new Intent(MainActivity.this,Imc1Activity.class);
                      break;


                  case R.id.button4:
                      miIntent=new Intent(MainActivity.this,ModuloActivity.class);
                      break;


              }
              startActivity(miIntent);




         }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
