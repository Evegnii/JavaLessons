package Lesson2;

public class Animal {
    int a;
    int b;

    Animal(int a,int b) {
        this.a = a;
        this.b = b;

    }
    Animal(int a) {
        this.a = a;


    }
    @Override
    public int hashCode(){     // надо выяснить что такое native в описании метода
        final int prime=31;
        int result = 1;
        result=prime*result+a;
        result=prime*result+b;
        return result;

    }




    public boolean equals(Animal a2) {
        if (a2 == this) {     // Если обьект (ссылка на него) равен сам себе return true
            return true;
        }
        if (!(a2 instanceof Animal)) {  // Тут нужно изучить подробнее
            return false;
        }
        Animal animal = (Animal) a2;  // Эту строку понял частично
        return this.a== animal.a && this.b == animal .b ;   // сравниваем содержимое классов a2 c полем конструктора
    }


}
