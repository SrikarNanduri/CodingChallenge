package DaysJava.week1;

import java.util.Scanner;

public class Day7OneEditAway {
    public static void main(String [] args){
        Day7OneEditAway oneEditAway = new Day7OneEditAway();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string one:");
        String s1 = scanner.nextLine();
        System.out.println("Enter string two:");
        String s2 = scanner.nextLine();
        oneEditAway.oneEditAway(s1, s2);

    }

    private void oneEditAway(String s1, String s2){
        int l,c=0;
        int i;

       if(Math.abs(s1.length() - s2.length()) <= 1){
           if(s1.length()<s2.length())
               l=s1.length();
           else
               l=s2.length();
           for(i=0;i<l;i++)
           {
               if(s1.charAt(i)==s2.charAt(i))
                   c++;
           }
           if((c==l)||((c+1)==l && (s1.length()==s2.length())))
               System.out.println(s1+" and "+s2+" are one edit away");
           else
               System.out.println(s1+" and "+s2+" are not one edit away ");
       } else
           System.out.println(s1+" and "+s2+" are not one edit away ");

    }
}
