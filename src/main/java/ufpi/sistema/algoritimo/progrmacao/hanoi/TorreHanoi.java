package ufpi.sistema.algoritimo.progrmacao.hanoi;

public class TorreHanoi {

    public static void executar(){
        System.out.println("\n===== TORRE DE HANÓI =====");
        mover(4,"A","B","C");
    }

    private static void mover(int n, String origem, String destino, String auxiliar){

        if(n == 1){
            System.out.println("Mover disco de " + origem + " para " + destino);
            return;
        }

        mover(n-1, origem, auxiliar, destino);
        System.out.println("Mover disco de " + origem + " para " + destino);
        mover(n-1, auxiliar, destino, origem);
    }

}
