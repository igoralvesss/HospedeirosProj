package com.hospedparasita.projetoparasitologia.game;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> norteQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("A transmissão da Malária pode ocorrer...","Da falta de higiêne pessoal","Do contato com alguém contaminado", "Da picada do mosquito contaminado", "Pela respiração do ar", "Da picada do mosquito contaminado", "");
        final QuestionsList question2 = new QuestionsList("Como se prevenir da Ascaridíase?","Usando máscara","Tomar banho", "Usar luva", "Lavando o alimento antes de comer", "Lavando o alimento antes de comer", "");
        final QuestionsList question3 = new QuestionsList("Como é transmitido a doença de Chagas?","Pelo ar","Pelo contato humano", "Pelas fezes de um inseto", "Por alimentos contaminados", "Pelas fezes de um inseto", "");
        final QuestionsList question4 = new QuestionsList("Mosquito responsável pela Malária","Haemagogus","Flebótomo ", "Anopheles", "Aedes aegypti", "Anopheles", "");
        final QuestionsList question5 = new QuestionsList("Qual o organismo que infecta o mosquito transmissor da Malária?","Xenophyophora","Dictyostelium", "Gromia sphaerica", "Plasmodium", "Plasmodium", "");
        final QuestionsList question6 = new QuestionsList("Como se adquiri Ascaridíase?","Ingerindo alimento contaminado","Tocando objetos contaminados", "Respirando ar contaminado", "Tocando em pessoas contaminada", "Ingerindo alimento contaminado", "");
        final QuestionsList question7 = new QuestionsList("Como se previnir da Doença de Chagas","Usando repelente","Usando máscara", "Lavando as mãos", "Lavando alimentos antes de comer", "Usando repelente", "");
        final QuestionsList question8 = new QuestionsList("Como Ascaridíase é conhecida popularmente?","Cobra","Lombriga", "Minhoca", "Larva", "Lombriga", "");
        final QuestionsList question9 = new QuestionsList("A Malária ainda é um problema da saúde pública mundial?","Sim, ainda é","Não", "Depende da região", "Nunca foi", "Sim, ainda é", "");
        final QuestionsList question10 = new QuestionsList("Quais dos seguintes sintomas correspondem a Malária?","Enjoo","Calafrios", "Moleza no corpo", "Coceira", "Calafrios", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;

    }

    private static List<QuestionsList> nordesteQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Como se prevenir da Criptosporidiose?","Higiene pessoal e dos alimentos","Praticar exercícios físicos", "Beber água", "Usar Mascara", "Higiene pessoal e dos alimentos", "");
        final QuestionsList question2 = new QuestionsList("Qual animal é responsável pela Tungíase?","Rato","Pulga", "Larva", "Mosquito", "Pulga", "");
        final QuestionsList question3 = new QuestionsList("Como se infectar com Esquistossomose?","Respiração","Contato com água infectada", "Alimentos contaminados", "Pelo toque em objetos infectados", "Contato com água infectada", "");
        final QuestionsList question4 = new QuestionsList("Bicho-de-pé é o termo utilizado para qual hospedeiro?","Esquistossomose","Criptosporidiose", "Malária", "Tungíase", "Tungíase", "");
        final QuestionsList question5 = new QuestionsList("Quando foi descoberto o Criptosporidiose?","1907","1759", "1855", "1931", "1907", "");
        final QuestionsList question6 = new QuestionsList("Como se prevenir da Tungíase","Higiene pessoal","Lavar alimentos", "Utilizar calçados", "Utilizar repelentes", "Utilizar calçados", "");
        final QuestionsList question7 = new QuestionsList("Qual a causa da Esquistossomose?","Alimentos sem lavar antes de comer","Poluição do ar", "Saneamento precário", "Falta de predadores naturais", "Saneamento precário", "");
        final QuestionsList question8 = new QuestionsList("Onde é encontrada a Criptosporidiose?","Mosquitos","Em alimentos", "Ratos", "Fezes humanas", "Fezes humanas", "");
        final QuestionsList question9 = new QuestionsList("Quando a Esquistossomose se tornou conhecida?","1798","1852", "1832", "1866", "1852", "");
        final QuestionsList question10 = new QuestionsList("Qual animal responsável por transmitir a Esquistossomose","Caramujo","Mosquito", "Rato", "Barata", "Caramujo", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;

    }

    private static List<QuestionsList> sudesteQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Ancilostomíase é uma infecção provocada por","Neisseria gonorrhoeae","Mycobacterium tuberculosis", "Escherichia coli ", "Necator americanus", "Necator americanus", "");
        final QuestionsList question2 = new QuestionsList("É correto afirmar que é um sintomas da Ancilostomose","Febre","Dor de cabeça", "Dor abdominal", "Cansaço", "Dor abdominal", "");
        final QuestionsList question3 = new QuestionsList("Qual o nome do protozoário responsável pela Toxoplasmose?","Toxoplasma Brond","Toxoplasma Gruund", "Toxoplasma Kond", "Toxoplasma Gondii", "Toxoplasma Gondii", "");
        final QuestionsList question4 = new QuestionsList("Quando aconteceu os primeiros registros da Ancilostomíase?","1.200 A.C.","1.400 A.C.", "1.600 A.C.", "1.800 A.C.", "1.600 A.C.", "");
        final QuestionsList question5 = new QuestionsList("Onde foi encontrado o primeiro parasita Toxoplasma gondii","America do Sul","Africa", "Oceania", "America do Norte", "Africa", "");
        final QuestionsList question6 = new QuestionsList("Quem foi o primeiro a encontrar os vermes da Ancilostomíase nos intestinos dos doentes?","Tenório","Avicena", "Morrice", "Christopher Sholes", "Avicena", "");
        final QuestionsList question7 = new QuestionsList("Como se prevenir da Ancilostomose?","Andar calçado","Lavar alimentos", "Higiene pessoal", "Usar mascara", "Andar calçado", "");
        final QuestionsList question8 = new QuestionsList("Em que ano foi encontrado o primeiro parasita Toxoplasma gondii","1908","1996", "1983", "2002", "1908", "");
        final QuestionsList question9 = new QuestionsList("Como se prevenir da Toxoplasmose?","Lavar bem frutas e legumes","Consumir apenas carne bem cozida", "Lavar as mãos", "Todas as alternativas", "Todas as alternativas", "");
        final QuestionsList question10 = new QuestionsList("Como é transmitido a Toxoplasmose?","transmitido de mãe para filho durante gestação","ingestão de alimentos e água contaminados", "inalação de aerossóis contaminados", "Todas as alternativas", "Todas as alternativas", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;

    }

    private static List<QuestionsList> sulQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Teníase, popularmente conhecida como:","Individual","Sozinha", "Solitária", "Unica", "Solitária", "");
        final QuestionsList question2 = new QuestionsList("Quando ocorreu o primeiro caso de Teníase?","século XXI","século XVI", "século XIX", "XVIII", "Nenhuma das alternativas", "");
        final QuestionsList question3 = new QuestionsList("Onde o verme adulto da Teníase se desenvolve?","Estomago","Baço", "intestino grosso", "Intestino Delgado", "Intestino Delgado", "");
        final QuestionsList question4 = new QuestionsList("Como é transmitido a Peste bulbônica?","Mosquito","Rato", "Alimento contaminado", "Pulga", "Pulga", "");
        final QuestionsList question5 = new QuestionsList("Como se prevenir da Peste bulbônica?","Manter animais de estimação livre de pulgas","Eliminar potenciais focos de ratos", "Evitar contato com infectados", "Todas as alternativas", "Todas as alternativas", "");
        final QuestionsList question6 = new QuestionsList("Medidas protetivas contra a Teníase:","Cozinhar a carne ao ponto certo","Lavar as mãos", "Usar mascara", "Nenhuma das opções", "Cozinhar a carne ao ponto certo", "");
        final QuestionsList question7 = new QuestionsList("Peste bulbônica foi a pandemia que causou mais mortes no mundo","Correto","Errado", "Apenas no Brasil", "Apenas na Africa", "Correto", "");
        final QuestionsList question8 = new QuestionsList("Como se prevenir da Teníase?","Lavando as mãos","Higiene Pessoal", "Repelente", "Nenhuma das opções", "Nenhuma das opções", "");
        final QuestionsList question9 = new QuestionsList("Qual o nome da bactéria causadora da Peste Bulbônica","Neisseria gonorrhoeae","Yersinia pestis", "Burkholderia cepacia", "taphylococcus aureus", "Yersinia pestis", "");
        final QuestionsList question10 = new QuestionsList("Como é contraído a Teníase?","Ingestão de carne crua","Ingestão de insetos", "Ingestão de água contaminada", "Ingestão de alimento mal lavado", "Ingestão de carne crua", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;

    }

    private static List<QuestionsList> centroQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Como a Miíase é transmitida?","Ratos","Água contaminada", "Moscas", "Alimento contaminado", "Moscas", "");
        final QuestionsList question2 = new QuestionsList("Qual o alimento das larvas das moscas?","Restos de comida","Lixo", "Tecido vivo", "Pólen", "Tecido vivo", "");
        final QuestionsList question3 = new QuestionsList("Qual a diferença entre Miíase Primária da Secundária?","Uma tem cura, a outra não","Uma se alimenta de tecido vivo e a outra de tecido morto", "Um consegue sobreviver em qualquer ambiente, a outra não", "Uma hospeda apenas humanos a outra animais domésticos", "Uma se alimenta de tecido vivo e a outra de tecido morto", "");
        final QuestionsList question4 = new QuestionsList("Como são conhecidas as Miíase Primária?","Gasontófagas","Libriontófagas", "Criontófagas", "Biontófagas", "Biontófagas", "");
        final QuestionsList question5 = new QuestionsList("Transmissão da Miíase é devido a:","Más condições de higiene","Más condições saneamento básico", "Ferimentos expostos", "Todas as alternativas", "Todas as alternativas", "");
        final QuestionsList question6 = new QuestionsList("É correto confirmar o termo seja Myie = moscas; ase = larvas?","Sim","Não", "Em partes", "Nenhuma alternativa", "Em partes", "");
        final QuestionsList question7 = new QuestionsList("O que significa a palavra ase em Miíase?","Doença","Mosca", "Larva", "Nenhuma alternativa", "Doença", "");
        final QuestionsList question8 = new QuestionsList("'Como se prevenir da Miíase?'","Lavar alimentos","Usar máscara", "Tomar banho 2 vezes ao dia", "Nenhuma alternativa", "Nenhuma alternativa", "");
        final QuestionsList question9 = new QuestionsList("Moradores de rua, correm risco de pegar Miíase?","Sim","Não", "Todos as pessoas correm risco de pegar", "Nenhuma alternativa", "Todos as pessoas correm risco de pegar", "");
        final QuestionsList question10 = new QuestionsList("É correto afirma que para se proteger da Miíase, é necessário:","Higiene pessoal","Proteger feridas abertas", "Usar máscara", "Todas estão corretas", "", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;

    }

    private static List<QuestionsList> brasilQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("A transmissão da Malária pode ocorrer...","Da falta de higiêne pessoal","Do contato com alguém contaminado", "Da picada do mosquito contaminado", "Pela respiração do ar", "Da picada do mosquito contaminado", "");
        final QuestionsList question2 = new QuestionsList("Como se prevenir da Ascaridíase?","Usando máscara","Tomar banho", "Usar luva", "Lavando o alimento antes de comer", "Lavando o alimento antes de comer", "");
        final QuestionsList question3 = new QuestionsList("Como se infectar com Esquistossomose?","Respiração","Contato com água infectada", "Alimentos contaminados", "Pelo toque em objetos infectados", "Contato com água infectada", "");
        final QuestionsList question4 = new QuestionsList("Bicho-de-pé é o termo utilizado para qual hospedeiro?","Esquistossomose","Criptosporidiose", "Malária", "Tungíase", "Tungíase", "");
        final QuestionsList question5 = new QuestionsList("Onde foi encontrado o primeiro parasita Toxoplasma gondii","America do Sul","Africa", "Oceania", "America do Norte", "Africa", "");
        final QuestionsList question6 = new QuestionsList("Quem foi o primeiro a encontrar os vermes da Ancilostomíase nos intestinos dos doentes?","Tenório","Avicena", "Morrice", "Christopher Sholes", "Avicena", "");
        final QuestionsList question7 = new QuestionsList("Peste bulbônica foi a pandemia que causou mais mortes no mundo","Correto","Errado", "Apenas no Brasil", "Apenas na Africa", "Correto", "");
        final QuestionsList question8 = new QuestionsList("Como se prevenir da Teníase?","Lavando as mãos","Higiene Pessoal", "Repelente", "Nenhuma das opções", "Nenhuma das opções", "");
        final QuestionsList question9 = new QuestionsList("Moradores de rua, correm risco de pegar Miíase?","Sim","Não", "Todos as pessoas correm risco de pegar", "Nenhuma alternativa", "Todos as pessoas correm risco de pegar", "");
        final QuestionsList question10 = new QuestionsList("É correto afirma que para se proteger da Miíase, é necessário:","Higiene pessoal","Proteger feridas abertas", "Usar máscara", "Todas estão corretas", "", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;

    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName) {
            case "norte":
                return norteQuestions();
            case "nordeste":
                return nordesteQuestions();
            case "sudeste":
                return sudesteQuestions();
            case "sul":
                return sulQuestions();
            case "centro":
                return centroQuestions();
            default:
                return brasilQuestions();
        }
    }
}
