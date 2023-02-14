package com.hospedparasita.projetoparasitologia.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.hospedparasita.projetoparasitologia.R;
import com.hospedparasita.projetoparasitologia.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;
    WebView mWebView, cWebView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_gallery, container, false);

        mWebView = (WebView) v.findViewById(R.id.conteudo_saneamento);


        cWebView = (WebView) v.findViewById(R.id.conteudo_continua);

        String text = "<html><body>"
                + "<h1>"
                + "1.\tConceito de saúde na história e Movimento sanitarista no Brasil "
                + "</h1>"
                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "Devemos sempre lembrar que o termo saúde pode estar relacionado com inúmeros conceitos como questões do próprio contexto social, cultural, político ou econômico. Assim, a palavra saúde pode não ter o mesmo significado para todas as pessoas. Tudo dependerá da época, local, classe sociais entre outros fatores. Isto é, houve períodos em que a fuga dos escravos era considerada uma enfermidade mental, isto é, uma pessoa doente, a qual não possui plenitude em sua saúde, o qual deveria sofrer o açoite (Golpe aplicado com chicote) (SCLIAR,2007)."
                + "</p> "
                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "A cultura também é um fator muito importante quando começamos a estudar sobre saúde, por exemplo os índios Sarrumá, que vivem na região da fronteira entre Brasil e Venezuela, possuem o conceito de morte por causa natural ou por acidente um pouco diferente da habitual em nossa sociedade, para eles essa situação é decorrida pelo resultado de alguma maldição de um inimigo, ou por uma conduta indevida, como comer um animal sagrado, o espírito deste animal vingaria-se provocando a morte deste indivíduo. A época também é um fator primordial que foi base para os diferentes entendimentos sobre a saúde, isto é, na época de Hipócrates, este estipulou a existência de quatro fluidos (humores) principais constituintes do nosso corpo: A bile amarela, bile negra, fleuma e o sangue. De maneira, que a saúde se constitui no equilíbrio desses elementos (SCLIAR,2007)."
                + "</p> "
                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "A casualidade durante muito tempo foi considerada motivo para justificar as doenças. No entanto, a cultura grega obteve um papel muito grande no início do entendimento da saúde, tal qual conhecemos hoje, pois essa começou a buscar explicações racionais para explicar a falta da saúde, isso é, os motivos que levavam os indivíduos a ficarem adoecidos.  Nesse período começaram a entender mais as relações entre natureza e homem, e olharem para as doenças não como resultados de causas sagradas/religiosas e sim ocasionadas por processos naturais de interações do homem e com o meio. Na Idade Média juntamente com a forte influência do cristianismo e do feudalismo, muitos especialista consideram como uma estagnação dentro deste temas, já que a doença estava novamente ligada a conceitos como o pecado, e as grandes epidemias ligadas aquilo que denominavam como “bruxarias”. Já na Idade Moderna, com o advento das máquinas a vapor e a expansão das indústrias e das cidades, aumentando assim as periferias, começamos a observar os grandes interesses das primeiras regulamentações visando a saúde dentro das fábricas (LOURENÇO et al., 2012)."
                + "</p> "

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "Entrando nos séculos XVII e XVIII a medicina avança consideravelmente, principalmente com a descoberta do microscópio, e o desenvolvimento do conhecimento da parte de bacteriologia. Políticas sanitárias começam a surgir, como indivíduos sadios respeitarem e cuidarem das suas saúdes obrigatoriamente, e pessoas doentes a se isolarem. De maneira, que a busca por explicações racionais por doenças, levaram ao fortalecimento da biologia científica ao longo dos anos (LOURENÇO et al., 2012)."
                + "</p> "

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "No entanto, apesar de ter trazido inúmeros benefícios o aprofundamento das relações entre a parte racional e o termo saúde, o qual trouxe consigo uma forte influência da biologia para sociedade.  Essa mesma relação foi distorcida por alguns estudiosos ao longo das história, um bom exemplo é o movimento eugênico, o qual começou na Inglaterra (berço da eugenia), este teve como ideologia o “melhoramento da sociedade”, por meio daquilo que denominavam como “genes bons” e “genes ruins”. O seu fundador chamado Galton Francis, acreditava que pessoas com “genes bons” deveriam procriar apenas com pessoas que ele considerava também portadoras de “genes bons” (eugenia positiva), os quais seriam superiores aos que tinham “genes ruins”, no caso principalmente de pessoas de etnias diferentes da população branca, isto é, estes seres “inferiores” segundo a ideia deste movimento não deveriam mais se reproduzir (eugenia negativa) (SCHNEIDER; MEGLHIORATTI; SOARES, 2017)."
                + "</p> "

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "A eugenia chegou no Brasil no século XX,  para Francis o nosso país era considerado possivelmente o verdadeiro “laboratório eugenista”, pois, segundo ele devido ao clima elevado e alta miscigenação aqui encontrada, tal país seria ótimo para compreensão da importância do movimento eugenista. De forma, que Galton sempre colocava como pauta o quão pessoas não brancas sendo “seres inferiores”. Ressaltamos que este movimento, enquadrava os negros como “seres inferiores”, segundo eles por viverem em condições precárias, entre outros fatores. Essa é pautada em dois principais pilares, o do Sanitarismo e do Nacionalismo, o primeiro mencionado foi fundado por Belisário Penna, líder desta vertente sanitarista, o qual deu origem aos princípios para uma educação sanitária a qual focava a culpa da doença no indivíduo, e nunca em uma estruturação social, a qual atualmente entendemos como estando interligada diretamente com questões sociais, econômicas e políticas (SCHNEIDER; MEGLHIORATTI; SOARES, 2017)."
                + "</p> "

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "Podemos compreender nos dias atuais que muitas doenças são decorridas rinciplamente pelo contexto social o qual as pessoas estão inseridas, isto é, o Brasil naquele período (eugenista), tinha acabado de sair do período de escravatura, de modo que muitos negros, indígenas, entre outros, viviam na margem da sociedade, dando origem até o termo “marginalizados” – Assim, estes indivíduos não tinham aquilo que denominamos como “oportunidade”, isto é, de condições de vida melhores, por consequência possuindo poucos recursos financeiros, refletindo nas situações precárias as quais estavam vivendo nesse período. Destacamos que tal situação não se modificou muito ao longo dos anos, pois, alguns argumentos levantados pelos eugenistas são utilizados até hoje em nossa sociedade (SCHNEIDER; MEGLHIORATTI; SOARES, 2017)."
                + "</p> "

                + "</body></html>";


        String text_two = "<html><body>"
                + "<h1>"
                + "2.\tAs políticas públicas da saúde"
                + "</h1>"

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "As Políticas Públicas formuladas pelo Estado e que se relacionam com a saúde são influenciadas em sua produção pelas necessidades dos usuários que dela se beneficiarão. Alguns aspectos como faixa-etária, sexo, gênero, etnia e situação social são levadas em consideração, inclusive para políticas transversais, essas muito importantes para a população."
                + "</p> "

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "De acordo com a Fiocruz, e considerando saúde como uma dimensão ampla, já citado anteriormente, resultante das condições de habitação, alimentação, educação, renda, meio ambiente, trabalho, transporte, emprego, lazer e do direito à terra, além do acesso aos serviços de saúde, deve-se, ao criar políticas públicas de saúde levar em consideração toda essa complexidade. Por definição, política pública se designa como um conjunto de programas, ações e decisões que são tomadas pelos governos em nível nacional, estadual ou municipal e que afetam todos os cidadãos, sem exceção, distinção e discriminação."
                + "</p> "

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "A sociedade deve participar diretamente ou até indiretamente para a construção das políticas públicas, com o objetivo de assegurar seus direitos de usufruto de determinado serviço, programa ou ação. No Brasil, o SUS (Sistema Único de Saúde), criado pela constituição de 1988, viabiliza o acesso universal, integral e gratuito à saúde para toda a população do país. Especificamente, uma das importantes vertentes do SUS são as políticas e programas de combate às grandes endemias, epidemias e pandemias (REIS; ARAÚJO; CECÍLIO, 2010). O uso da epidemiologia e medidas de saneamento, vacina, educação sanitária e etc. são considerados aliados para combater diversas doenças (incluindo as parasitoses), onde muitas delas foram por completo erradicadas no Brasil."
                + "</p> "

                + "<h1>"
                + "3.\tContexto social e a promoção de saúde e educação e saúde"
                + "</h1>"

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "O termo saúde é complicado de ser definido e muitas vezes é associado apenas à parte corporal. Porém, desde a década de 80 os especialistas estão tentando mudar essa noção, principalmente pela Primeira Conferência Internacional sobre Promoção da Saúde realizada em Ottawa durante o ano de 1986. Na carta final do evento houve a implementação do termo “promoção da saúde”, que busca visar que saúde é um recurso tanto pessoal quanto social, ou seja, muito relacionada à questões ambientais, políticas, de cidadania, etc. A partir dessa compreensão, a saúde passa a ser mais do que uma relação de bem-estar físico e se torna uma questão mental e social, o que influencia na melhoria das políticas públicas para garantir esse direito essencial para manter uma boa qualidade de vida."
                + "</p> "

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "Muitas vezes a escola faz com que os alunos apenas memorizem como as doenças ocorrem e como eles podem preveni-la, mas pouco da realidade dos estudantes é levada em consideração. Infelizmente, esses processos fazem com que a “culpa” do que pode vir a acometer a população seja apenas de seus indivíduos por se cuidarem ou não, deixando assim uma grande falta de discussão sobre as responsabilidades políticas que devem garantir diversos direitos como o de uma alimentação saudável ou acesso à saneamento básico. Além disso, algumas doenças podem ser discutidas de forma tão autoritária que podem assustar os estudantes, como muitas vezes ocorre com as infecções sexualmente transmissíveis (IST’s). Portanto, a escola precisa passar por uma grande contextualização para que a sala de aula se torne um espaço de diálogo que possa abordar as questões de forma macro, de forma que o trabalho coletivo seja incentivado, motivando assim a formação de uma boa cidadania."
                + "</p> "

                + "<h1 style=\"margin-top: 10px;\">"
                + "Referências:"
                + "</h1>"

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "FIOCRUZ. Políticas Públicas e Modelos de Atenção e Gestão à Saúde. Disponível em: https://portal.fiocruz.br/politicas-publicas-e-modelos-de-atencao-saude Acesso em 20 de abril de 2022."
                + "</p> "

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "LOURENÇO, L. de F. L. et al. A historicidade filosófica do conceito saúde. Centro de memoria da enfermagem brasileira associação brasileira de enfermagem, 2012."
                + "</p> "

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "REIS, D. O; ARAÚJO.E.C; CECÍLIO. L. C. O. Políticas Públicas no Brasil: SUS e Pactos Pela Saúde, Módulo Gestor; Especialização em Saúde Familiar; pag.27-47, 2010. Disponível em: https://www. "
                + "</p> "

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "unasus.unifesp.br/biblioteca_virtual/esf/1/modulo_politico_gestor/Unidade_4.pdf. Acesso em 20 de abril de 2022."
                + "</p> "

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "SCHNEIDER, E. M.; MEGLHIORATTI, F.A.; SOARES, A. S. F. Reflexões de um grupo de professores acerca do melhoramento genético humano a partir de discussões de textos de divulgação científica. Ensaio Pesquisa em Educação em Ciências (belo Horizonte), [s.l.], v. 19, p.1-24, 23 out. 2017. FapUNIFESP (SciELO). http://dx.doi.org/10.1590/1983-21172017190118"
                + "</p> "

                + "<p align=\"justify\" style=\"font-size: 24px; margin-top: 10px;\">"
                + "SCLIAR, M. História do conceito de saúde. Physis: Revista de saúde coletiva, v. 17, n. 1, p. 29-41, 2007."
                + "</p> "

                + "</body></html>";

        //GalleryViewModel galleryViewModel =
            //    new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        //View root = binding.getRoot();

        //final TextView textView = binding.textGallery;
        //galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        mWebView.loadData(text,"text/html;charset=UTF-8",null);
        cWebView.loadData(text_two,"text/html;charset=UTF-8",null);

        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}