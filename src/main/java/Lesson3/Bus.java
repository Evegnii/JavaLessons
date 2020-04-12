package Lesson3;

public abstract class Bus extends Commercial{
    public abstract int passengerCapacity();

    public String maxCapacity(int numberOfPassengers){
        if(passengerCapacity()<numberOfPassengers){
            return new String("Слишком много людей");

        }
        return new String("Нормальное колличество людей");
    }

}
