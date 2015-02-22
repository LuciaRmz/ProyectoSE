package com.mycompany.guadalupe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.app.ActionBar;
import android.widget.Toast;

public class EjemploActividadesActivity extends ActionBarActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final ActionBar bar = getActionBar();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_actividades);

        View boton = findViewById(R.id.button1);
        boton.setOnClickListener(this);

        View boton2 = findViewById(R.id.button2);
        boton2.setOnClickListener(this);

        View botonMapa = findViewById(R.id.button3);
        botonMapa.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ejemplo_actividades, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    public void onClick(View vista) {

        if (vista.getId() == findViewById(R.id.button1).getId()) {
            //intencio de realizar una nueva actividad
            Intent i = new Intent(this, tituloActivity.class);
            startActivity(i);
        }
        if (vista.getId() == findViewById(R.id.button2).getId()) {
            Intent j = new Intent(this, actividad2Activity.class);
            startActivity(j);
        }
        if (vista.getId() == findViewById(R.id.button3).getId()) {
            Intent j = new Intent(this, MapsActivity.class);
            startActivity(j);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            openSettings();
            return true;
        }
        if (id == R.id.action_Seach) {
            openSearch();
            return true;
        }
        if (id == R.id.action_Camara) {
            openCamara();
            return true;
        }
        if (id == R.id.action_Ubicacion) {
            openUbicacion();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void openUbicacion(){
        Toast.makeText(this,"Ingreso al boton Ubicacion",Toast.LENGTH_SHORT).show();
    }

    private void openCamara(){
        Toast.makeText(this,"Ingreso al boton Camara",Toast.LENGTH_SHORT).show();
    }

    private void openSearch(){
        Toast.makeText(this,"Ingreso al boton Buscar",Toast.LENGTH_SHORT).show();
    }

    private void openSettings(){
        Toast.makeText(this,"Ingreso al boton Ajustes",Toast.LENGTH_SHORT).show();
    }
}


