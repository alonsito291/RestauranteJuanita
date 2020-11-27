package com.example.restaurantejuanita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario,contra;
    Button bLimpiar, bIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario=(EditText)findViewById(R.id.txtUsuario);
        contra=(EditText)findViewById(R.id.txtPass);
        bLimpiar=(Button)findViewById(R.id.btnLimpiar);
        bIngresar=(Button)findViewById(R.id.btnIngresar);

        /*ENVIAR USUARIO AL OTRO ACTIVITY*/


        /*ACCION DEL BUTTON LIMPIAR*/
        bLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario.setText("");
                usuario.invalidate();
                contra.setText("");
                contra.invalidate();

            }
        });

        bIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usu=usuario.getText().toString();
                String con=contra.getText().toString();

                if(usu.equals("usuario")){
                    if(con.equals("1234")){
                        Intent in=new Intent().setClass(MainActivity.this,Principal.class);
                        in.putExtra("usuario",usu);
                        startActivity(in);
                    }else{
                        Toast toas1=Toast.makeText(getApplicationContext()," CONTRASEÑA INCORRECTA",Toast.LENGTH_LONG);
                        toas1.show();
                    }
                }else{
                    Toast toas=Toast.makeText(getApplicationContext(),"USUARIO O CONTRASEÑA INCORRECTA",Toast.LENGTH_LONG);
                    toas.show();
                }
            }
        });
    }
}