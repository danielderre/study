package model.entities;

import java.time.LocalDateTime;

public class CarRental {
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental() {
    }

    public CarRental(LocalDateTime checkIn, LocalDateTime checkOut, Vehicle vehicle) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.vehicle = vehicle;
    }

    public CarRental(LocalDateTime checkIn, LocalDateTime checkOut, Vehicle vehicle, Invoice invoice) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.vehicle = vehicle;
        this.invoice = invoice;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
