package day4;


import java.util.Scanner;

public class Conditions1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur Rank!");

        int per = sc.nextInt();

        if (per < 35) {
            System.out.println("FAIL");
        }else if (per >=35 && per<45){
            System.out.println("Pass Class");
        }else if (per >= 45 && per <60){
            System.out.println("Second Class");
        }else if (per >= 60 && per <85){
            System.out.println("First Class");
        }else if (per >= 85 && per <=100) {
            System.out.println("Top Class");
        }else{System.out.println( "Contact Admin");
        }




    }
}
