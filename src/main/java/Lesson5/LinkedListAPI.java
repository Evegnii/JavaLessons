package Lesson5;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListAPI {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(32);
        list.add(6);
        list.add(76);
        list.add(89);

        ListIterator<Integer> iterator=list.listIterator();
        iterator.next();
        iterator.next();
        iterator.next();


        System.out.println(list);
        System.out.println(list.contains(0));
        iterator.add(0);
        System.out.println(list.contains(0)+ "Index = "+ list.indexOf(0));
        System.out.println(list.set(5,100));
        System.out.println(list);
        list.clear();
        System.out.println(list);

        /* Output [6, 5, 4, 32, 6, 76, 89]
        false
        trueIndex = 3
        6
        [6, 5, 4, 0, 32, 100, 76, 89]
        []*/

    }
}
