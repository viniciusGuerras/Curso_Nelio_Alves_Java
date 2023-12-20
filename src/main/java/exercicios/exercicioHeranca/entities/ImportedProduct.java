package exercicios.exercicioHeranca.entities;


public class ImportedProduct extends Product{
    private Double customFee;

    public ImportedProduct(java.lang.Double price, java.lang.String name, Double customFee) {
        super(price, name);
        this.customFee = customFee;
    }

    public Double totalPrice(){
        return (this.getPrice() + customFee);
    }

    public String priceTag(){
        return this.getName() + " $ " + this.totalPrice() +  " (Custom fee: " + this.customFee + ")" ;
    }
}
