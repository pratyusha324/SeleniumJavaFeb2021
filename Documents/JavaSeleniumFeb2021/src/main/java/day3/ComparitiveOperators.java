package day3;

public class ComparitiveOperators {

    public static void main(String[] args) {

        int x = 120;
        int y = 102;

        System.out.println(x==y);

        String n1 = "pratyusha";
        String n2 = "Pratyusha";

        System.out.println(n1==n2);

        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
         //lesser
        System.out.println(10<20);
        //greater
        System.out.println(10>20);
        //less than equal to
        System.out.println(10<=20);
        //greater than equal to
        System.out.println(10>=20);
    }
}
