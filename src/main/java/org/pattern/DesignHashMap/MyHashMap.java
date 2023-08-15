package org.pattern.DesignHashMap;

public class MyHashMap <K,V>{
    private static final int INITIAL_SIZE = 1<<4;
    private static final int MAX_CAPACITY = 1<<30;

    Entry[] hashTable;

    MyHashMap(){
        hashTable = new Entry[INITIAL_SIZE];
    }

    MyHashMap(int tableSize){
        hashTable = new Entry[tableSize];
    }
    public class Entry<K,V>{
        K key;
        V value;

        Entry next;
        Entry(K key, V value){
            this.key = key;
            this.value = value;
        }

        public K getKey() {return key;}

        public void setKey(K key) {this.key = key;}

        public V getValue() {return value;}

        public void setValue(V value) {this.value = value;}
    }

    public void put(K key, V value){
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        if(node == null){
            Entry entry = new Entry(key, value);
            hashTable[hashCode] = entry;
        }
        else{
            Entry prevNode = node;
            while(node != null){

                if(node.key == key){
                    node.value = value;
                }
                prevNode = node;
                node = node.next;
            }

            Entry newNode = new Entry<>(key, value);
            prevNode.next = newNode;
        }
    }

    public V get(K key){
        int hashCode = key.hashCode() % hashTable.length;
        Entry entry = hashTable[hashCode];
        while(entry != null){
            if(entry.key.equals(key)){
                return (V)entry.value;
            }
            entry = entry.next;
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> mp = new MyHashMap<>(21);

        mp.put(11, "Mohnish");
        mp.put(21, "Sinha");
        mp.put(31, "Rohan");
        mp.put(12, "Sagar");

        System.out.println(mp.get(11));
        System.out.println(mp.get(21));
    }
}
