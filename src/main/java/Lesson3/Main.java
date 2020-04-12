package Lesson3;

public class Main {
    public static void main(String[] args) {
        Civil mersedes = new Mersedes_C300();
        Mersedes_C300 mersedes2 = new Mersedes_C300();
        Commercial pazik = new Pazik();
        Bus pazik1=new Pazik();





        System.out.println(mersedes.paymentForToll(2) + "$ for toll");
        mersedes.driveInDownTown();
        mersedes.amountOfWheels();
        System.out.println(mersedes2.paymentForToll(2) + "$ for toll");
        System.out.println(pazik.paymentForToll(2) + "$ for toll");
        System.out.println("This car had dangerous Load == " + pazik.ifHazard("GAS"));
        System.out.println(pazik1.maxCapacity(55));

    }

}
