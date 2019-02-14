package DaysJava.week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        int difference = Math.abs(s1.length() - s2.length());
        int count = 0;
        List<Character> reverse = new ArrayList<>();
        List<Character> s1Char = s1.toUpperCase().chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        List<Character> s2Char = s2.toUpperCase().chars().mapToObj(e -> (char)e).collect(Collectors.toList());

        if(s1.length() > s2.length()){
            length = s2.length();
        } else if(s1.length() < s2.length()){
            length = s1.length();
        } else {
            length = s1.length();
        }
        System.out.println(length);
        boolean isS1Greater = length == s2.length() && length < s1.length();
        for(int i = 0; i < length ; i++){
                if (s1Char.get(i) != s2Char.get(i)) {
                    s1Char.set(i, s2Char.get(i));
                    count++;
                }
                if(isS1Greater){
                    s1Char.subList(length, s1Char.size()).clear();
                    break;
                }
        }
        if(!isS1Greater) {
            for (int j = length + difference; j > length; j--) {
                reverse.add(s2Char.get(j - 1));
                count++;
            }
        }
        Collections.reverse(reverse);
        s1Char.addAll(reverse);
        String str = s1Char.stream().map(Object::toString).collect(Collectors.joining());
        System.out.println(s1 + " is converted to " + s2 + " and it took " + count + " steps to complete it now s1 is " + str);
    }
}
