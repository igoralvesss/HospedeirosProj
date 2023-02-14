package com.hospedparasita.projetoparasitologia.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hospedparasita.projetoparasitologia.ListaBrasil;
import com.hospedparasita.projetoparasitologia.ListaCentro;
import com.hospedparasita.projetoparasitologia.ListaNordeste;
import com.hospedparasita.projetoparasitologia.ListaSudeste;
import com.hospedparasita.projetoparasitologia.ListaSul;
import com.hospedparasita.projetoparasitologia.ListarDoencaActivity;
import com.hospedparasita.projetoparasitologia.R;
import com.hospedparasita.projetoparasitologia.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    Button norte, nordeste;

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.fragment_home, container, false);

        final LinearLayout btnNorte = view.findViewById(R.id.norteLayout);
        final LinearLayout btnNordeste = view.findViewById(R.id.nordesteLayout);
        final LinearLayout btnSudeste = view.findViewById(R.id.sudesteLayout);
        final LinearLayout btnSul = view.findViewById(R.id.sulLayout);
        final LinearLayout btnCentro = view.findViewById(R.id.centroLayout);
        final LinearLayout btnBrasil = view.findViewById(R.id.brasilLayout);

        btnNorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent(getActivity(), ListarDoencaActivity.class);
                startActivity(in);
            }
        });

        btnNordeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent(getActivity(), ListaNordeste.class);
                startActivity(in);
            }
        });

        btnSudeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent(getActivity(), ListaSudeste.class);
                startActivity(in);
            }
        });

        btnSul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent(getActivity(), ListaSul.class);
                startActivity(in);
            }
        });

        btnCentro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent(getActivity(), ListaCentro.class);
                startActivity(in);
            }
        });

        btnBrasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent(getActivity(), ListaBrasil.class);
                startActivity(in);
            }
        });



        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}