package divideconquer;

import java.util.Scanner;

public class Sumoftwostrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isNumeric(str1) && isNumeric(str2)) {
            int num1 = stringToInt(str1);
            int num2 = stringToInt(str2);
            int sum = num1 + num2;
            System.out.println(sum);
        } else {
            System.out.println("error");
        }

        sc.close();
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static int stringToInt(String str) {
        int num = 0;
        for (char c : str.toCharArray()) {
            num = num*10+(c-'0'); 
        }
        return num;
    }
}
