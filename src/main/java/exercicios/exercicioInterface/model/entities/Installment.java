package exercicios.exercicioInterface.model.entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Installment {
    private Double amount;
    private LocalDate dueDate;

    public Installment(Double amount, LocalDate dueDate) {
        this.amount = amount;
        this.dueDate = dueDate;
    }

    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return (dueDate.format(formatter) + " - " + String.format("%.2f", amount));

    }
}
