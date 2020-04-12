package Lesson3;

public abstract class Commercial implements Car {
    public boolean ifHazard(String typeOfLoad) {
        if ((typeOfLoad.toLowerCase()).equals("gas")) {
            return true;
        }
        return false;
    }

    public int paymentForToll(int amountOfAxels) {
        int payment = amountOfAxels * 10;
        return payment; // платная дорога для коммерческих авто по 10$ за ось
    }

}
