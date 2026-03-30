package ufpi.sistema.algoritimo.progrmacao;

import ufpi.sistema.algoritimo.progrmacao.atletismo.AltetismoSolucao;
import ufpi.sistema.algoritimo.progrmacao.barris.BarrisSolucao;
import ufpi.sistema.algoritimo.progrmacao.hanoi.TorreHanoi;
import ufpi.sistema.algoritimo.progrmacao.matematica.OperacoesMatematicas;
import ufpi.sistema.algoritimo.progrmacao.pneu.TrocaPneuSolucao;
public class Principal {
    public static void main(String[] args) {

        AltetismoSolucao.executar();
        BarrisSolucao.executar();
        TrocaPneuSolucao.executar();
        TorreHanoi.executar();
        OperacoesMatematicas.executar();

    }
}