package Lesson7;

import java.util.ArrayList;
import java.util.HashMap;
class HashNode<K, V> {
    K key;
    V value;
    HashNode<K, V> next;   //for linked list in bucket

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
class Map<K, V> {
    private ArrayList<HashNode<K, V>> bucketArray;
    private int numBuckets;  // capacity
    private int size;  //size of array list

    public Map() {
        bucketArray = new ArrayList<>();
        numBuckets = 16;
        size = 0;
        for (int i = 0; i < numBuckets; i++) {
            bucketArray.add(null);      //Зачем??
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    //Вычисляем индекс что бы выбрать бакет
    private int getBucketsIndex(K key) {
        int hashCode = key.hashCode();   //надо переписать хэшкод
        int index = hashCode % numBuckets;   //это что за выражение 123456656/10= берем остаток ?
        return index;
    }

    public V remove(K key) {
        int bucketIndex = getBucketsIndex(key);  //находим в каком бакете лежит ключ
        HashNode<K, V> head = bucketArray.get(bucketIndex);  //траверс по линк листу или по бэлнс три

        HashNode<K, V> prev = null;
        while (head != null) {      //идем по листу ищем совпадение в ключе
            if (head.key.equals(key)) break;
            prev = head;
            head = head.next;

        }
        if (head == null) {
            return null;
        }
        size--; //почему тут ???

        if (prev != null) {   //если это не первый елемент
            prev.next = head.next;
        } else {
            bucketArray.set(bucketIndex, head.next);
        }   //K,V (index,null) если это теперь пустой бакет
        return head.value;    //почему мы что то возвращаем?

    }

    public V get(K key) {
        int bucketIndex = getBucketsIndex(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;


        }
        return null;
    }

    public void add(K key, V value) {
        int bucketIndex = getBucketsIndex(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;   //если ключ уже есть в листе то мы перепишем значение
                return;
            }
            head = head.next;
        }

        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value);
        newNode.next = head;   //почему?
        bucketArray.set(bucketIndex, newNode);

        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            numBuckets = 2 * numBuckets;
            size = 0;
            for (int i = 0; i < numBuckets; i++)
                bucketArray.add(null);          //зачем ???

            for (HashNode<K, V> hashNode : temp) {
                while (hashNode != null) {
                    add(hashNode.key, hashNode.value);     //Обясни себе рекурсию
                    hashNode = hashNode.next;
                }
            }

        }
    }}







