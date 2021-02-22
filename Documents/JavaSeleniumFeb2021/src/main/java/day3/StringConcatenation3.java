package day3;

public class StringConcatenation3 {
    public static void main(String[] args) {

        String name = " India ";
       //Replace the value
        System.out.println(name.replace("i","!"));
        //Getting count
        int size = name.length();
        System.out.println("Total no of strings: "+ size);
        //Trim() method is used to remove extra space before and after the string
        System.out.println("Trim the space:" + name.trim().length());
        System.out.println("Trim the space:"+ name);

        System.out.println(name.replace("","-"));
    }
}
