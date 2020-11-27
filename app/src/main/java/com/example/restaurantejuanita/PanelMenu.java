package com.example.restaurantejuanita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class PanelMenu extends AppCompatActivity {

    Spinner sopa,segundo,postre;
    LinearLayout mas;
    Button aumentarMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel_menu);

        sopa=(Spinner)findViewById(R.id.spSopa);
        segundo=(Spinner)findViewById(R.id.spSegundo);
        postre=(Spinner)findViewById(R.id.spPostre);
        mas=(LinearLayout)findViewById(R.id.bloque);
        aumentarMenu=(Button) findViewById(R.id.btnMas);

        /*jalar sopa*/
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(PanelMenu.this,R.array.Sopas,android.R.layout.simple_list_item_1);
        sopa.setAdapter(adapter);
        /*jalar segundo*/
        ArrayAdapter<CharSequence> adaptera=ArrayAdapter.createFromResource(PanelMenu.this,R.array.Segundos,android.R.layout.simple_list_item_1);
        segundo.setAdapter(adaptera);
        /*jalar postre*/
        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(PanelMenu.this,R.array.Postres,android.R.layout.simple_list_item_1);
        postre.setAdapter(adapter2);

        aumentarMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                

            }
        });
    }
}