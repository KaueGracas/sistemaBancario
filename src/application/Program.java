package application;

import model.entities.Conta;
import model.exception.Excecoes;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Entre com a Conta");
        System.out.print("Agência: ");
        int agencia = sc.nextInt();
        sc.nextLine();
        System.out.print("Titular: ");
        String titular = sc.nextLine();
        System.out.print("Saldo Inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Limite para Saque: ");
        double limiteSaque = sc.nextDouble();

        Conta conta = new Conta(agencia, limiteSaque, saldo, titular);

        System.out.println();
        System.out.print("Entre com o valor do Saque: ");
        double quantia = sc.nextDouble();

        try {
            conta.saque(quantia);
            System.out.printf("Saldo Atualizado: %.2f%n", conta.getSaldo());
        } catch (Excecoes e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

