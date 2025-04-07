package ex_18_Opps_Polymorphism;

public class Lab066_Method_overloading {
    public static void main(String[] args) {
        Mathoperations m1=new Mathoperations();
        int r1=m1.add(4,5);
        int r2=m1.add(3,5,6);
        double r3=m1.add(5.5,6.5);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }
}

class Mathoperations{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b,int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}