package Lesson6;

import java.util.Arrays;

public class ArrayList {
    private Object data[];
    private int actSize = 0;

    public ArrayList() {
        data = new Object[5];  //Размер по умолчанию
    }

    public Object get(int index) {   //не работает ! печатает ссылку но как писать .toString я без понятия
        if (index < actSize) {
            return data[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(Object obj) {
        if (data.length - actSize <= 5) {
            increaseListSize();
        }
        data[actSize++] = data;   // добавляем независимо от того увеличели ли мы массив
    }

    private void increaseListSize() {
        data = Arrays.copyOf(data, data.length * 2);
        System.out.println("\nNew length: " + data.length);
    }

    public Object remove(int index) {
        if (index < actSize) {
            Object object = data[index];
            data[index] = null;  //обнулили значение под индексом
            int temp = index;
            while (temp < actSize) {
                data[temp] = data[temp + 1];
                data[temp + 1] = null;
                temp++;
            }
            actSize--;   //не понятно
            return object;

        }
        else {throw  new ArrayIndexOutOfBoundsException();}
    }
    public int size(){
        return actSize;
    }


}
