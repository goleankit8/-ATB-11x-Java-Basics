package ex_11_Arrays;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Lab054_Arrayuserinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array (int) only ");
        String size=sc.next();

        String[] numbers=new String[Integer.parseInt(size)];
        for(int i=0;i< numbers.length; i++){
            System.out.println("Enter the numbers ");
            numbers[i]=sc.next();
        }
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        sc.close();

    }
}
