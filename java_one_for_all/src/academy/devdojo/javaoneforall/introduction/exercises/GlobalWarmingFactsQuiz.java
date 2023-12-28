package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    public static void main(String[] args) {
        String[] questions = {
                "Qual é a principal causa do aquecimento global?",
                "Qual gás é frequentemente associado ao efeito estufa e contribui significativamente para o aquecimento global?",
                "Como as atividades humanas, como queima de combustíveis fósseis, afetam o aquecimento global?",
                "Qual é o principal impacto do aquecimento global nos ecossistemas marinhos?",
                "O que podemos fazer para mitigar os efeitos do aquecimento global?"
        };

        String[][] respostaQuestions = {
                {
                        "1) Aumento na emissão de gases poluentes na atmosfera",
                        "2) Variações naturais no clima.",
                        "3) Diminuição da atividade solar",
                        "4) Aumento na produção de energia limpa." },

                {
                        "1) Nitrogênio (N2).",
                        "2) Dióxido de enxofre (SO2).",
                        "3) Metano (CH4).",
                        "4) Ozônio (O3)."
                },
                {
                        "1) Reduzem as emissões de gases de efeito estufa.",
                        "2) Aumentam a absorção de calor pelo oceano.",
                        "3) Contribuem para o aumento das concentrações de gases de efeito estufa na atmosfera.",
                        "4) Causam resfriamento global."
                },
                {
                        "1) Diminuição do nível do mar.",
                        "2) Acidificação dos oceanos.",
                        "3) Aumento na concentração de oxigênio.",
                        "4) Diminuição da temperatura dos oceanos."
                },
                {
                        "1) Aumentar a queima de combustíveis fósseis.",
                        "2) Plantar mais árvores para absorver dióxido de carbono.",
                        "3) Descartar resíduos industriais nos oceanos.",
                        "4) Aumentar a produção de plásticos."
                } };

        Scanner input = new Scanner(System.in);
        int alternativa;
        System.out.println("Desafio Ambiental: Teste Seus Conhecimentos sobre o Aquecimento Global");
        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println(questions[i]);
            for (String resps : respostaQuestions[i]) {
                System.out.println(resps);
            }
            System.out.print("Resposta ->");
            alternativa = input.nextInt();
            System.out.println();
        }
    }
}
