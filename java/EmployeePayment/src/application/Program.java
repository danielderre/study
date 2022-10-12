package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.printf("Employee #%d data: \n",i);
            System.out.println("Outsourced? ");
            char ch = sc.next().charAt(0);

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Hours: ");
            int hours = sc.nextInt();

            System.out.println("Value per hour? ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add( new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                list.add( new Employee(name,hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("Payments: ");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.payment()));
        }

        sc.close();
    }
}
