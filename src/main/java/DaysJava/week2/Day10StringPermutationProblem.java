package DaysJava.week2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day10StringPermutationProblem {

    public static void main(String[] args){
        System.out.println("Enter a string: ");
        String permutationString = new Scanner(System.in).nextLine();
        System.out.println(stringPermutationProblem(permutationString));
    }


    private static Set<String> stringPermutationProblem(String permutationString){

        Set<String> perm = new HashSet<>();
        //Handling error scenarios
        if(permutationString == null){
            return null;
        } else if(permutationString.length() == 0){
            perm.add("");
            return perm;
        }


        char initial = permutationString.charAt(0); // first character
        String restOfTheString = permutationString.substring(1); // Full string with out first character

        Set<String> words = stringPermutationProblem(restOfTheString);

        for(String strNew : words){
            for(int i = 0; i<=strNew.length(); i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    private static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }


}
