package application;

import entities.Acc;

import java.util.Locale;
import java.util.Scanner;

public class BankItau {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Acc conta;

        System.out.println("Banco dos Cria");
        System.out.printf("Matricula: ");
        int matricula = scan.nextInt();
        System.out.printf("Nome: ");
        scan.nextLine();
        String nome = scan.nextLine();
        System.out.println("Deseja realizar um depósito inicial? (apenas S ou N)");
        char seletor = scan.next().charAt(0);
        seletor = Character.toUpperCase(seletor);
        if (seletor == 'S') {
            System.out.print("Valor: ");
            double depositoInicial = scan.nextDouble();
            conta = new Acc(matricula, nome, depositoInicial);
        } else {
            conta = new Acc(matricula, nome);
        }

        System.out.println();
        System.out.println(conta);

        System.out.println();
        System.out.println("Depósito: ");
        double valorDeposito = scan.nextDouble();
        conta.depositarDinheiro(valorDeposito);

        System.out.println();
        System.out.println(conta);

        System.out.println();
        System.out.println("Saque: ");
        double valorSaque = scan.nextDouble();
        conta.sacarDinheiro(valorSaque);

        System.out.println();
        System.out.println(conta);

        scan.close();
    }
}
