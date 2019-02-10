package DaysJava.week1;


import java.util.HashMap;
import java.util.Scanner;

public class Day4MaxCharater {

        static void findMaximumOccurring(String input){
            HashMap<Character, Integer> map = new HashMap<>();
            char[] chars = input.toCharArray();
            for (int i = 0; i <chars.length ; i++) {
                char c = chars[i];
                if(map.containsKey(c)){
                    int count = map.get(c);
                    count++;
                    map.put(c, count);
                }else{
                    map.put(c, 1);
                }
            }
            System.out.println(map);
            Character key = map.entrySet().stream().max((o1, o2) -> o1.getValue() > o2.getValue()? 1 : -1).get().getKey();
            System.out.println("The max occuring charater is " + key + " and it appeared " + map.get(key) + "times");
        }

        public static void main(String[] args) {
            System.out.println("Enter a string:");
            String input = new Scanner(System.in).nextLine();
            System.out.println("Input- " + input);
            findMaximumOccurring(input);
        }
}
