package DaysJava.week1;

import java.util.Scanner;

public class Day4NoOfVowels {

    public static void main(String[] args){
        int count = 0;
        System.out.println("Enter the string to check for number of vowels: ");
        String checkVowelsString =  new Scanner(System.in).nextLine().toLowerCase();
        for (int i =0; i< checkVowelsString.length(); i++){
            if(checkVowelsString.charAt(i) == 'a'
           || checkVowelsString.charAt(i) == 'e'
           || checkVowelsString.charAt(i) == 'i'
           || checkVowelsString.charAt(i) == 'o'
           || checkVowelsString.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("there are " + count + " vowels");
    }
}
