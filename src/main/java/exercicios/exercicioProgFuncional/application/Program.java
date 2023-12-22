package exercicios.exercicioProgFuncional.application;

import exercicios.exercicioProgFuncional.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static String path = "src/main/java/exercicios/exercicioProgFuncional/files/inFiles.txt";
    static List<Employee> employeeList = new ArrayList<Employee>();

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line;
            while((line = bf.readLine()) != null){
                String[] raw = line.split(",");
                Employee newEmployee = new Employee(raw[0], raw[1], Double.parseDouble(raw[2]));
                employeeList.add(newEmployee);
            }
        }
        catch(IOException e){
            System.out.println("path não válido");
        }
        System.out.print("Enter salary: ");
        Double minSalary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Email of people whose salary is more than: " + minSalary);
        employeeList.stream().filter(p -> p.getSalary() > minSalary).map(Employee::getEmail).forEach(System.out::println);
        System.out.print("Sum of salary of people whose name starts with 'M': " + employeeList.stream().filter(employee -> employee.getName().charAt(0) == 'M').map(Employee::getSalary).reduce(0.0, Double::sum));
    }


}
