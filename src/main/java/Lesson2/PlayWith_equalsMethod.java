package Lesson2;

public class PlayWith_equalsMethod {


    public static void main(String[] args) {
        int a = 5;
        if (a == 5) {
            System.out.println("ok a=5");
            System.out.println(a);
        }
        Animal a1 = new Animal(2);
        Animal a2 = new Animal(2);
        Animal b1 = new Animal(2);
        Animal b3 = new Animal(2, 2);
        Animal b4 = new Animal(2, 5);


        if (b1.equals(a2)) {
            System.out.println("ok with bv" + b1.b + " " + a2.b);
        }

        if (a1.equals(a2)) {
            System.out.println("ok 2");
        }

        if (a1.hashCode() == a2.hashCode()) {
            System.out.println("HashCodes equal base on content");
        }

        if (b3.equals(b4)) {
            System.out.println("Equals not work at this pointw");
        }
        if (b1.equals(a2)) {
            System.out.println("ok3");
        }


    }


}
