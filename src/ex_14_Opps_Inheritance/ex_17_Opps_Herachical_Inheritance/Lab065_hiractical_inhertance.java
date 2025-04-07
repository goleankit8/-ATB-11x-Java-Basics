package ex_14_Opps_Inheritance.ex_17_Opps_Herachical_Inheritance;



public class Lab065_hiractical_inhertance {
    public static void main(String[] args) {
        Father f1=new Father();
        f1.Home();

        Pramod p1=new Pramod();
        p1.h2();
        p1.Home();

        Ankit a1=new Ankit();
        a1.Home();
        a1.a2();

        Pranit p3=new Pranit();
        p3.Home();
        p3.p2();

    }
}
class Father{
    void Home(){
        System.out.println("Home");
    }
}
class Pramod extends Father{
    void h2(){
        System.out.println("h2-Pramod");
    }
}
class Ankit extends Father {

    void a2() {
        System.out.println("Ankit");
    }
}
class Pranit extends Father{
    void p2(){
        System.out.println("Pranit");
    }
}


