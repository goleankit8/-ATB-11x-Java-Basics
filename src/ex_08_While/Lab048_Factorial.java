package ex_08_While;

import java.util.Scanner;

public class Lab048_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int number=sc.nextInt();
        int fact=1;
        if(number<=0){
            System.out.println(fact);
        }
        else{
            for(int i=1;i<=number; i++)
                fact=fact*i;
        }
        System.out.println("Factorial is " +fact);
    }

}
