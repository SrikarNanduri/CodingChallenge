package DaysJava.week2;

import java.util.Scanner;

public class Day8MinEditDistance {
    public static void main(String [] args){
        Day8MinEditDistance editDistance = new Day8MinEditDistance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String s2 = scanner.nextLine();
        editDistance.minEditDistance(s1, s2);
    }

    private void minEditDistance(String s1, String s2){

    }
}
