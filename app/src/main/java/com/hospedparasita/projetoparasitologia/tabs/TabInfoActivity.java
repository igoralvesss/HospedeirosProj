package com.hospedparasita.projetoparasitologia.tabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.hospedparasita.projetoparasitologia.Doenca;

import com.google.android.material.tabs.TabLayoutMediator;
import com.hospedparasita.projetoparasitologia.databinding.ActivityTabInfoBinding;

public class TabInfoActivity extends AppCompatActivity {

    private ActivityTabInfoBinding binding;
    private Doenca doenca = null;

    String nomeDoenca = "";
    String tituloHistoria = "";
    String textoHistoria = "";
    String tituloTrans = "";
    String conteudoTrans = "";
    String tituloPreve = "";
    String conteudoPreve = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTabInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        configTabLayout();

        Intent it = getIntent();
        if(it.hasExtra("doenca")){
            doenca = (Doenca) it.getSerializableExtra("doenca");
            nomeDoenca = (String.valueOf(doenca.getNome_doenca()));
            tituloHistoria = (String.valueOf(doenca.getTitulo_historia()));
            textoHistoria = (String.valueOf(doenca.getConteudo_historia()));
            tituloTrans = (String.valueOf(doenca.getTitulo_transmissao()));
            conteudoTrans = (String.valueOf(doenca.getConteudo_transmisao()));
            tituloPreve = (String.valueOf(doenca.getTitulo_profilaxia()));
            conteudoPreve = (String.valueOf(doenca.getTipo_profilaxia()));
        }

    }

    public Bundle getMyData() {
        Bundle hm = new Bundle();
        hm.putString("titulo_historia", String.valueOf(tituloHistoria));
        return hm;
    }

    public Bundle getMyDataCont() {
        Bundle hm = new Bundle();
        hm.putString("conteudo_historia", String.valueOf(textoHistoria));
        return hm;
    }

    public Bundle getTitTrans() {
        Bundle hm = new Bundle();
        hm.putString("titulo_transmissao", String.valueOf(tituloTrans));
        return hm;
    }

    public Bundle getContTrans() {
        Bundle hm = new Bundle();
        hm.putString("conteudo_transmisao", String.valueOf(conteudoTrans));
        return hm;
    }

    public Bundle getTitPrev() {
        Bundle hm = new Bundle();
        hm.putString("titulo_profilaxia", String.valueOf(tituloPreve));
        return hm;
    }

    public Bundle getContPrev() {
        Bundle hm = new Bundle();
        hm.putString("tipo_profilaxia", String.valueOf(conteudoPreve));
        return hm;
    }

    private void configTabLayout() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        binding.viewPager.setAdapter(adapter);

        adapter.addFragment(new HistoriaFragment(), "História");
        adapter.addFragment(new TransmissaoFragment(), "Propagação");
        adapter.addFragment(new PrevencaoFragment(), "Prevenção");

        binding.viewPager.setOffscreenPageLimit(adapter.getItemCount());

        TabLayoutMediator mediator = new TabLayoutMediator(binding.tabs, binding.viewPager, (tab, position) -> {
            tab.setText(adapter.getTitle(position));
        });

        mediator.attach();
    }

}