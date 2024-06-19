import exceptions.ParametrosInvalidosException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int initialValue;
        int finalValue;

        System.out.println("\n\n ==== Bem - vindo(a) ao Contador de Alienígenas!  \uD83D\uDC7D ==== \n");
        System.out.println("Por favor informe 2 valores dentro de um intervalo, para eu começar a contar!");
        System.out.println("Obs: O valor inicial do intervalo deve ser MENOR que o valor final do intervalo.\n");

        try {
            System.out.print("Informe o valor de início do intervalo -> ");
            initialValue = input.nextInt();
            System.out.print("Informe o valor de término do intervalo -> ");
            finalValue = input.nextInt();

            printValues(initialValue, finalValue);
        } catch (InputMismatchException e) {
            System.err.println("Por favor, somente informe números do tipo inteiro!");
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void printValues(int initialValue, int finalValue) throws ParametrosInvalidosException {
        if (initialValue < finalValue) {
            for (int i = initialValue; i <= finalValue; i++) {
                System.out.print("\nImprimindo o número " + i);
                printAliens(i);
            }
        } else {
            throw new ParametrosInvalidosException("O valor de inicio do intervalo deve ser MENOR que o valor final. Tente Novamente.");
        }
    }

    private static void printAliens(int i) {
        List<String> aliensList = new ArrayList<>();

        if (i > 0) {
            for (int j = 1; j <= i; j++) {
                aliensList.add("\uD83D\uDC7D");
            }
            aliensList.forEach(alien -> System.out.print(alien + " "));
            aliensList.clear();
        }
    }
}