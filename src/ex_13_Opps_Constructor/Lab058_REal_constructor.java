package ex_13_Opps_Constructor;

public class Lab058_REal_constructor {
    public static void main(String[] args) {
        Person p1 = new Person("Ankit", 830832328l, "Pune");
        Person p2 = new Person("Pranit", 1234567890l, "XYZ");


    }
}
    class Person{
        String Name;
        long phone;
        String address;
        Person(){

        }
        Person(String name_arg, long phone_arg, String address_arg){
            this.Name=name_arg;
            this.phone=phone_arg;
            this.phone=phone_arg;
        }
    }

