package Lesson3;

public abstract class Civil implements Car {

    public abstract void drivePublicRoads();

    public int paymentForToll(int amountOfAxels) {
        int payment = amountOfAxels * 2;
        return payment; // платная дорога для гражданских авто по два доллара за ось
    }

    public void driveInDownTown() {
        System.out.println("This civil car can drive in center of the city");
    }


}
