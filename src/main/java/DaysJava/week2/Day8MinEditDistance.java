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

        int length;
        int count = 0;
        char [] s1Char = s1.toUpperCase().toCharArray();
        char [] s2Char = s2.toUpperCase().toCharArray();

        if(s1.length() > s2.length()){
            length = s1.length();
        } else if(s1.length() < s2.length()){
            length = s2.length();
        } else {
            length = s1.length();
        }
        System.out.println(length);
        for(int i =0; i < length ; i++){
                if (s1Char[i] != s2Char[i]) {
                    s1Char[i] = s2Char[i];
                    count++;
                }
        }
        System.out.println(s1 + " is converted to " + s2 + " and it took " + count + " steps to complete it now s1 is " + String.valueOf(s1Char));
    }
}
