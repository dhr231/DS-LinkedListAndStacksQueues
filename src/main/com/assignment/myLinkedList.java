package com.assignment;

public class MyLinkedList<E> {
    public MyNode<E> head = null;
    private MyNode<E> tail = null;

    public void add(E data) {
        MyNode<E> myNode = new MyNode<>(data);

        if (tail == null) {
            this.tail = myNode;
        }
        if (head != null) {
            myNode.next = this.head;
        }
        this.head = myNode;
    }

    public void printLinkedList() {
        MyNode<E> tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }
}