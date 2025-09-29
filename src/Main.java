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
        q5.pergunta ="5. Quais são as cores usadas na Bandeira da Noruega? ";
        q5.opcaoA ="a. Azul, Amarelo e preto";
        q5.opcaoB ="b. Azul, Vermelho e Branco";
        q5.opcaoC ="c. Vermelho, Laranja e Preto";
        q5.opcaoD ="d. Azul, Verde e Vermelho";
        q5.opcaoE ="e. Branco, Cinza e Vermelho";
        q5.correta ="B";
        questoes.add(q5);

        for (int i = 0; i < questoes.size(); i++) {
            System.out.println("----------------------------------------");

            Questao questaoAtual = questoes.get(i);
            questaoAtual.escrevaQuestao();

            String resposta = questaoAtual.leiaResposta();
            boolean acertou = questaoAtual.isCorreta(resposta);
        }
    }
}