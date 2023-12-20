package exercicios.exercicioHeranca.entities;

public class Product {

    private Double price;
    private String name;

    public Product(java.lang.Double price, java.lang.String name) {
        this.price = price;
        this.name = name;
    }

    public java.lang.Double getPrice() {
        return price;
    }
    public void setPrice(java.lang.Double price) {
        this.price = price;
    }
    public java.lang.String getName() {
        return name;
    }
    public void setName(java.lang.String name) {
        this.name = name;
    }
    public String priceTag(){
        return this.getName() + " $ " + this.getPrice();
    }
}
