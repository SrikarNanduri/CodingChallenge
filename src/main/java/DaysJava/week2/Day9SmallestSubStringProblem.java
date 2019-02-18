package DaysJava.week2;

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

        generate(string, chars);
    }

    private static boolean check(String s, char[] c)
    {
        String str=new String(c);
        int k=0;
        for(int i=0;i<c.length;i++)
        {
            if(s.contains(str.substring(i,i+1)))
                k++;
        }
        return k == c.length;
    }

    private static void generate(String str, char c[]) {
        String s;
        int min;
        min=str.length();
        String s1="";
        for(int i=0;i<=str.length()-1;i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                s=str.substring(i,j);
                if(check(s,c))
                {
                    if(min>=s.length())
                    {
                        min=s.length();
                        s1=s;
                    }
                }
            }
        }
        System.out.println(s1);
    }
}
