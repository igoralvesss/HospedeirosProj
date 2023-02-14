package com.hospedparasita.projetoparasitologia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.hospedparasita.projetoparasitologia.tabs.TabInfoActivity;

import java.util.ArrayList;
import java.util.List;

public class ListaSudeste extends AppCompatActivity {

    private ListView listView;
    private DoencaDAO dao;
    private List<Doenca> doencas;
    private List<Doenca> doencasFiltrados = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sudeste);

        listView = findViewById(R.id.lista_doenca_sudeste);
        dao = new DoencaDAO(this);
        doencas = dao.obterTodosSudeste();
        doencasFiltrados.addAll(doencas);
        DoencaAdapter adaptador = new DoencaAdapter(this, doencasFiltrados);
        listView.setAdapter(adaptador);
        registerForContextMenu(listView);

        listView.setDivider(null);
        listView.setDividerHeight(0);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                final Doenca doencaPegar = doencasFiltrados.get(position);
                Intent it = new Intent(ListaSudeste.this, TabInfoActivity.class);
                it.putExtra("doenca", doencaPegar);
                startActivity(it);
            }
        });
    }
}