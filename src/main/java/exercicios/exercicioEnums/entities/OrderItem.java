package exercicios.exercicioEnums.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product produto;

    public OrderItem(Integer quantity, Product produto) {
        this.quantity = quantity;
        this.produto = produto;
        this.price = produto.getPrice();
    }

    public Product getProduto(){
        return this.produto;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public void addQuantity(Integer quantity){
        this.quantity += quantity;
    }
    public void removeQuantity(Integer quantity){
        this.quantity -= quantity;
    }

    public Double subTotal(){
        return (this.price * this.quantity);
    }
    public String toString(){
        return this.produto.getName()  + ", $" + this.produto.getPrice() + ", Quantity: " + this.quantity + String.format(", Subtotal: $%.2f", this.subTotal());
    }

}
