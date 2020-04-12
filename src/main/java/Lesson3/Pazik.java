package Lesson3;

public class Pazik extends Bus {
    private int max = 36;

    @Override
    public void bodyType() {
        System.out.println("Маршрутка");
    }

    @Override
    public void engineType() {
        System.out.println("Gas");

    }

    @Override
    public void topSpeed() {
        System.out.println("50 km/h");

    }

    @Override
    public void amountOfWheels() {
        System.out.println("6");

    }


    @Override
    public int passengerCapacity() {
        int maxInrushHour = this.max + 10;
        return maxInrushHour;
    }

    @Override
    public String maxCapacity(int numberOfPassengers) {
        if (passengerCapacity() < numberOfPassengers) {
            return new String("Пазик может не доехать");

        }
        return new String("Пенсионеры довольны");
    }
}


