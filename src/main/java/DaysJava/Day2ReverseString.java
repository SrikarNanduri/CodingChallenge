package DaysJava;

import java.util.Scanner;

public class Day2ReverseString {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("/* ===== String Reversal ===== */");
        System.out.println("Enter the string to be reversed: ");
        String stringToBeReversed = scanner.nextLine();

        System.out.println(new StringBuilder(stringToBeReversed).reverse().toString());
    }
}