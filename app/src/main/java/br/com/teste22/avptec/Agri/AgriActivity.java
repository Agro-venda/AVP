package br.com.teste22.avptec.Agri;

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

import br.com.teste22.avptec.Lista;
import br.com.teste22.avptec.ListaAdapter;
import br.com.teste22.avptec.Pecua.PecuActivity;
import br.com.teste22.avptec.PrincipalActivity;
import br.com.teste22.avptec.R;
import br.com.teste22.avptec.listViews.Fertilizantes;

public class AgriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agri);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView lista = (ListView) findViewById(R.id.listAgri);
        ArrayAdapter adapter = new ListaAdapter(this, adicionarLista());
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int posicaoDaLinha, long id) {

                if (posicaoDaLinha == 0) {
                    Intent chama = new Intent(AgriActivity.this, Fertilizantes.class);
                    startActivity(chama);

                } else if (posicaoDaLinha == 1) {

                }

            }


        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(AgriActivity.this, PrincipalActivity.class);
                startActivity(voltar);
            }
        });
    }

    private ArrayList<Lista> adicionarLista() {
        ArrayList<Lista> produtor = new ArrayList<Lista>();

        Lista e = new Lista("Fertilizantes", "Confira", R.drawable.ferti);
        produtor.add(e);

        e = new Lista("Sementes", "Confira", R.drawable.seme);
        produtor.add(e);

        e = new Lista("Herbicídas", "Confira", R.drawable.herbi);
        produtor.add(e);

        e = new Lista("Perticídas", "Confira", R.drawable.bug);
        produtor.add(e);

        return produtor;
    }
}
