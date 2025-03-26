package ex_02_Java_Basics_Part_2;

public class Lab0018_Narrworing {
    public static void main(String[] args) {
        int val=200;
       // byte b=val; // invalid casting is not allowed
        byte b2=(byte)val;  // Valid - Narrowing-Explict Casting - Allowed
        System.out.println(b2);


    }
}
