package com.hospedparasita.projetoparasitologia;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper {

    private static final String name = "banco.db";
    private static final int version = 1;

    public Conexao(Context context){
        super(context, name, null, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("" +
                "create table doenca(id_doenca integer primary key autoincrement," +
                "                   nome_doenca varchar(255)," +
                "                   descricao_doenca varchar(255)," +
                "                   titulo_historia varchar(255)," +
                "                   conteudo_historia varchar(255)," +
                "                   titulo_transmissao varchar(255)," +
                "                   conteudo_transmissao varchar(255)," +
                "                   nome_regiao varchar(255)," +
                "                   titulo_profilaxia varchar(255)," +
                "                   tipo_profilaxia varchar(255));" +
                "");

        db.execSQL("" +
                "INSERT INTO doenca " +
                "(nome_doenca, descricao_doenca, titulo_historia, conteudo_historia," +
                "titulo_transmissao, conteudo_transmissao, nome_regiao, titulo_profilaxia," +
                "tipo_profilaxia)" +
                " VALUES " +
                "('Doença de Chagas'," +
                "'Doença de Chagas (DC) ou Tripanossomíase Americana é uma infecção parasitária, antropozoonose, causada pelo protozoário flagelado Trypanosoma cruzi e transmitida pelo triatomíneo, popularmente conhecido como bicho-barbeiro.'," +
                "'História doença de Chagas'," +
                "'O nome remetido a doença de Chagas é uma homenagem ao cientista que descobriu e descreveu o primeiro caso comprovado desta enfermidade, o famoso Carlos Ribeiro Justiniano das Chagas. Formado no curso de medicina, com tese na doença Malária, logo após sua formatura começou a integrar a equipe de Oswaldo Cruz no estado de Minas Gerais. Este devido a sua aguçada curiosidade conseguiu descobrir em um primeiro momento uma nova espécie de tripanossoma, tal qual era transmitido via barbeiro para mamíferos, e possivelmente também para humanos. No dia 14 de abril de 1909, Carlos Chagas relatou, uma menina febril de dois (2) anos de idade, a qual chamava Berenice, o primeiro caso Clínico de Chagas em humanos. No entanto, foi considerada a forma indeterminada da doença, isto é, assintomática. A paciente só morreu aos 75 anos, após 73 anos da infecção. Contudo, devido a não possibilidade de necrópsia, não podemos afirmar com exata precisão se o falecimento foi devido à doença de Chagas, porém, todos os sintomas nos levam a conclusão que foi outras causas a sua morte e não a enfermidade. Atualmente, a doença é considerada um problema médico-social grave em diversos países da América Latina, inclusive o Brasil. A doença de Chagas atinge principalmente comunidades carentes, que possuem condições de vida precárias. Apesar das pessoas com a doença conseguirem levar uma vida normal, os indivíduos infectados são alvos de preconceitos. Além disso, como a doença pode levar a distúrbios cardíacos graves, de forma a impossibilitar as pessoas de trabalharem, esse quadro pode levar a aposentadorias precoces, impactando negativamente a previdência social.\n', " +
                "'Como é transmitido a Doença de Chagas?'," +
                "'A transmissão se dá pelas fezes contaminadas do “barbeiro” que deposita sobre a pele da pessoa, enquanto suga o sangue. Geralmente, a picada provoca coceira e o ato de coçar facilita a penetração do tripanossomo pelo local da picada. O T.cruzi contido nas fezes do “barbeiro” pode penetrar no organismo humano, também pela mucosa dos olhos, nariz e boca ou através de feridas ou cortes recentes existentes na pele. Podemos ter ainda, outros mecanismos de transmissão através de: transfusão de sangue, caso o doador seja portador da doença; transmissão congênita da mãe chagásica, para o filho via placenta; manipulação de caça (ingestão de carne contaminada) e acidentalmente em laboratórios.'," +
                "'NORTE'," +
                "'Como se prevenir da Doença de Chagas?'," +
                "'A prevenção da Doença de Chagas está intimamente relacionada à forma de transmissão. Uma das formas de controle é evitar que o inseto “barbeiro” forme colônias dentro das residências, por meio da utilização de inseticidas residuais por equipe técnica habilitada. Em áreas onde os insetos possam entrar nas casas voando pelas aberturas ou frestas, podem-se usar mosquiteiros ou telas metálicas. Recomenda-se usar medidas de proteção individual (repelentes, roupas de mangas longas, etc.) durante a realização de atividades noturnas (caçadas, pesca ou pernoite) em áreas de mata. Também devemos tomar cuidado com alimentos como por exemplo açai e caldo de cana que podem estar infectado com as fezes ou com o próprio barbeiro.')," +

                "('Toxoplasmose'," +
                "'A toxoplasmose é uma infecção causada por um protozoário chamado “Toxoplasma Gondii”, encontrado nas fezes de gatos e outros felinos, que pode se hospedar em humanos e outros animais. É causada pela ingestão de água ou alimentos contaminados e é uma das zoonoses (doenças transmitidas por animais) mais comuns em todo o mundo.'," +
                "'História Toxoplasmose'," +
                "'O parasita Toxoplasma gondii, responsável por causar a doença foi isolado pela primeira vez em 1908 diretamente de um roedor africano. Na mesma época, no Brasil, Splendore isolou o mesmo parasita de coelhos. Porém, o ciclo desse parasita foi publicado apenas em 1970 por Dubey e colaboradores.\n'," +
                "'Como é transmitido a Toxoplasmose?'," +
                "'As principais vias de transmissão da toxoplasmose são: Via oral (ingestão de alimentos e água contaminados com cistos ou oocistos de Toxoplasma gondii); Congênita (transmitido de mãe para filho durante gestação), sendo raros os casos de transmissão por inalação de aerossóis contaminados, inoculação acidental, transfusão sanguínea e transplante de órgãos.\n'," +
                "'SUDESTE'," +
                "'Como se prevenir da Toxoplasmose?'," +
                "'Várias medidas simples podem ser tomadas para a prevenção da toxoplasmose dentre elas: Consumir apenas carne bem cozida; Lavar bem frutas e legumes; Congelar a carne por 3 dias a 15ºC negativos; Lavar as mãos regularmente, sobretudo após a manipulação de alimentos e antes das refeições; Evitar contato com areia de gatos, lavar bem as mãos após este procedimento.  Gestantes não devem ter contato com areia de gatos; Manter o gato bem alimentado com ração e sem acesso à rua para ele não caçar e se contaminar; Evite acariciar cães que andem soltos; Controle ratos e insetos como moscas, baratas e formigas, descartando corretamente o lixo doméstico e os dejetos das criações de animais; Lave bem as mãos e as unhas após trabalhar na terra (horta ou jardim). Em casos de gestantes, é de extrema importância o acompanhamento no período do pré-natal para evitar a transmissão ao feto')," +

                "('Malária'," +
                "'Malária é uma doença infecciosa febril aguda transmitida pela picada da fêmea do mosquito Anopheles, infectada pelo microrganismo Plasmodium. Os sintomas mais comuns são: calafrios, febre alta, dores de cabeça e musculares, taquicardia, aumento do baço e, por vezes, delírios.'," +
                "'História da Malária'," +
                "'A malária continua sendo um dos principais problemas de saúde pública mundialmente. A partir de dados aferidos pela Organização das Nações Unidas no ano de 2019, estima-se que a malária matou no ano de 2018 mais de 405 mil pessoas em todo o mundo. Tal doença foi primeiramente citada na era Pré–Cristã, por Hipócrates. Esta enfermidade pode ser chamada de paludismo, febre palustre, impaludismo, maleita ou sezão. Posteriormente nos primórdios do século XIX que a denominação doença passou a ser Malária, pois, escritores italianos acreditavam que tal enfermidade era desencadeada por vapores nocivos providos dos pântanos tiberianos “mal aria”, isto é, “mau ar”. Mas só o compilado de informações ao longo do tempo levou as informações atuais, com a ajuda de médicos como Charles Louis Alphonse (1880); Gerhardt (1884); Golgi e Cols (1885,1891); Manson (1894); Ronald Ross (1897); Grassi, Bastianelli e Bignami (1898,1899), entre outros. Em 1955, iniciou-se o Programa de Erradicação da Malária, desenvolvido pela Organização Mundial de Saúde (OMS). Posteriormente, em 1995, surgiu o plano de estratégia global da Malária, criado também pela OMS, que tem como cerne entender melhor sobre a doença e englobar toda sua problematização nas atividades de serviços gerais da saúde, de maneira a compreender cada região endêmica acometida por esta (ONU NEWS PERSPECTIVA GLOBAL REPORTAGENS HUMANAS, 2019).\n'," +
                "'Como é transmitido a Malária?'," +
                "'A transmissão da malária pode ocorrer pela picada do mosquito, por transfusão de sangue contaminado, através da placenta (congênita) para o feto ou por meio de seringas infectadas. Após a picada do mosquito contaminado, os parasitas chegam rapidamente ao fígado, onde se multiplicam de forma intensa e veloz. Em seguida, já na corrente sangüínea, invadem os glóbulos vermelhos do sangue e, em constante multiplicação, começam a destruí-los. A partir desse momento, aparecem os primeiros sintomas da doença.'," +
                "'NORTE'," +
                "'Como se prevenir da Malária?'," +
                "'Não há vacina contra malária, mas existem várias medidas de proteção individual que podem ser adotadas pela população para reduzir a possibilidade da picada do mosquito transmissor da doença, como usar repelente; usar cortinados e mosquiteiros; usar telas em portas e janelas; evitar frequentar locais próximos a criadouros naturais de mosquitos, como beira de rio ou áreas alagadas ao final da tarde até o amanhecer; usar calças e camisas de mangas compridas e cores claras; Por se tratar de uma doença que se hospeda na maioria das vezes em animais silvestres, o combate ao desmatamento também seria umq medida de prevenção.')," +

                "('Ascaridíase'," +
                "'Ascaridíase é a doença causada pelo verme Ascaris lumbricoides, mais conhecido como lombriga, que pode chegar a medir até 40 cm.'," +
                "'História da Ascaridíase', " +
                "'A Ascaris lumbricoides foi descrita por Linnaeus em 1758 e é o parasita que causa a doença chamada ascaridíase, muito conhecida popularmente como lombriga e infecta o intestino delgado tanto de humano quanto de suínos. Esse parasito é encontrado em quase todos os países do mundo e ocorre em situações específicas de acordo com as condições ambientais, climáticas e muito pela situação socioeconômica do local. No Brasil, as regiões mais afetadas são as rurais.'," +
                "'Como é transmitido a Ascaridíase?'," +
                "'As pessoas adquirem a doença ao ingerir alimentos contaminados com os ovos do verme, principalmente frutas e verduras que não tenham sido lavadas adequadamente. Além disso, é comum a contaminação à crianças ao brincar na terra e levar as mãos sujas à boca.'," +
                "'NORTE'," +
                "'Como se prevenir da Ascaridíase?'," +
                "'Para evitar a infecção por Ascaris lumbricoides é importante adotar medidas de prevenção, como por exemplo lavar bem as mãos após utilizar o banheiro, lavar os alimentos antes de prepará-los, evitar o contato direto com as fezes e beber água potável, por exemplo. Além disso, é de extrema importancia que haja saneamento básico e que a população de regiões endêmicas seja tratada periodicamente com remédios que promovam a eliminação dos ovos do parasita nas fezes. ')," +

                "('Teníase'," +
                "'Teníase, popularmente conhecida como “solitária”, é uma verminose causada pelos platelmintos das espécies Taenia solium e Taenia saginata. A doença é contraída por meio da ingestão de carne mal cozida ou crua de suínos ou bovinos contaminados. A prevenção pode ser conseguida, portanto, por meio do consumo de carne sempre bem cozida ou bem assada. Após a contaminação, o verme adulto passa a se desenvolver no intestino delgado, provocando sintomas como dor abdominal, alterações no apetite e perda de peso. O homem é o único hospedeiro definitivo das duas espécies de tênia.'," +
                "'História da Teníase'," +
                "'Teníase(adulto) e cisticercose(larvas) são causadas pelo mesmo parasita, porém com uma fase de vida diferente. A teníase ocorre devido a presença de Taenia solium adulta ou Taenia saginata dentro do intestino delgado dos humanos, que são os hospedeiros definitivos; a cisticercose ocorre devido presença da larva (chamada popularmente de canjiquinha) que pode estar presente em hospedeiros intermediários, onde os mais comuns são os suínos e os bovinos, onde os humanos acidentalmente podem abrigar esta forma. São, portanto, duas fases distintas de um mesmo verme, causando duas parasitoses no homem, o que não significa que uma mesma pessoa tenha que ter as duas formas ao mesmo tempo. A teníase provocada por Taenia solium é considerada não letal, todavia, sua etapa larvária pode provocar cisticercose mortal.\n" +
                "Estas parasitoses são conhecidas há muito tempo. Os antigos pesquisadores pensavam entretanto que tratava-se de patologias diferentes, o que acabou por dar nomes diferentes para a forma larvária e adulta. O ano de 1697 é marcado por Malpighi que identificou como verme o agente da canjiquinha. Em 1786 e em 1789, Werner e Goeze, respectivamente, descobriram que as formas apresentadas por humanos e porcos eram iguais. Em 1758 as duas espécies Taenia solium e T.saginata foram descrita por Linnaeus. Zeder, em 1800, cria o gênero Cysticercus para o agente da canjiquinha. Em 1885, Küchenmeister consegue provar através de experimentações que o cisticerco presente em suínos da origem ao verme nos humanos.'," +
                "'Como é transmitido o Teníase?'," +
                "'As verminoses são transmitidas por alimentos contaminados, frutas e verduras mal lavadas, água contaminada, carnes cruas ou mal cozidas, mãos sujas, objetos contaminados, portanto, um maior cuidado básico de higiene pode evitar a disseminação dessas parasitoses'," +
                "'SUL'," +
                "'Como se prevenir da Teníase?'," +
                "'A teníase é contraída quando nos alimentamos de carne contaminada mal cozida ou mal passada. Desse modo, para prevenirmo-nos, é essencial não fazer a ingestão de carnes nessas condições. Recomenda-se também não provar a carne antes de cozinhá-la. Além disso, é importante conhecer a origem da carne que estamos comprando, certificando-nos sempre de que o produto tenha sido liberado pela inspeção sanitária.')," +

                "('Esquistossomose'," +
                "'É uma doença parasitária, diretamente relacionada ao saneamento precário, causada pelo Schistosoma mansoni. A pessoa adquire a infecção quando entra em contato com água doce onde existam caramujos infectados pelos vermes causadores da esquistossomose. No Brasil, a esquistossomose é conhecida popularmente como “xistose”, “barriga d’água” ou “doença dos caramujos”. O período de incubação, ou seja, tempo que os primeiros sintomas começam a aparecer a partir da infecção, é de duas a seis semanas.'," +
                "'História da Esquistossomose'," +
                "'Aspectos clínicos da doença foram descritos pela primeira vez, em 1847, pelo japonês Fuji. No Egito, o parasito tornou-se conhecido em 1852, com a descrição de Theodor Bilharz, daí a denominação bilharziose usada em alguns países. Quarenta anos mais tarde, o renomado médico inglês Patrick Manson levantou a hipótese da existência de duas espécies de Schistosoma parasitas do homem. Hoje, sabe-se que são muitas: S. japonicum (esquistossomose japonesa), S. haematobium, (esquistossomose hematóbia, vesical ou urinária), S. interacalatum (esquistossomose intestinal, típica de países da África Central), S. mekongi (esquistossomose intestinal, comum no vale do rio Mekongi, no Laos e Camboja), S. bovis, S. mattheei e S. rodhaini (esquistossomoses de animais que, eventualmente, parasitam o homem na África) e S. mansoni (esquistossomose mansoni, única espécie de interesse médico para a saúde pública brasileira).'," +
                "'Como é transmitido a Esquistossomose?'," +
                "'A transmissão da esquistossomose ocorre quando o indivíduo, hospedeiro definitivo, infectado elimina os ovos do verme por meio das fezes humanas. Em contato com a água, os ovos eclodem e liberam larvas que infectam os caramujos, hospedeiros intermediários que vivem nas águas doces. Após quatro semanas, as larvas abandonam o caramujo na forma de cercarias e ficam livres nas águas naturais. O ser humano adquire a doença pelo contato com essas águas.'," +
                "'NORDESTE'," +
                "'Como se prevenir da Esquistossomose?'," +
                "'A prevenção da esquistossomose consiste em evitar o contato com águas onde existam os caramujos hospedeiros intermediários infectados, implementação de medidas de saneamento básico, educação em saúde. Também é de grande importancia o tratamento dos doentes como medida de prevenção.')," +

                "('Criptosporidiose'," +
                "'Criptosporidiose é uma infecção pelo protozoário Cryptosporidium. O sintoma principal é diarreia aquosa, na maioria das vezes com outros sinais de distúrbios gastrintestinais. A doença é tipicamente autolimitada em pacientes imunocompetentes, mas pode ser persistente e grave naqueles com aids. '," +
                "'História da Criptosporidiose'," +
                "'Este é um parasita cosmopolita, que foi descrito pela primeira vez no ano de 1907, em camundongos, nos Estados Unidos. Desde que este protozoário foi descoberto, já foram descritos mais de 20 espécies diferentes pertencentes ao gênero, porém os pesquisadores ainda divergem quanto a sua taxonomia.'," +
                "'Como é transmitido a Criptosporidiose?'," +
                "'O parasita é encontrado nas fezes de seres humanos, animais domésticos (especialmente gado) e animais silvestres infectados. A infecção ocorre após ingestão do parasita. Isto é chamado de transmissão fecal-oral. A transmissão fecal-oral pode ocorrer de pessoa a pessoa, de animal a animal, ou de animal a pessoa. A transmissão de pessoa a pessoa pode ocorrer em decorrência de lavagem de mãos insuficiente por pessoas infectadas com diarréia, pessoas com incontinência fecal, pessoas com hábitos precários de higiene pessoal e crianças que usam fraldas. A transmissão também pode ocorrer através da ingestão de água contaminada, sendo essa a principal forma de transmissão do patógeno. A criptosporidiose algumas vezes pode ser transmitida através de lagos e piscinas quando pessoas com diarréia causada por criptosporidiose nadam em suas águas, ou quando a água torna-se contaminada pelo esgoto ou por fontes animais de criptosporidiose. Os parasitas podem sobreviver na água e infectar as pessoas que nadam e que a ingerem ou molham os lábios na água. '," +
                "'NORDESTE'," +
                "'Como se prevenir da Criptosporidiose?'," +
                "'Como em outras infecções intestinais é recomendada a higiene pessoal e dos alimentos. Os pacientes imunologicamente comprometidos devem evitar ter contato com animais ou pessoas com diarréia, já que nessas condições a criptosporidiose é uma doença grave e não tem tratamento específico.')," +

                "('Ancilostomíase'," +
                "'Ancilostomíase é uma infecção provocada por Ancylostoma duodenale ou Necator americanus. Os sintomas incluem exantema no local de entrada da larva e, algumas vezes, dor abdominal ou outros sintomas gastrointestinais durante a infecção inicial.'," +
                "'História da Ancilostomose'," +
                "'Papiros egípcios de 1.600 A.C., já assinalavam a ocorrência da ancilostomose. Avicena, médico persa que viveu no século X da nossa era, foi o primeiro a encontrar os vermes nos intestinos de doentes e responsabilizá-los pela anemia decorrente, por serem os mesmos sugadores de sangue (hematófagos). Na Europa era a doença conhecida por Anemia dos Mineiros, tomando nomes diversos conforme o país em que era constatada. No Brasil era antigamente nomeada por Opilação, Amarelão ou Anemia Tropical. Nosso escritor Monteiro Lobato, em um de seus livros, retrata o personagem Jeca Tatu, que nada mais era que um indivíduo parasitado pelo verme, o que serviu pelo Laboratório Fontoura para a propaganda de medicamentos de sua fabricação indicados para o tratamento da doença.'," +
                "'Como é transmitido a Ancilostomose'," +
                "'A ancilostomose pode ser causada por 2 tipos de parasitas: Ancylostoma duodenale ou Necator americanus. A contração da doença acontece pela penetração do parasita na pele, ao caminhar descalço em solo contaminado com larvas no estágio infectante. Países com clima quente e úmido e más condições de saneamento básico e higiene têm maiores índices de contaminação, já que os ovos deste parasita são eliminados na evacuação de um organismo contaminado. '," +
                "'SUDESTE'," +
                "'Como se prevenir da Ancilostomose?'," +
                "'A melhor maneira de se prevenir contra a ancilostomose é sempre andar calçado sobre possíveis locais de contaminação, bem como evitar o consumo de alimentos mal higienizados. É de grande importancia a conciêntização da população e melhorias no saneamento básico')," +

                "('Miíase'," +
                "'A miíase é caracterizada pela infestação de larvas de moscas na pele. As larvas de moscas completam parte de seus ciclos de vida alimentando-se de tecidos (vivos ou mortos) no corpo humano. A miíase pode se dar de duas formas: berne ou bicheira. A miíase pode afetar tanto humanos quanto animais domésticos, gado, ovinos e caprinos.'," +
                "'História da Miíase'," +
                "'O termo Miíase tem sua etimologia “Myie = moscas; ase = doença”, isto é, enfermidade causada por um animal/Mosca. De modo que, Miíase é a infecção em seres vertebrados vivos por larvas de dípteros (moscas), tais quais se alimentam do tecido vivo, substâncias corporais líquidas ou do alimento consumido por esses hospedeiros. A grande diferença entre a Miíase Primária/Obrigatória da Secundária/Facultativa, é que a primeira citada as moscas se alimentam de tecidos vivos, como tecidos cutâneos e subcutâneos de vários tipos de mamíferos, devido a esse fato foram/são conhecidas como biontófagas (anteriormente). Já a Miíase Secundária/Facultativa as moscas se alimentam de matéria orgânica em decomposição (vida livre), mas eventualmente podem alcançar tecidos necrosados de hospedeiros vivos.'," +
                "'Como é transmitido a Miíase'," +
                "'As pessoas afetadas pela miíase, geralmente, estão em más condições de higiene e saneamento básico, são pessoas sujas, cobertas de ferimentos e que dormem nas ruas. No entanto, vale ressaltar que qualquer pessoa pode ser escolhida por uma mosca para colocar seus ovos.'," +
                "'CENTRO-OESTE'," +
                "'Como se prevenir da Miíase?'," +
                "'A prevenção da miíase consiste em evitar a penetração das larvas, protegendo áreas descobertas da pele, principalmente feridas abertas, em especial nos locais onde existam muitas moscas.')," +

                "('Peste bulbônica'," +
                "'Também chamada simplesmente de a praga ou a peste, é uma doença infecciosa potencialmente fatal. Ela é causada pela bactéria Yersinia pestis, que vive em animais, especialmente os roedores, mais especificamente nas pulgas que eles carregam em seus pelos. O seu nome vem justamente de um dos sintomas que causa: um inchaço doloroso do linfonodo, que atinge os tecidos da axila ou da virilha, formando uma espécie de bolha, conhecida como bubão.'," +
                "'História da Peste bulbônica'," +
                "'A peste bubônica/peste negra foi a pandemia que causou mais mortes no mundo, sendo que o nome “peste negra” se deu por causa das manchas escuras que os enfermos tinham. Seu início se deu na Ásia Central e se espalhou por todo mundo, seja pelos mares ou por terra, através da pulga hospedada pela bactéria Yersinia pestis. Nos países orientais, a peste teve cerca de 24 milhões de mortos, sendo que em 1348 a doença chegou no sul da França, mas apenas em 1349 que se espalhou na Europa, depois de ter chegado na Itália, e nesse continente é estimado que um terço da população não resistiu a doença. Nessa situação de calamidade, as pessoas passaram a acreditar em explicações religiosas, chegando a perseguir os judeus, e a acreditar que tudo estava acontecendo por causa de um castigo divino. Em meio ao caos, os médicos ficaram com medo de se contaminarem ao cuidarem dos enfermos, por isso passaram a usar trajes especiais, com uma máscara que parecia o bico de um corvo. As consequências desse período foram inúmeras, com a perda de grades propriedades pela morte das famílias, o que reduziu drasticamente a produção agrícola, causando assim escassez de alimentos, houve também a queda do domínio da Igreja e a ascensão da burguesia.\n'," +
                "'Como é transmitido a Peste bulbônica'," +
                "'A transmissão da Peste na forma bubônica ocorre por meio da picada de pulgas infectadas. Na forma pneumônica, a transmissão se dá por gotículas aerógenas lançadas pela tosse no ambiente. A maior transmissibilidade se dá no período sintomático, em que o bacilo circula no organismo em maiores quantidades. A transmissibilidade da peste pneumônica ocorre no início da expectoração, permanecendo enquanto houver bactérias no trato respiratório.'," +
                "'SUL'," +
                "'Como se prevenir da Peste bulbônica?'," +
                "'A principal medida para prevenção da peste é identificar os locais onde a doença está ativa e avisar os órgãos públicos responsáveis, como a prefeitura. Deve-se evitar o contato direto com pessoas infectadas, principalmente se houverem feridas expostas de peste bubônica ou se ela está infectada com a peste pneumônica. Eliminar potenciais focos de ratos e pulgas, tais como pilhas de entulho, lenha e lixo. Não deixar alimentos para animais de estimação em áreas que os roedores podem facilmente acessar e deve-se manter seus animais de estimação livre de pulgas.')," +

                "('Tungíase'," +
                "'A tungíase é uma doença infecciosa de pele causada pela fêmea grávida de uma espécie de uma pulga chamada Tunga penetrans, popularmente conhecida como bicho-de-pé. Essa doença é identificada a partir do aparecimento de uma ou de algumas pequenas pintinhas escuras dentro de um círculo claro, principalmente na sola do pé, mas pode ser encontrada também nos dedos, nas mãos e nos calcanhares. A sua transmissão acontece quando se anda descalço em solos arenosos em que existe a espécie da pulga Tunga penetrans, e, portanto, para se prevenir contra essa doença é importante sempre andar de sapato nessas áreas potencialmente infectadas. Dessa forma, a pulga não consegue entrar na sola do pé.'," +
                "'História da Tungíase'," +
                "'As rotas comerciais e marítimas permitiram a disseminação do parasita responsável por transmitir a tungíase. Em seus primeiros registros, os espanhóis conheceram esse parasita quando Cristóvão Colombo chegou em Guanahani, em 12 de outubro de 1492. Apesar das informações sobre surtos de tungíase serem raras, em 1863, tropas francesas enfrentaram problemas com a doença na América do Norte. A tungíase apresenta alta prevalência no Brasil, ocorrendo desde a Região Norte até o Sul, predominando em locais com condições de saneamento básico precários, áreas rurais e comunidades ribeirinhas. Não é considerada uma questão de saúde pública, e dessa forma, faz parte das doenças negligenciadas.\n'," +
                "'Como é transmitido a Tungíase'," +
                "'A sua transmissão acontece quando se anda descalço em solos arenosos em que existe a espécie da pulga Tunga penetrans, e, portanto, para se prevenir contra essa doença é importante sempre andar de sapato nessas áreas potencialmente infectadas. Dessa forma, a pulga não consegue entrar na sola do pé.\n'," +
                "'NORDESTE'," +
                "'Como se prevenir da Tungíase?'," +
                "'A melhor forma de prevenir a túngiase é utilizar calçados fechados e inseticidas nas áreas afetadas. Os donos de animais também têm um papel-chave na prevenção destas doenças, cuidando da saúde de seus pets. Os cuidados incluem: Recolher as fezes dos animais e dar-lhes um destino adequado; Levar seu pet regularmente ao veterinário para tratamento contra parasitas.');" +

                "");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
