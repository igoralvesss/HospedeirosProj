package com.hospedparasita.projetoparasitologia.tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.hospedparasita.projetoparasitologia.R;

public class PrevencaoFragment extends Fragment {

    WebView mWebView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_prevencao, container, false);

        TextView titulo_prev = (TextView) v.findViewById(R.id.titulo_prev);

        mWebView = (WebView) v.findViewById(R.id.conteudo_prev);



        TabInfoActivity activity = (TabInfoActivity) getActivity();

        Bundle results = activity.getTitPrev();
        String value1 = results.getString("titulo_profilaxia");

        Bundle results2 = activity.getContPrev();

        String text = "<html><body>"
                + "<p align=\"justify\" style=\"font-size: 20px;\">"
                + results2.getString("tipo_profilaxia")
                + "</p> "
                + "</body></html>";

        titulo_prev.setText(value1);

        mWebView.loadData(text,"text/html;charset=UTF-8",null);

        return v;
    }
}