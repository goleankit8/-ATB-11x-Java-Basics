package ex_05_If_loop;

import java.util.Scanner;

public class Lab034_Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("The number is even number");
        }
        else{
            System.out.println("The number is odd number");
        }
    }
}
