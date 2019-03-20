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
        System.out.println("General Method - substring exists and is at position " +substringSearchProblem(string, substring));
        bruteForceApproach(string, substring);
    }

    private static int substringSearchProblem(String string, String substring) {
        return string.indexOf(substring);
    }

    private static void bruteForceApproach(String string, String substring){
        String str; int position = -1;
        for(int i =0; i < string.length(); i++){
          if(string.charAt(i) == substring.charAt(0)){
              for(int j =1; j < substring.length(); j++){
                  if(string.charAt(i+j) != substring.charAt(j)){
                      break;
                  }
                  if(j == substring.length() - 1) {
                      position = i;
                  }
              }
          }
        }
        System.out.println("Brute Force - substring exists and is at position " + position);

    }

}
