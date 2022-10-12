package entities;

public class Employee {
    private String name;
    private Integer hours;
    private double valuePerHours;

    public Employee() {}

    public Employee(String name, Integer hours, double valuePerHours) {
        this.name = name;
        this.hours = hours;
        this.valuePerHours = valuePerHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double getValuePerHours() {
        return valuePerHours;
    }

    public void setValuePerHours(double valuePerHours) {
        this.valuePerHours = valuePerHours;
    }

    public double payment () {
        return hours * valuePerHours;
    }
}
