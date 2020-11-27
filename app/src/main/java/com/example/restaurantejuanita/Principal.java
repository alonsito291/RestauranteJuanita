package com.example.restaurantejuanita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

public class Principal extends AppCompatActivity {

    Spinner mesa;
    Button generar;
    RadioButton menu,extra,bebida;
    TextView hora,fecha,usuario;
    LinearLayout aumento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        /*INSTANCIAR LOS SPINNER, TEXTVIEW, RADIOBUTTON, BUTTON*/
        mesa=(Spinner)findViewById(R.id.spMesa);
        generar=(Button)findViewById(R.id.btnGenerar);
        menu=(RadioButton)findViewById(R.id.rbMenu);
        extra=(RadioButton)findViewById(R.id.rbExtra);
        bebida=(RadioButton)findViewById(R.id.rbBebida);
        hora=(TextView)findViewById(R.id.txtHora);
        fecha=(TextView)findViewById(R.id.txtFecha);
        usuario=(TextView)findViewById(R.id.txtUsuario);


        /*CARGAR MESA*/
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(Principal.this,R.array.Mesa,android.R.layout.simple_list_item_1);
        mesa.setAdapter(adapter);
        /*JALAR A NUESTRO USUARIO */
        Intent USU=this.getIntent();
        Bundle extrad=USU.getExtras();
        String usu=extrad.getString("usuario");
        usuario.setText(usu);
        /*JALAR HORA FECHA*/
        String jalarfecha=DateFormat.getDateInstance().format(new Date());
        String jalarHora=DateFormat.getTimeInstance().format(new Date());
        hora.setText(jalarHora);
        fecha.setText(jalarfecha);

        /*ACCION DEL BUTTON*/
        generar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(extra.isChecked()){
                    Intent ie= new Intent().setClass(Principal.this,PanelExtra.class);
                    startActivity(ie);
                }
                if(menu.isChecked()){
                    Intent im= new Intent().setClass(Principal.this,PanelMenu.class);
                    startActivity(im);
                }
                if(bebida.isChecked()){
                    Intent ib= new Intent().setClass(Principal.this,PanelBebida.class);
                    startActivity(ib);
                }
            }
        });
    }
}