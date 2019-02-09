package DaysJava.week1;

import java.util.Scanner;

public class Day3HammingDistance {
    public static void main(String [] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String firstString = scanner.nextLine();
        System.out.println("Enter second string of same length as first string: ");
        String secondString = scanner.nextLine();

        if (firstString.length() != secondString.length()) {
            System.out.println("Both the strings are of not same length, Please enter same length string :)");
        } else {
            char[] firstStringArray = firstString.toCharArray();
            char[] seconfStringArray = secondString.toCharArray();
            for (int i = 0; i < firstStringArray.length; i++) {
                if(firstStringArray[i] != seconfStringArray[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
