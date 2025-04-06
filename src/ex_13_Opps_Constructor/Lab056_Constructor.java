package ex_13_Opps_Constructor;

public class Lab056_Constructor {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.name = "Honda";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);
        System.out.println(";;;;;;;;;;;;;");

        Car c2 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

    }
}

     class Car{
        String name;
        int year;
        String model;

    Car(){
        name="Unkown Car";
        year=1992;
        model="XXX";
    }

    }
