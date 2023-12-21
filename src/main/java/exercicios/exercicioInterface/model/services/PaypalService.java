package exercicios.exercicioInterface.model.services;

public class PaypalService implements OnlinePaymentMethod {

    public PaypalService(){
    }

    @Override
    public Double paymentFee(Double amount) {
        return amount + (amount * 2/100.0);
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount + ((amount * 1/100.0) * months);
    }
}
