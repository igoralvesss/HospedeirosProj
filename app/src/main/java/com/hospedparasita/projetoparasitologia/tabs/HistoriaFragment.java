package com.hospedparasita.projetoparasitologia.tabs;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.hospedparasita.projetoparasitologia.R;

public class HistoriaFragment extends Fragment {

    WebView mWebView;
    WebView iWebView;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_historia, container, false);
        TextView titulo_hist = (TextView) v.findViewById(R.id.titulo_hist);
        //TextView cont_hist = (TextView) v.findViewById(R.id.conteudo_hist);

        //ImageView imagem_doenca = (ImageView) v.findViewById(R.id.imagem_doenca);


        mWebView = (WebView) v.findViewById(R.id.conteudo_hist);
        //iWebView = (WebView) v.findViewById(R.id.img_fundo);



        TabInfoActivity activity = (TabInfoActivity) getActivity();

        Bundle results = activity.getMyData();
        String value1 = results.getString("titulo_historia");

        Bundle results2 = activity.getMyDataCont();
        String text = "<html><body>"
                + "<p align=\"justify\" style=\"font-size: 20px;\">"
                + results2.getString("conteudo_historia")
                + "</p> "
                + "</body></html>";

        String img = "<html>"
                + "<style> body { background-image: url(\"../../res/drawable/img7.jpg\"); background-color: #cccccc;}</style>"
                + "<body><p> OLAAAA </p></body>"
                + "</html>";

        //String value2 = results2.getString("conteudo_historia");

        //int drawableId = getImageDrawableResId("chagas");
        //Drawable dr = getResources().getDrawable(drawableId, null);

        //imagem_doenca.setImageDrawable(dr);

        titulo_hist.setText(value1);


        mWebView.loadData(text,"text/html;charset=UTF-8",null);

        /*
        iWebView.loadData(img,"text/html;charset=UTF-8",null);


         */
        return v;
    }

    /*public int getImageDrawableResId(String imageId) {
        Resources resources = getResources();
        return resources.getIdentifier(imageId, "drawable", null);
    }

     */
}