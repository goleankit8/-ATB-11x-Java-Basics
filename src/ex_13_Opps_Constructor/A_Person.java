package ex_13_Opps_Constructor;

public class A_Person {

    public static void main(String[] args) {

        person2 P1 = new person2();
        System.out.println(P1.name);
        System.out.println(P1.age);
        System.out.println(P1.address);
        System.out.println(P1.phone_no);
        System.out.println(P1.isMale);

        person2 P2 = new person2("AVG",32,"Jaipur","78456465",true);
        P2.eat();
        P2.sleep();
        //P1.printDetails();
        person2 P3 = new person2("Ankit",15,true);
        P3.walk();
        P3.doHome();
        P3.printDetails();

            }
        }
        class person2{
            String name;
            int age;
            String address;
            String phone_no;
            boolean isMale;

            person2(){
                name = "Ankit";
                age = 25;
                address = "Amravati";
                phone_no = "1234568790";
                isMale = true;
            }
            void eat(){
                System.out.println(this.name + "is Eating!");
            }
            void sleep(){
                System.out.println(this.name + "is Sleeping!");
            }
            void walk(){
                System.out.println(this.name + "is Walking!");
            }
            void doHome(){
                System.out.println(this.name + "is Doing Homework!");
            }
            person2(String name,int age,String address,String phone_no,boolean isMale){
                this.name = name;
                this.age = age;
                this.address = address;
                this.phone_no = phone_no;
                this.isMale = isMale;
            }
            person2(String name,int age,boolean isMale){
                this.name = name;
                this.age = age;
                this.isMale = isMale;
            }
            void printDetails(){
                System.out.println("Name - "+name);
                System.out.println("Age - "+age);
                System.out.println("Address - "+address);
                System.out.println("Phone - "+phone_no);
                System.out.println("Is Male - "+isMale);
                System.out.println("-----------------------------------------------------------");
            }
        }


