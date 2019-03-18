package DaysJava.week2;

import java.util.Scanner;

/**
 * Created by Srikar on Mar, 2019
 */

 /*Question – Given two strings, write a program to find the longest string that is a substring of both the given strings.
        Example:
         input: str1 = "abcdefg", str2 = "xyabcz"
         output: "abc"

         input: str1 = "XYXYXYZ", str2 = "XYZYX"
         output: "XYZ"*/

public class Day11LongestCommonSubstring {
private static int max;
private static String resultingString;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        var string1 = scanner.nextLine();
        System.out.println("Enter second string:");
        var string2 = scanner.nextLine();
        longestCommonSubstring(string1, string2);
        System.out.println(resultingString);
    }

    private static void longestCommonSubstring(String string1, String string2) {
        String result;
        for(int i = 0;i <= string1.length()-1;i++)
        {
            for(int j = i+1;j <= string1.length();j++)
            {
                result = string1.substring(i,j);
                if(string2.contains(result))
                {
                    if(max < result.length())
                    {
                        max = result.length();
                        resultingString = result;
                    }
                }
            }
        }
    }

    // This is my first attempt where I've gotten close to finding longest string but it only checks from left to right once.
    private static String longestCommonSubstringFromLeftToRight(String string1, String string2) {

        String result = null ;
        var s1Length = string1.length();
        System.out.println(s1Length);
        for(int i = 0; i < s1Length; i++){
           var str = string1.substring(0,i);
            if(string2.contains(str)){
                result = str;
            }
        }
        return result;
    }

}
