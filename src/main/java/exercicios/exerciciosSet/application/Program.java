package exercicios.exerciciosSet.application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Set<Integer> students = new HashSet<>();

        System.out.print("How many students for course A? ");
        int quantity = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < quantity; i++) {
            int aux = sc.nextInt();
            sc.nextLine();
            students.add(aux);
        }
        System.out.print("How many students for course B? ");
        quantity = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < quantity; i++) {
            int aux = sc.nextInt();
            sc.nextLine();
            students.add(aux);
        }
        System.out.print("How many students for course C? ");
        quantity = sc.nextInt();
        for (int i = 0; i < quantity; i++) {
            int aux = sc.nextInt();
            sc.nextLine();
            students.add(aux);
        }
        System.out.println("Total students: " + students.size());
    }

}
