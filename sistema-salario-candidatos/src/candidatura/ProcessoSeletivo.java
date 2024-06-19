package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JÚLIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            System.out.println("candidato = " + candidato);
            entrandoEmContato(candidato);
        }

    }

    public static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");

    }

    public static boolean atender() {
        boolean random = new Random().nextBoolean();
        return random;
    }

    public static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JÚLIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            System.out.println("candidato = " + candidato);
        }
    }


    public static void selecaoCandidatos() {
        int candidatosSelecionados = 0;
        int count = 0;
        double salarioBase = 2000.0d;
        String[] candidatos = {"FELIPE", "MÁRCIA", "JÚLIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        while (candidatosSelecionados < 5 && count < candidatos.length) {
            String candidato = candidatos[count];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato [" + candidato + "] pretende o salário de [" + String.format("%.2f", salarioPretendido) + "]");

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato [" + candidato + "] foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            count++;
        }
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0d;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
