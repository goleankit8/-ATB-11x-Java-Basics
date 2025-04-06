package ex_14_Opps_Inheritance.ex_15_Opps_single_Inheritance;

public class Lab060_Inheritance {
    public static void main(String[] args) {
        Son s1=new Son();
        s1.bhk2();
        s1.bhk3();


    }
}
class Father{
    int gold_f=2000;
    void bhk2(){
        System.out.println("Father- 2BHK");
    }


}

class Son extends Father{
    void bhk3(){
        System.out.println("3bhk Son");
    }
}