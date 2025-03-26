package ex_02_Java_Basics_Part_2;

public class Lab020_ternary_Operators {
    public static void main(String[] args) {
        //Find the maximum number between two numbers
        int x=10;
        int y=20;
        System.out.println(Math.max(x,y));

        String max=x>y ? "x is max" : "y is max";
        System.out.println(max);


        //odd even by ternery operators
        int num=5;
        String result=(num%2==0) ? "Even" : "odd";
        System.out.println(result);
    }
}
