package DaysJava.week2;

import java.util.Scanner;

/**
 * Created by Srikar on Mar, 2019
 */
public class Day12SubstringSearchProblem {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        var string = scanner.nextLine();
        System.out.println("Enter a substring to find if present inside the given string:");
        var substring = scanner.nextLine();
        System.out.println(substringSearchProblem(string, substring));
    }

    private static int substringSearchProblem(String string, String substring) {
        return string.indexOf(substring);
    }

}
