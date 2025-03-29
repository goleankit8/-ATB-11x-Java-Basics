package ex_05_If_loop;

import java.util.Scanner;

public class Lab032_if_loop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your edge ");
        int age=scanner.nextInt();
        System.out.println(age);

        if(age>18){
            System.out.println("Allowed to vote");
        }
        else{
            System.out.println("Not allowed to Vote");
        }
    }
}
