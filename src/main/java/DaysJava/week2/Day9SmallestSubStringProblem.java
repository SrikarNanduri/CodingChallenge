package DaysJava.week2;

import java.util.Scanner;

public class Day9SmallestSubStringProblem {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.next();
        System.out.println("Enter size of character array");
       int n=scanner.nextInt();
        char[] chars = new char[n];
        for(int i=0;i<n;i++)
            chars[i]=scanner.next().charAt(0);

        smallestSubString(chars, string);
    }

    private static void smallestSubString(char[] chars, String string ){

    }
}
