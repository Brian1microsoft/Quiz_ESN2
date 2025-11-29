import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Questao> questoes = new ArrayList<>();

        Questao q1 = new Questao();
        q1.pergunta = "1. Qual a capital da Rússia ?";
        q1.opcaoA = "a. Brasília";
        q1.opcaoB = "b. Cairo";
        q1.opcaoC = "c. Oslo";
        q1.opcaoD = "d. Moscow";
        q1.opcaoE = "e. Varsóvia";
        q1.correta = "D";
        questoes.add(q1);

        Questao q2 = new Questao();
        q2.pergunta = "2. Qual cidade italiana é conhecida por ser cheia de canais navegáveis ?";
        q2.opcaoA = "a. Rio de janeiro";
        q2.opcaoB = "b. Buenos Aires";
        q2.opcaoC = "c. Maceió";
        q2.opcaoD = "d. Copenhague";
        q2.opcaoE = "e. Veneza";
        q2.correta = "E";
        questoes.add(q2);

        Questao q3 = new Questao();
        q3.pergunta ="3. Qual a cidade mais densamente povoada do Brasil ?";
        q3.opcaoA ="a. Manaus - AM";
        q3.opcaoB ="b. Xique-Xique - BA";
        q3.opcaoC ="c. São Paulo - SP";
        q3.opcaoD ="d. Goiânia - GO";
        q3.opcaoE ="e. Porto Alegre - RS";
        q3.correta ="C";
        questoes.add(q3);

        Questao q4 = new Questao();
        q4.pergunta ="4. Qual é a maior cidade do Japão ?";
        q4.opcaoA ="a. Tokyo";
        q4.opcaoB ="b. Osaka";
        q4.opcaoC ="c. Nagasaki";
        q4.opcaoD ="d. Sapporo";
        q4.opcaoE ="e. Kyoto";
        q4.correta ="A";
        questoes.add(q4);

        Questao q5 = new Questao();
        q5.pergunta ="5. Quais são as cores usadas na Bandeira da Noruega ?";
        q5.opcaoA ="a. Azul, Amarelo e preto";
        q5.opcaoB ="b. Azul, Vermelho e Branco";
        q5.opcaoC ="c. Vermelho, Laranja e Preto";
        q5.opcaoD ="d. Azul, Verde e Vermelho";
        q5.opcaoE ="e. Branco, Cinza e Vermelho";
        q5.correta ="B";
        questoes.add(q5);

        Questao q6 = new Questao();
        q6.pergunta = "6. Qual a capital de Grécia ?";
        q6.opcaoA = "a. Esparta";
        q6.opcaoA = "b. Roma";
        q6.opcaoA = "c. Athenas";
        q6.opcaoA = "d. Tripolis";
        q6.opcaoA = "e. Istambul";
        q6.correta = "C";
        questoes.add(q6);

        Questao q7 = new Questao();
        q7.pergunta = "7. Qual desses pontos é considerado o ponto mais profundo do mundo ?";
        q7.opcaoA = "a. Fossa das Marianas ";
        q7.opcaoB = "b. Fossa de Java ";
        q7.opcaoC = "c. Fossa de Tonga ";
        q7.opcaoD = "d. Fossa de Puerto Rico";
        q7.opcaoE = "e. Litke Deep";
        q7.correta = "A";
        questoes.add(q7);

        Questao q8 = new Questao();
        q8.pergunta = "8. Qual das opções abaixo não é considerado uma das 7 maravilha do mundo ?";
        q8.opcaoA = "a. Cristo Redentor ";
        q8.opcaoB = "b. Taj Mahal ";
        q8.opcaoC = "c. Chichén Itzá";
        q8.opcaoD = "d. Estátua da Liberdade";
        q8.opcaoE = "e. Machu Picchu";
        q8.correta = "D";
        questoes.add(q8);

        Questao q9 = new Questao();
        q9.pergunta = "9. Qual é o bioma mais predominante no território nacional ?";
        q9.opcaoA = "a. Cerrado";
        q9.opcaoB = "b. Caatinga";
        q9.opcaoC = "c. Pampa";
        q9.opcaoD = "d. Amazônia ";
        q9.opcaoE = "e. Pantanal";
        q9.correta = "D";
        questoes.add(q9);

        
        Questao q10 = new Questao();
        q10.pergunta = "10. Em qual camaada da Terra os seres humanos habitam ?";
        q10.opcaoA = "a. Núcleo Interno";
        q10.opcaoB = "b. Núcleo Externo";
        q10.opcaoC = "c. Exosfera";
        q10.opcaoD = "d. Crosta Terrestre";
        q10.opcaoE = "e. Manto";
        q10.correta = "D";
        questoes.add(q10);

        Questao q11 = new Questao();
        q11.pergunta = "Em qual ano a Guerra Fria acabou ?";
        q11.opcaoA = "a. 1976 ";
        q11.opcaoB = "b. 1991 ";
        q11.opcaoC = "c. 1984";
        q11.opcaoD = "d. 1964";
        q11.opcaoE = "e. 1917";
        q11.correta = "B";
        questoes.add(q11);

        Questao q12 = new Questao();
        q12.pergunta = " De qual Bloco Econômico o Brasil é Integrente ?";
        q12.opcaoA = "a. Mercosul";
        q12.opcaoB = "b. União Europeia";
        q12.opcaoC = "c. Cei";
        q12.opcaoD = "d. Pacto Andino";
        q12.opcaoE = "e. Asean";
        q12.correta = "A";
        questoes.add(q12);

        Questao q13 = new Questao();
        q13.pergunta = "Em que ano ocorreu o Brexit(saída do Reino Unido da UE) ?";
        q13.opcaoA = "a. 2016";
        q13.opcaoB = "b. 2020";
        q13.opcaoC = "c. 1998";
        q13.opcaoD = "d. 2012";
        q13.opcaoE = "e. 2018";
        q13.correta = "B";
        questoes.add(q13);

        Questao q14 = new Questao();
        q14.pergunta = "Qual a única bandeira do mundo que não é retangular ?";
        q14.opcaoA = "a. Vaticano";
        q14.opcaoB = "b. Suiça";
        q14.opcaoC = "c. Bangladesh";
        q14.opcaoD = "d. Paquistão";
        q14.opcaoE = "e. Nepal";
        q14.correta = "E";
        questoes.add(q14);

        Questao q15 = new Questao();
        q15.pergunta = "Qual desses Sistemas Socio-Econômicos, é o utilizado nos Estados Unidos";
        q15.opcaoA = "a. Feudalismo";
        q15.opcaoB = "b. Socialismo";
        q15.opcaoC = "c. Comunismo";
        q15.opcaoD = "d. Anarquismo";
        q15.opcaoE = "e. Capitalismo";
        q15.correta = "E";
        questoes.add(q15);


        for (int i = 0; i < questoes.size(); i++) {
            System.out.println("----------------------------------------");

            Questao questaoAtual = questoes.get(i);
            questaoAtual.escrevaQuestao();

            String resposta = questaoAtual.leiaResposta();
            boolean acertou = questaoAtual.isCorreta(resposta);
        }
    }
}