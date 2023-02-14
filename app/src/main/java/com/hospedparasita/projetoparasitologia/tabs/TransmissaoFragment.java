package com.hospedparasita.projetoparasitologia.tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.hospedparasita.projetoparasitologia.R;

public class TransmissaoFragment extends Fragment {

    WebView mWebView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_transmissao, container, false);

        TextView titulo_trans = (TextView) v.findViewById(R.id.titulo_trans);

        mWebView = (WebView) v.findViewById(R.id.conteudo_trans);



        TabInfoActivity activity = (TabInfoActivity) getActivity();

        Bundle results = activity.getTitTrans();
        String value1 = results.getString("titulo_transmissao");

        Bundle results2 = activity.getContTrans();

        String text = "<html><body>"
                + "<p align=\"justify\" style=\"font-size: 20px;\">"
                + results2.getString("conteudo_transmisao")
                + "</p> "
                + "</body></html>";

        titulo_trans.setText(value1);

        mWebView.loadData(text,"text/html;charset=UTF-8",null);

        return v;
    }
}