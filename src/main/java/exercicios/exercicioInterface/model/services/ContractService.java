package exercicios.exercicioInterface.model.services;

import exercicios.exercicioInterface.model.entities.Contract;
import exercicios.exercicioInterface.model.entities.Installment;

import java.time.LocalDate;


public class ContractService {
    OnlinePaymentMethod onlinePaymentMethod;

    public ContractService(OnlinePaymentMethod onlinePaymentMethod) {
        this.onlinePaymentMethod = onlinePaymentMethod;
    }

    public void processContract(Contract contract, Integer months){
        for (int i = 0; i < months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i + 1);
            Double amount = contract.getTotalValue()/months;
            amount = onlinePaymentMethod.interest(amount, i + 1);
            amount = onlinePaymentMethod.paymentFee(amount);
            Installment newInstallment = new Installment(amount, dueDate);
            contract.addInstallments(newInstallment);
        }

    };
}
