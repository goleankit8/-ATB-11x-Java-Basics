package ex_05_If_loop;

import java.util.Scanner;

public class Lab035_Triangle_class_HR {
    public static void main(String[] args) {
        //int a=10;
        //int b=10;
        //int c=10;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Value a >>");
        int a=sc.nextInt();
        System.out.println("Enter Value b >>");
        int b=sc.nextInt();
        System.out.println("Enter Value c >>");
        int c= sc.nextInt();

        if(a==b & b==c){
            System.out.println("Acute Angle Trinagle");
        } else if (a==b & b!=c) {
            System.out.println("Isosceles-Right angle triangle");
        }
        else {
            System.out.println("Scalene-obtuse angle");
        }
    }
}
