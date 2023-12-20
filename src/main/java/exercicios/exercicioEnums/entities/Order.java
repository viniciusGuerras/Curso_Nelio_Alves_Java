package exercicios.exercicioEnums.entities;

import exercicios.exercicioEnums.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    Client client;
    private List<OrderItem> orders = new ArrayList<>();

    public Order(OrderStatus status, Client client) {
        this.moment = new Date();
        this.client = client;
        this.status = status;
    }
    public void addItem(OrderItem order){
        orders.add(order);
    }
    public void removeItem(OrderItem order){
        orders.remove(order);
    }
    public Double total(){
        Double sum = (double) 0;
        for(OrderItem oi : orders){
            sum += oi.subTotal();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf01 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        SimpleDateFormat sdf02 = new SimpleDateFormat("(dd/MM/yyyy)");
        sb.append("ORDER SUMMARY:" + "\nOrder moment: ");
        sb.append(sdf01.format(this.moment));
        sb.append("\nOrder status: ");
        sb.append(this.status);
        sb.append("\nClient: ");
        sb.append(client.getName());
        sb.append(" ");
        sb.append(sdf02.format(client.getBirthDate()));
        sb.append(" - ");
        sb.append(client.getEmail());
        sb.append("\nOrder items:");
        for(OrderItem order : orders){
            sb.append("\n");
            sb.append(order.toString());
        }
        sb.append(Double.toString(total()));
        return sb.toString();
    }
}