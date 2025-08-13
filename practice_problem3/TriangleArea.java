package practice_problem3;

import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double baseInCm = input.nextDouble();
        double heightInCm = input.nextDouble();
        double cmPerInch = 2.54;

        double areaInSqCm = 0.5 * baseInCm * heightInCm;
        double areaInSqIn = areaInSqCm / (cmPerInch * cmPerInch);

        System.out.println("The Area of the triangle in sq in is " + areaInSqIn
                + " and sq cm is " + areaInSqCm);
    }
}
