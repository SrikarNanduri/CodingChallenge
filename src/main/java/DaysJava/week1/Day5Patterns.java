package DaysJava.week1;

import java.util.Scanner;

public class Day5Patterns {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Day5Patterns patterns = new Day5Patterns();
        System.out.println("Enter the number of lines to print:");
        int n = scanner.nextInt();
        System.out.println("Select a pattern number:");
        switch (scanner.nextInt()){
            case 1 :
                patterns.pattern1(n);
                break;
            case 2 :
                patterns.pattern2(n);
                break;
            case 3 :
                patterns.pattern3(n);
                break;
            case 4 :
                patterns.pattern4(n);
                break;
            case 5 :
                patterns.pattern5(n);
                break;
            case 6 :
                patterns.pattern6(n);
                break;
            case 7 :
                patterns.pattern7(n);
                break;
            case 8 :
                patterns.pattern8(n);
                break;

                default:
                    System.out.println("Select a valid pattern number");
        }
    }


    private void pattern1(int n){
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=i; j++){
            System.out.print(j + "");
            }
            System.out.println();
        }
    }

    private void pattern2(int n){
        int count = 1;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    private void pattern3(int n){
        int i, j;
        for (i=1; i<=n; i++) {
            for (j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (i=n-1; i>=1; i--) {
            for  (j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private void pattern4(int n){

        int i, j;
        for (i=1; i<=n; i++) {
            // Print left white spaces
            for (j=n; j>i; j--) {
                System.out.print("  ");
            }

            // Print the numbers
            for (j=i; j<=(2*i-1); j++) {
                System.out.print(j + " ");
            }

            //print right white spaces
            for (j=(2*i-1) - 1; j>=i; j--) {
                System.out.print(j + " ");
            }

            System.out.println("");
        }
    }

    //TODO: need to complete writing other patterns.

    private void pattern5(int n){

    }

    private void pattern6(int n){

    }

    private void pattern7(int n){

    }


    private void pattern8(int n){

    }


}
