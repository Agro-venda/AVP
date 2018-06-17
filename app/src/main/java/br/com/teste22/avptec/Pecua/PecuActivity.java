package br.com.teste22.avptec.Pecua;

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
import br.com.teste22.avptec.Lista;
import br.com.teste22.avptec.ListaAdapter;
import br.com.teste22.avptec.PrincipalActivity;
import br.com.teste22.avptec.R;
import br.com.teste22.avptec.adapters.AdapterProdutos;
import br.com.teste22.avptec.adapters.ListaProdutos;
import br.com.teste22.avptec.listViews.Fertilizantes;
import br.com.teste22.avptec.listViews.Sementes;
import br.com.teste22.avptec.listViews.Vacinas;

public class PecuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pecu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView lista = (ListView) findViewById(R.id.listPecu);
        ArrayAdapter adapter = new AdapterProdutos(this, adicionarLista());
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int posicaoDaLinha, long id) {

                if (posicaoDaLinha == 0) {
                    Intent vacinas = new Intent(PecuActivity.this, Vacinas.class);
                    startActivity(vacinas);

                } else if (posicaoDaLinha == 1) {


                }

            }


        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(PecuActivity.this, PrincipalActivity.class);
                startActivity(voltar);
            }
        });
    }



    private ArrayList<ListaProdutos> adicionarLista() {
        ArrayList<ListaProdutos> produtor = new ArrayList<ListaProdutos>();

        ListaProdutos e = new ListaProdutos("Vacinas", "Confira", R.drawable.vacina);
        produtor.add(e);

        e = new ListaProdutos("Nutrição", "Confira", R.drawable.nutri);
        produtor.add(e);

        e = new ListaProdutos("Maquinários", "Confira", R.drawable.maqui);
        produtor.add(e);



        return produtor;
    }

}
