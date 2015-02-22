package com.mycompany.guadalupe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

/**
 * Created by Lucia Ramirez on 2/10/2015.
 */
public class actividad2Activity extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2);

        View boton = findViewById(R.id.button);
        boton.setOnClickListener(this);

    }

    public void onClick(View vista) {

        if (vista.getId() == findViewById(R.id.button).getId()) {
            //intencio de realizar una nueva actividad
            Intent i = new Intent(this, tituloActivity.class);
            startActivity(i);
        }
    }

}
