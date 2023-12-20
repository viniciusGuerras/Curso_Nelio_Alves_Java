package exercicios.exercicioHeranca.application;

import exercicios.exercicioHeranca.entities.ImportedProduct;
import exercicios.exercicioHeranca.entities.Product;
import exercicios.exercicioHeranca.entities.UsedProduct;

import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    private static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantity; i++) {

            System.out.println("Product #" + (i + 1) + " data");
            System.out.print("Common, used or imported (c/u/i)? ");

            char ch = sc.nextLine().charAt(0);

            System.out.print("Name: ");

            String name = sc.nextLine();

            System.out.print("Price: ");

            Double price = sc.nextDouble();
            sc.nextLine();

            if (ch == 'i') {
                System.out.print("Custom fee: ");
                Double cusFee = sc.nextDouble();
                sc.nextLine();
                Product newProd = new ImportedProduct(price, name, cusFee);
                productList.add(newProd);
            } else if (ch == 'u') {
                System.out.print("Manufacture Date (DD/MM/YYYY): ");
                String stringManuDate = sc.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date manuDate = sdf.parse(stringManuDate);
                Product newProd = new UsedProduct(price, name, manuDate);
                productList.add(newProd);
            } else {
                Product newProd = new Product(price, name);
                productList.add(newProd);
            }
        }
        System.out.println("PRICE TAGS:");
        for(Product prod : productList){
            System.out.println(prod.priceTag());
        }

    }
}
