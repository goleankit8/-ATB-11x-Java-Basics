package ex_18_Opps_Polymorphism;

public class Lab067_Method_Overriding {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Sound");
    }

}
class Dog extends Animal{
    void sound(){
        System.out.println("BArk");
    }
}