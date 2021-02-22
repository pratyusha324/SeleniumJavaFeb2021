package day4;

public class Method0 {
    public static void main(String[] args) {
        Method0 m = new Method0();
        m.studentAdmission("Arvind","SFO",34322);
        m.studentAdmission("Teju","Boston",6544,"MIT");

    }
      //method over loading : same name with different parameters
    public void studentAdmission(String name,String city,int pin){

        System.out.println("Student name is "+ name);
        System.out.println(name + " is from " + city);
        System.out.println( city +" pincode is "+ pin);
}

    public void studentAdmission(String name,String city,int pin,String university) {

        System.out.println("Student name is " + name);
        System.out.println(name + " is from " + city);
        System.out.println(city + " pincode is " + pin);
        System.out.println(name + " is studying in " + university);


    }

        }