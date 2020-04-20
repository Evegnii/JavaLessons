package Lesson5;

public class DoubleLinkedList {
    Node head;// head of list
    Node tail;

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
        }
    }


    //Добавление элемента в начало списка
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    //Добавление елемента после указонного
    public void insertAfter(Node prev_Node, int new_data) {
        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_Node.next;
        prev_Node.next = new_node;
        new_node.prev = prev_Node;
        if (new_node.next != null)
            new_node.next.prev = new_node;   //не очень понятно
    }

    //Добавление с конца
    public void append(int new_data) {

        Node new_node = new Node(new_data);
        Node last = head; /* used in step 5*/
        new_node.next = null;

        if (head == null) {    //если пустой то добавим
            new_node.prev = null;
            head = new_node;
            return;
        }
        while (last.next != null)  // проходим до конца листа
            last = last.next;
        last.next = new_node;    // здесь не понятно
        new_node.prev = last; // тоже не понятно
    }

    //Удаление элемента (в данном варианте почти уверен что есть какая то оптимизация для двойного листа)
    public void deleteNode(Node head_ref, Node del) {
        if (head == null || del == null) {
            return;
        }

        if (head == del) {
            head = del.next;
        }

        // Change next only if node to be deleted
        // is NOT the last node
        if (del.next != null) {
            del.next.prev = del.prev;  //не понятна эта строчка
        }

        // Change prev only if node to be deleted
        // is NOT the first node
        if (del.prev != null) {
            del.prev.next = del.next;  // аналогично
        }
        return;
    }


}





