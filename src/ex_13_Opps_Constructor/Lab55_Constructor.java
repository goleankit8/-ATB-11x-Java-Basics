package ex_13_Opps_Constructor;

public class Lab55_Constructor {
    public static void main(String[] args) {

        Baby b1=new Baby();
        new Baby();




    }

    static class Baby {
        //Attribute
        String name;


        //Behaviour
        void cry() {
            System.out.println("Cry ");
        }

        void sleep() {
            System.out.println("Sleep");
        }

        void eat() {
            System.out.println("eat");
        }
        Baby(){
            System.out.println("Default COnstructor");
            //Fetch dat from the My SQL
            //Read from CSV file
            // open a file and read the file
        }
    }
}
