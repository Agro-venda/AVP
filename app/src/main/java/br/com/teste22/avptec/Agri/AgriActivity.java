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
import br.com.teste22.avptec.adapters.AdapterProdutos;
import br.com.teste22.avptec.adapters.ListaProdutos;
import br.com.teste22.avptec.listViews.Fertilizantes;
import br.com.teste22.avptec.listViews.Sementes;

public class AgriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agri);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView lista = (ListView) findViewById(R.id.listAgri);
        ArrayAdapter adapter = new AdapterProdutos(this, adicionarLista());
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int posicaoDaLinha, long id) {

                if (posicaoDaLinha == 0) {
                    Intent chama = new Intent(AgriActivity.this, Fertilizantes.class);
                    startActivity(chama);

                } else if (posicaoDaLinha == 1) {
                    Intent sementes = new Intent(AgriActivity.this, Sementes.class);
                    startActivity(sementes);

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

    private ArrayList<ListaProdutos> adicionarLista() {
        ArrayList<ListaProdutos> produtor = new ArrayList<ListaProdutos>();

        ListaProdutos e = new ListaProdutos("Fertilizantes", "Confira", R.drawable.ferti);
        produtor.add(e);

        e = new ListaProdutos("Sementes", "Confira", R.drawable.seme);
        produtor.add(e);

        e = new ListaProdutos("Herbicídas", "Confira", R.drawable.herbi);
        produtor.add(e);

        e = new ListaProdutos("Perticídas", "Confira", R.drawable.bug);
        produtor.add(e);

        return produtor;
    }
}
