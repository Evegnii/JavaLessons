package Lesson2;

public class Lesson2_This {
    int speed = 5;
    int length = 5;
    int weight = 5;
    String misc = "";

    Lesson2_This() {
        this.speed = 0;
    }

    Lesson2_This(int speed) {
        this.speed = speed;
    }

    Lesson2_This(int speed, int length) {
        this(2);
        this.length = 2;
    }


    Lesson2_This(int speed, int length, int weight) {
        this(3, 3);
        this.weight = 3;

    }

    Lesson2_This(int other, String misc) {
        this.speed = other * 100;
        this.misc = misc + "Addition";
    }


    public static void main(String[] args) {
        Lesson2_This o1 = new Lesson2_This();
        Lesson2_This o2 = new Lesson2_This(20, 20);
        Lesson2_This o3 = new Lesson2_This(30, 30, 30);
        Lesson2_This o4 = new Lesson2_This(100);
        Lesson2_This o5 = new Lesson2_This(100, "Hello");


        System.out.println(o1.speed + " " + o1.length + " " + o1.weight);  //Output  055
        System.out.println(o2.speed + " " + o2.length + " " + o3.weight);   //Output  223
        System.out.println(o3.speed + " " + o3.length + " " + o3.weight);  //Output  223
        System.out.println(o5.speed + " " + o5.misc);                      //Output  10000 HelloAddition
        System.out.println(o1.speed + " " + o1.length + " " + o1.weight);  //Output  055



    }


}
