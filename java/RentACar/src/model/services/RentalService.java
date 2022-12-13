package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private final double privatePerHour;
    private final double privatePerDay;

    private final TaxService taxService;

    public RentalService(double privatePerHour, double privatePerDay, TaxService taxService) {
        this.privatePerHour = privatePerHour;
        this.privatePerDay = privatePerDay;
        this.taxService = taxService;
    }

        double valorDiaria;
        String tipoDeVeiculo = getTipoVeiculo().toLowerCase();

        valorDiaria = switch (tipoDeVeiculo) {
            case "passeio" -> 495;
            case "utilitario" -> 580;
            case "esportivo" -> 700;
            default -> throw new InvalidParameterException("Tipo de veiculo invalido!");
        };

        return valorDiaria * duracaoAluguel;
    }
    public void processInvoice(CarRental carRental) {

        double minutes = Duration.between(carRental.getCheckIn(), carRental.getCheckOut()).toMinutes();
        double hours = minutes / 60;

        double basicPayment;

        if (hours <= 12) {
            basicPayment = privatePerHour * Math.ceil(hours);
        } else {
            basicPayment = privatePerDay * Math.ceil(hours/24);
        }

        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment,tax));
    }
}
