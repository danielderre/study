package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter vehicle rent data: ");
        System.out.print("Vehicle model: ");
        String carModel = sc.nextLine();
        System.out.println("Check in date (dd/mm/yyyy hh:mm): ");
        LocalDateTime checkIn = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.println("Check out date (dd/mm/yyyy hh:mm): ");
        LocalDateTime checkOut = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental carRental = new CarRental(checkIn,checkOut,new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();


        RentalService rentalService = new RentalService(pricePerHour,pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println("----------------------------");
        System.out.println("INVOICE");
        System.out.printf("Basic payment: %.2f \n", carRental.getInvoice().getBasicPayment());
        System.out.printf("Taxes: %.2f \n", carRental.getInvoice().getTax());
        System.out.printf("Total: %.2f \n ", carRental.getInvoice().getTotalPayment());


    }
}