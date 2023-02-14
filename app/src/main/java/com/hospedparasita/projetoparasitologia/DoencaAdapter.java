package com.hospedparasita.projetoparasitologia;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class DoencaAdapter extends BaseAdapter{

    private List<Doenca> doencas;
    private Activity activity;

    public DoencaAdapter(Activity activity, List<Doenca> doencas){
        this.activity = activity;
        this.doencas = doencas;
    }

    @Override
    public int getCount() {
        return doencas.size();
    }

    @Override
    public Object getItem(int i) {
        return doencas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return doencas.get(i).getId_doenca();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = activity.getLayoutInflater().inflate(R.layout.item_doenca, viewGroup, false);
        TextView nome = v.findViewById(R.id.titulo_doenca);
        TextView descricao = v.findViewById(R.id.desc_doenca);

        Doenca a = doencas.get(i);

        nome.setText(a.getNome_doenca());
        descricao.setText(a.getDescricao_doenca());

        return v;
    }
}
