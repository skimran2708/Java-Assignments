package com.java.assignment10;

public class Main {

    public static void main(String[] args) {
        SList<Integer> list = new SList<>();
        SListIterator<Integer> sListIterator = list.iterator();

        // inserting the nodes in linked list
        sListIterator.insert(20);
        sListIterator.insert(30);
        sListIterator.insert(40);
        sListIterator.insert(50);

        sListIterator.print();

        sListIterator.delete(40);
        sListIterator.delete(50);

        sListIterator.print();
    }
}
