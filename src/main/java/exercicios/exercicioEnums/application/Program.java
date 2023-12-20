package exercicios.exercicioEnums.application;

import exercicios.exercicioEnums.entities.Client;
import exercicios.exercicioEnums.entities.Order;
import exercicios.exercicioEnums.entities.OrderItem;
import exercicios.exercicioEnums.entities.Product;
import exercicios.exercicioEnums.enums.OrderStatus;

import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();
        Client myClient = new Client(name, email, birthDate);
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        Order myOrder = new Order(status, myClient);
        System.out.println("How many items to this order?");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= quantidade; i++){
            System.out.print("Enter #" + i + " item data:");
            System.out.print("\nProduct name: ");
            String product_name = sc.nextLine();
            System.out.print("Product price: ");
            Double product_price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            Product newProduct = new Product(product_name, product_price);
            OrderItem newOrderItem = new OrderItem(quantity, newProduct);
            myOrder.addItem(newOrderItem);
        }

        System.out.println(myOrder);

        sc.close();
    }
}
