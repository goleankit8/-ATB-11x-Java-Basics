package ex_07_Loop;

public class Lab040_For_Loop_even_odd {
    public static void main(String[] args) {
        for(int i=0; i<50; i++){
            if(i%2==0) {
                System.out.println("Even >>" + i);
            }
            else{
                    System.out.println("Odd >>" +i);
                }
        }
    }
}
