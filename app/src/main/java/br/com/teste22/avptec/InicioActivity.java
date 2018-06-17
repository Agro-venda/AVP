package br.com.teste22.avptec;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;;

public class InicioActivity extends AppCompatActivity {

    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

         btnEntrar = (Button)findViewById(R.id.btnEntrar);
         btnEntrar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent entrar = new Intent(InicioActivity.this, PrincipalActivity.class);
                 startActivity(entrar);
             }
         });

    }

}
