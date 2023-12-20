package exercicios.exercicioAbstracao.Application;

import exercicios.exercicioAbstracao.entities.Pessoa;
import exercicios.exercicioAbstracao.entities.PessoaFisica;
import exercicios.exercicioAbstracao.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    private static List<Pessoa> pessoaList = new ArrayList<Pessoa>();

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int times = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < times; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double income = sc.nextDouble();
            sc.nextLine();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double healtcareWaste = sc.nextDouble();
                sc.nextLine();
                Pessoa newPerson = new PessoaFisica(name, income, healtcareWaste);
                pessoaList.add(newPerson);
            }
            else{
                System.out.print("Number of employees: ");
                int numFun = sc.nextInt();
                sc.nextLine();
                Pessoa newPerson = new PessoaJuridica(name, income, numFun);
                pessoaList.add(newPerson);
            }
        }
        double totalTax = (double) 0;
        for(Pessoa person : pessoaList){
            totalTax += person.impostoPago();
            System.out.println(person.toString());
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: $%.2f\n", totalTax);
    }
}
