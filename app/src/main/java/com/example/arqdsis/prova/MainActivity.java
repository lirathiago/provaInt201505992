package com.example.arqdsis.prova;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
/*/*Thiago Dias de Lira  R.A: 201505992*/

public class MainActivity extends Activity {
    /*Thiago Dias de Lira  R.A: 201505992*/
    public static final String CHAVE = "br.usjt.ftce.arqdesis.prova.busca";
    EditText txtLigar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*Thiago Dias de Lira  R.A: 201505992*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iniciar);
        txtLigar = (EditText)findViewById(R.id.txt_Ligar);


    }

    public void buscarClientes(View view){
        /*Thiago Dias de Lira  R.A: 201505992*/
        String busca = txtLigar.getText().toString();
        /*Intent intent = new Intent(this, ListaClientesActivity.class);
        intent.putExtra(CHAVE, busca);
        startActivity(intent); */
    }
}