package DaysJava.week1;

import java.util.Scanner;

public class Day2PalindromeCheck {
    public static void  main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("/* ===== Palindrome Check ===== */");
        System.out.println("Enter the string to be checked everything is converted to lower case: ");
        String palindromeCheckString = scanner.nextLine().toLowerCase();
        String reversedPalindromeCheckString = new StringBuilder(palindromeCheckString).reverse().toString();
        if(palindromeCheckString.equals(reversedPalindromeCheckString)){
            System.out.println("True - " + reversedPalindromeCheckString + " is equal to " + palindromeCheckString);
        } else {
            System.out.println("False - " + palindromeCheckString + " is not equal to " + reversedPalindromeCheckString);
        }
    }
}
