package com.example.unipar.contatos;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import Contatos.EntidadeContatos;
import Contatos.Contatos;


public class ContatosActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatos);
        final ListView listaPessoas = (ListView)findViewById(R.id.ListView01);
        List<EntidadeContatos> ListaContatos = new ArrayList<EntidadeContatos>();
        Contatos Contato = new Contatos(this);
        ListaContatos = Contato.getContatos();
        ArrayAdapter<EntidadeContatos> adapter = new ArrayAdapter<EntidadeContatos>(this,android.R.layout.simple_list_item_1, ListaContatos);
        listaPessoas.setAdapter(adapter);
    }

    public String retornaNumero(){
        TelephonyManager tm = (TelephonyManager)getSystemService(TELEPHONY_SERVICE);
        return tm.getLine1Number();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_contatos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_meu_numero) {
            Intent it = new Intent(this,MeuNumeroActivity.class);
            startActivity(it);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
