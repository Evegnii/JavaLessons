package Lesson4;

public class main {
    public static void main(String[] args) {
        Animal gorilla= new Monkey();

        gorilla.setBreed("Gorilla");
        gorilla.setDNA("ZXY");
        gorilla.setPredator(true);
        gorilla.setHeight(150);

        Animal kaputsin= new Monkey();

        kaputsin.setBreed("Kaputsin");
        kaputsin.setDNA("ABC");
        kaputsin.setPredator(false);
        kaputsin.setHeight(40);

        System.out.println("Порода = " + gorilla.getBreed()+ " DNA = "+ gorilla.getDNA() + " Predator = "+ gorilla.isPredator() + " Height = " + gorilla.getHeight());
        System.out.println("Порода = " + kaputsin.getBreed()+ " DNA = "+ kaputsin.getDNA() + " Predator = "+ kaputsin.isPredator() + " Height = " + kaputsin.getHeight());










    }
}
