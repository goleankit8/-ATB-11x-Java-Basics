package ex_07_Loop;

public class Lab042_For_Loop_Continue {
    public static void main(String[] args) {
        //Continue
        for (int i = 0; i < 50; i++) {
            if (i == 5) {
                continue;  ////Skip the below program
            }
            System.out.println(i);
        }
    }
}
