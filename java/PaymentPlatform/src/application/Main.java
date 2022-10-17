package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("----- Enter contract data -----");
        System.out.println("Contract number: ");
        int number = sc.nextInt();

        System.out.println("Data: ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.println("Amount: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number,date,totalValue);

        System.out.println("Enter number of installments: ");
        int installments = sc.nextInt();

        ContractService contractService = new ContractService(null);
        contractService.processContract(contract, installments);

        System.out.println("Installments: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}