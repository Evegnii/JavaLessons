package Lesson3;

public class Mersedes_C300 extends Civil {

    @Override
    public void drivePublicRoads() {
        System.out.println("Yes");
    }

    @Override
    public void bodyType() {
        System.out.println("Sedan");
    }

    @Override
    public void engineType() {
        System.out.println("Gas");
    }

    @Override
    public void topSpeed() {
        System.out.println("220");

    }

    @Override
    public void amountOfWheels() {
        System.out.println("4");

    }

    @Override
    public int paymentForToll(int amountOfAxels) {
        return super.paymentForToll(amountOfAxels);
    }
}
