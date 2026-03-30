package ufpi.sistema.algoritimo.progrmacao.pneu;

public class TrocaPneuSolucao {

    public static void executar() {

        System.out.println("\n===== TROCA DE PNEU =====");

        String[] passos = {
                "Parar o carro em local seguro",
                "Acionar freio de mão",
                "Verificar pneu reserva",
                "Pegar macaco e chave de roda",
                "Afrouxar parafusos",
                "Levantar carro",
                "Retirar pneu furado",
                "Colocar pneu reserva",
                "Apertar parafusos",
                "Baixar carro"
        };

        for(int i = 0; i < passos.length; i++){
            System.out.println((i+1) + ". " + passos[i]);
        }
    }
}

