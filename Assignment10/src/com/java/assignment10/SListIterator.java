package com.java.assignment10;

public class SListIterator<T> {
    Node<T> head;
    Node<T> tail;
    public SListIterator() {
        head=null;
        tail=null;
    }

    public void insert(T data){
        Node<T>  newNode = new Node<>(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void delete(T data){
        Node<T>  tNode = head;
        Node<T> pNode = null;

        if(head.data == data){
            head = tNode.next;
            return;
        }

        while(tNode != null){
            if(tNode.data == data){
                pNode.next = tNode.next;
            }
            pNode = tNode;
            tNode = tNode.next;
        }
    }

    public void print() {
        Node<T>  tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data+"-->");
            tNode = tNode.next;
        }
        System.out.println("Null");
    }
}
