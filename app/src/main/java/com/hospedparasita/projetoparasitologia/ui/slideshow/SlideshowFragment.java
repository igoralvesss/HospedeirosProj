package com.hospedparasita.projetoparasitologia.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.hospedparasita.projetoparasitologia.R;
import com.hospedparasita.projetoparasitologia.databinding.FragmentSlideshowBinding;

import com.hospedparasita.projetoparasitologia.game.PrincipalGameActivity;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;


    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        view = inflater.inflate(R.layout.fragment_slideshow, container, false);

        Button btncomecar = (Button) view.findViewById(R.id.comecarBtn);

        btncomecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent(getActivity(), PrincipalGameActivity.class);
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