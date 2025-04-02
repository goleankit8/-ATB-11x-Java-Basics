package ex_11_Arrays;

public class Lab053_find_Max_min_inarray {
    public static void main(String[] args) {
        int[] array={25, 14,66, 15,78,65,47,95,15,54,75};

        int max_output=give_me_max(array);
        System.out.println(max_output);

        int min_output=give_me_min(array);
        System.out.println(min_output);

    }
    private static int give_me_max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;





    }
    private static int give_me_min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        return min;
    }
}
