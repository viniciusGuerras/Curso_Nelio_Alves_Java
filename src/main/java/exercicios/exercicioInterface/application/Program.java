package exercicios.exercicioInterface.application;

import exercicios.exercicioInterface.model.entities.Contract;
import exercicios.exercicioInterface.model.entities.Installment;
import exercicios.exercicioInterface.model.services.ContractService;
import exercicios.exercicioInterface.model.services.OnlinePaymentMethod;
import exercicios.exercicioInterface.model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre os dados do contrato:");
        System.out.print("Número: ");
        int numero = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate dataInicial = LocalDate.parse(leitor.nextLine(), formatter);

        System.out.print("Valor do contrato: ");
        Double valorContrato = leitor.nextDouble();
        leitor.nextLine();

        Contract newContract = new Contract(numero, dataInicial, valorContrato);

        System.out.print("Entre com o numero de parcelas: ");
        int quantiaParcelas = leitor.nextInt();
        leitor.nextLine();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(newContract, quantiaParcelas);

        System.out.println("Parcelas:");
        for(Installment installment : newContract.getInstallments()){
            System.out.println(installment);
        }
    }
}
