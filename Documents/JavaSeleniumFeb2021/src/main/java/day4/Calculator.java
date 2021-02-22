package day4;

import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        // class name Ref = new Calculator
        //Calculator cal = new Calculator();
        /*cal.add(10,20);
        cal.substraction(20,10);*/
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1 = sc.nextInt();//Next int is a method for accepting integer
        System.out.println("Enter 2nd number: ");
        int n2 = sc.nextInt();

        cal.add(n1,n2);
        cal.substraction(n1,n2);


    }

    //Method

    //Access Modifier ,void - return type,method Name(parameter)
    public void add(int a,int b){

        int sum = a+b;

        System.out.println("Sum: "+sum);
    }
 //method without return type
    public void substraction (int a,int b){
        int sub = a-b;
        System.out.println("Sum: "+ sub);
    }


}
