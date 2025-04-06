package ex_14_Opps_Inheritance.ex_16_Opps_multileve_Inheritance;

public class Runnner_multilevel {
    public static void main(String[] args) {
        Son s1=new Son();
        s1.s();
        s1.f();
        s1.GF();
        System.out.println("--------------------");
      GrandFather gf=new GrandFather();
      gf.GF();
        System.out.println("--------------------");
      Father f=new Father();
      f.f();
      f.GF();
        System.out.println("--------------------");
    }
}
