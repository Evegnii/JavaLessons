package Lesson2;

public class Lesson2_Super extends Lesson2_This {

    Lesson2_Super(int speed) {
        super(speed);
    }

    Lesson2_Super(int speed, int length) {
        super(speed, length);
    }

    public static void main(String[] args) {
        Lesson2_This l1 = new Lesson2_Super(1000);
        Lesson2_This l2 = new Lesson2_Super(1000, 100);
        System.out.println(l1.speed);   // Output 1000 becouse in Lesson2_this constructor with one parameter this.speed = speed;
        System.out.println(l2.speed + " " + l2.length);   // Output 2
    }
}
