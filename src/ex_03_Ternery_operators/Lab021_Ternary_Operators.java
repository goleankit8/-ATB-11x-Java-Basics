package ex_03_Ternery_operators;

public class Lab021_Ternary_Operators {
    public static void main(String[] args) {
        int n1=5;
        int n2=8;
        int n3=-15;

        //n1>n2 and n1>n3 --> n1
        //n2>n1 nad n2>n3 --> n2
        //n3>n1 and n3>n2 -->

        int max =(n1>n2 ? (n1>n3) ? n1:n3: (n2>n3) ? n2:n3);
        System.out.println("Max is "+ max);


    }
}
