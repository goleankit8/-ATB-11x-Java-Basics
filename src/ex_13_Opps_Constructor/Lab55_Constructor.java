package ex_13_Opps_Constructor;

public class Lab55_Constructor {
    public void main(String[] args) {

        Baby b1=new Baby();



    }

    class Baby {
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
        }
    }
}
