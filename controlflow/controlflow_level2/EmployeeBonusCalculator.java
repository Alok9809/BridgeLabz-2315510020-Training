package controlflow_level2;

import java.util.Scanner;

class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus Amount: " + bonus);
        } else {
            System.out.println("No bonus. Years of service must be more than 5.");
        }
        input.close();
    }
}
