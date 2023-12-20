package exercicios.exercicioExcecoes.application;

import exercicios.exercicioExcecoes.model.entities.Account;
import exercicios.exercicioExcecoes.model.exception.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double initialBalance = sc.nextDouble();
        sc.nextLine();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();
        sc.nextLine();
        Account acc = new Account(number, holder, initialBalance, withdrawLimit);
        System.out.println();
        try {
            System.out.print("Enter amount for withdraw: ");
            Double withdrawAmount = sc.nextDouble();
            sc.nextLine();
            acc.withdraw(withdrawAmount);
            System.out.println("New balance: " + acc.getBalance());
        }
        catch (WithdrawException e){
            System.out.println("WithDraw error: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Erro inesperado");
        }
    }
}
