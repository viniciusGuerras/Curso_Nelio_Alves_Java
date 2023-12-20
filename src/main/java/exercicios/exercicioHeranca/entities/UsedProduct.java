package exercicios.exercicioHeranca.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    public UsedProduct(java.lang.Double price, java.lang.String name, Date manufactureDate) {
        super(price, name);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String priceTag(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return this.getName() + " (used) $ " + getPrice() + " (Manufacture date:" + sdf.format(manufactureDate) + ")";
    }
}
