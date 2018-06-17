package br.com.teste22.avptec.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.teste22.avptec.Agri.AgriActivity;
import br.com.teste22.avptec.Lista;
import br.com.teste22.avptec.R;

public class AdapterProdutos   extends ArrayAdapter<ListaProdutos> {
    private final Context context;
    private final ArrayList<ListaProdutos> elementos;

    public AdapterProdutos(Context context, ArrayList<ListaProdutos> elementos) {
        super(context, R.layout.lista_produtos, elementos);
        this.context = context;
        this.elementos = elementos;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.lista_produtos, parent, false);
        TextView nomeEscola = (TextView) rowView.findViewById(R.id.nome);
        TextView endereco = (TextView) rowView.findViewById(R.id.endereco);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imagem);
        nomeEscola.setText(elementos.get(position).getNome());
        endereco.setText(elementos.get(position).getDetalhes());
        imagem.setImageResource(elementos.get(position).getImagem());
        return rowView;
    }
}
