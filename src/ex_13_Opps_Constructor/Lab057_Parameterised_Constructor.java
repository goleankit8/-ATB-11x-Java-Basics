package ex_13_Opps_Constructor;

public class Lab057_Parameterised_Constructor {
    public static void main(String[] args) {
        car2 c1 = new car2();
        car2 c2 = new car2();
        System.out.println(c1.name);
        System.out.println(c2.name);

        car2 c3 = new car2("Honda", "AVG", 2000);
        System.out.println(c3.model);
        System.out.println(c3.name);
        System.out.println(c3.year);
        System.out.println("-----------------------");
        car2 c4 = new car2("TATA", "PUNCH", 2015);
        System.out.println(c4.model);
        System.out.println(c4.name);
        System.out.println(c4.year);
        System.out.println("-----------------------");

    }
}
     class car2 {
        String model;
        int year;
        String name;

        car2() {
            model = "XXX";
            year = 1990;
            name = "Unknown Car";
        }

        car2(String model, String name, int year) {
            this.name = name;
            this.model = model;
            this.year = year;
        }
    }

