package ufpi.sistema.algoritimo.progrmacao.barris;

public class BarrisSolucao {

    public static void executar() {

        int A = 0;
        int B = 5;
        int C = 0;

        imprimir(A,B,C);

        C = 3;
        B = 2;
        imprimir(A,B,C);

        A = 3;
        C = 0;
        imprimir(A,B,C);

        C = 2;
        B = 0;
        imprimir(A,B,C);

        B = 5;
        imprimir(A,B,C);

        B = 4;
        C = 3;
        imprimir(A,B,C);

        A = 4;
        C = 0;

        System.out.println("Resultado final:");
        imprimir(A,B,C);
    }

    private static void imprimir(int A, int B, int C){
        System.out.println("A=" + A + " B=" + B + " C=" + C);
    }

}
