package br.com.teste22.avptec.listViews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;

import br.com.teste22.avptec.R;

public class Sementes extends AppCompatActivity {

    Firebase objetoRef;
    ListView minhaLista;
    ArrayList<String> minhaListaDeTarefas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sementes);

        Firebase.setAndroidContext(this);
        minhaLista = (ListView)findViewById(R.id.listSementes);


        objetoRef = new Firebase("https://agrovendas-4caed.firebaseio.com/");

        Firebase novaRef = objetoRef.child("sementes");

        final ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, minhaListaDeTarefas);
        minhaLista.setAdapter(adaptador);

        novaRef.addChildEventListener(new com.firebase.client.ChildEventListener() {
            @Override
            public void onChildAdded(com.firebase.client.DataSnapshot dataSnapshot, String s) {
                String message = dataSnapshot.getValue(String.class);
                minhaListaDeTarefas.add(message);
                adaptador.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(com.firebase.client.DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(com.firebase.client.DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(com.firebase.client.DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
