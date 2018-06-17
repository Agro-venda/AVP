package br.com.teste22.avptec.listViews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import br.com.teste22.avptec.Model.ProdutoClass;
import br.com.teste22.avptec.R;

public class Fertilizantes extends AppCompatActivity {
    private ListView listProdutos;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    private List<ProdutoClass> listPessoa = new ArrayList<ProdutoClass>();
    private ArrayAdapter<ProdutoClass> arrayAdapterPessoa;
    ProdutoClass pessoaSelecionada = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fertilizantes);

        listProdutos = (ListView)findViewById(R.id.listProdutos);


        inicializarFirebase();
        eventoDatabase();
    }
    private void eventoDatabase() {
        databaseReference.child("ProdutoClass").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                listPessoa.clear();
                for (DataSnapshot objSnapshot:dataSnapshot.getChildren()){
                    ProdutoClass p = objSnapshot.getValue(ProdutoClass.class);
                    listPessoa.add(p);
                }
                arrayAdapterPessoa = new ArrayAdapter<ProdutoClass>(Fertilizantes.this,
                        android.R.layout.simple_list_item_1,listPessoa);
                listProdutos.setAdapter(arrayAdapterPessoa);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void inicializarFirebase() {
        FirebaseApp.initializeApp(Fertilizantes.this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        // firebaseDatabase.setPersistenceEnabled(true);
        databaseReference = firebaseDatabase.getReference();
    }
}
