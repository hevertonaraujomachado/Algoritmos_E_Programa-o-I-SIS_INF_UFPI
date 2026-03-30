package ufpi.sistema.algoritimo.progrmacao.matematica;

public class OperacoesMatematicas {

    public static void executar(){

        System.out.println("\n===== OPERAÇÕES =====");

        System.out.println("12 x 4 = " + multiplicar(12,4));
        System.out.println("23 x 11 = " + multiplicar(23,11));

        System.out.println("10 / 2 = " + dividir(10,2));
        System.out.println("175 / 7 = " + dividir(175,7));

        System.out.println("2^8 = " + potencia(2,8));
    }

    private static int multiplicar(int a, int b){

        int resultado = 0;

        for(int i=0;i<b;i++){
            resultado += a;
        }

        return resultado;
    }

    private static int dividir(int a, int b){

        int contador = 0;

        while(a >= b){
            a -= b;
            contador++;
        }

        return contador;
    }

    private static int potencia(int base, int expoente){

        int resultado = 1;

        for(int i=0;i<expoente;i++){
            resultado = multiplicar(resultado, base);
        }

        return resultado;
    }

}
