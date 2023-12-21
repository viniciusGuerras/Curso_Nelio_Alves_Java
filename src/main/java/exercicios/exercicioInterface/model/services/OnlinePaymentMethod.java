package exercicios.exercicioInterface.model.services;

public interface OnlinePaymentMethod {

    public Double paymentFee(Double amount);
    public Double interest(Double amount, Integer months);

}
