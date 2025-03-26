package ex_02_Java_Basics_Part_2;

public class Lab017_Char_Literral {
    public static void main(String[] args) {
        //escape characters
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';

        System.out.println("Ankit" +new_line+"Gole");
        System.out.println("Ankit"+ tab_line+"Gole");
        System.out.println("Ankit"+back_space+"Gole");
        System.out.println("Ankit Gole"+carriage_return+"AbCd");

        System.out.println("Ankit \n Gole \n sdfdf \n dfvds");
    }
}
