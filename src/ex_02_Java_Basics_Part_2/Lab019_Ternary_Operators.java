package ex_02_Java_Basics_Part_2;

public class Lab019_Ternary_Operators {
    //Nested Ternary
    //result=condition1 ? expression1 : (Condition2 ? expression2 : expression3)
    public static void main(String[] args) {


        int number = 5;
        String result = (number > 10) ? (number > 20 ? "N>20" : "N<20") : "B";
        System.out.println(result);
    }
}
