package DaysJava.week2;

import com.google.common.collect.Multimap;
import com.google.common.collect.TreeMultimap;

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

        char[] stringArray = string.toLowerCase().toCharArray();
        Multimap<Character, Integer> indexes = TreeMultimap.create();
        for (char aChar : chars) {
            for (int j = 0; j < string.length(); j++) {
                if (aChar == stringArray[j]) {
                    indexes.put(aChar, j);
                }
            }
        }
        System.out.println(indexes);
    }
}
