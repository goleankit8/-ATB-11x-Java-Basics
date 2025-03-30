package ex_08_While;

import java.util.Random;
import java.util.Scanner;

public class Lab049_Guessing_Game {
    public static void main(String[] args) {
        Random random=new Random();
        int numerToGuess=random.nextInt(10)+1;
        System.out.println(numerToGuess);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int guess;
        int attempts=0;
        while(true){
          guess= sc.nextInt();
          attempts++;

          if(guess <numerToGuess){
              System.out.println("Too low, try again ");
          }
          else{
              System.out.println("Correct");
          }
        }
    }
}
