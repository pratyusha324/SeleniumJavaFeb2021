public class day1 {

    public static void main(String[] args) {
        //1.Write a Java program to print 'Hello' on screen and then print your name on a separate line
        System.out.println("Hello\nPratyusha!");

        //2.Write a Java program to print the sum of two numbers
        // Test Data :74/36
        int a = 74;
        int b = 36;

        System.out.println(a + b);
        //3.Write a Java program to divide two numbers and print on the screen
        //Test Data :50/3
        int c = 50;
        int d = 3;
        System.out.println(c / d);
        //4.Write a Java program to print the result of the following operations.
        //Test Data:
        //a. -5 + 8 * 6
        //b. (55+9) % 9
        //c. 20 + -3*5 / 8
        //d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + (-3 * 5 / 8));
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        //5 Write a Java program that takes two numbers as input and display the product of two numbers.
        //Test Data:
        //Input first number: 25
        //Input second number: 5
        int x = 25;
        int y = 5;
        System.out.println(x * y);

        //6Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        //Test Data:
        //Input first number: 125
        //Input second number: 24
        int num1 = 125;
        int num2 = 24;

        System.out.println(num1 + num2);
        System.out.println(num1 * num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        //7.Write a Java program that takes a number as input and prints its multiplication table upto 10.
        //Test Data:
        //Input a number: 8
        /*int num = 8;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }*/


        int num4 = 8;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num4 + "x" + i + " = " + (num4 * i));
        }

        /*8Write a Java program to display the following pattern
        Sample Pattern :
           J    a   v     v  a
           J   a a   v   v  a a
        J  J  aaaaa   V V  aaaaa
        J J  a     a   V  a     a */
        System.out.println("    J    a   v     v  a ");
        System.out.println("    J   a a   v   v  a a");
        System.out.println("J   J  aaaaa   V V  aaaaa");
        System.out.println(" JJ   a     a   V  a     a");

        /*9Write a Java program to compute the specified expressions and print the output. Go to the editor
        Test Data:
        ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))*/
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

        /*10.Write a Java program to compute a specified formula
        Specified Formula :
        4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))*/
        double pi = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.println(pi);

        /*11.Write a Java program to print the area and perimeter of a circle.
         Test Data:
         Radius = 7.5*/
        double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("perimeter is =" + perimeter);
        System.out.println("Area is = " + area);

        //12.Write a Java program that takes three numbers as input to calculate and print the average of the numbers

        System.out.print("Input the first number:10");
        double p = 10;
        System.out.print("Input the second number:20");
        double q = 20;
        System.out.print("Input the third number:30");
        double r = 30;
        System.out.print("The average value is "+ (p+ q + r) / 3);

        /*13.Write a Java program to print the area and perimeter of a rectangle.
        Test Data:
        Width = 5.5 Height = 8.5*/


    }

}
