package br.com.teste22.avptec;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.teste22.avptec.Agri.AgriActivity;
import br.com.teste22.avptec.Pecua.PecuActivity;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView lista = (ListView) findViewById(R.id.listProdutor);
        ArrayAdapter adapter = new ListaAdapter(this, adicionarLista());
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int posicaoDaLinha, long id) {

                if (posicaoDaLinha == 0) {
                    Intent agri = new  Intent(PrincipalActivity.this, AgriActivity.class);
                    startActivity(agri);
                } else if (posicaoDaLinha == 1) {
                    Intent agri = new  Intent(PrincipalActivity.this, PecuActivity.class);
                    startActivity(agri);
                }

            }


        });

    }
    

    private ArrayList<Lista> adicionarLista() {
        ArrayList<Lista> produtor = new ArrayList<Lista>();

        Lista e = new Lista("Agrícula", "Confira", R.drawable.trator);
        produtor.add(e);

        e = new Lista("Pecuarista", "Confira", R.drawable.animal);
        produtor.add(e);



        return produtor;
    }


}
