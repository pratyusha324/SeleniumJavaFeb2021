package day4;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your City: ");
        String city = sc.nextLine();

        System.out.println(name+ " is from "+ city);

    }
}

