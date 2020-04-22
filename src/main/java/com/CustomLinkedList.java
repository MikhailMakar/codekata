package com;

import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T> {

    private Node<T> head, tail;

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public void add(T data) {
        Node<T> node = new Node<T>(data, null);
        if (head == null) {
            tail = head = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    public Iterator<T> iterator() {
        return new ListIterator<>(this);
    }
}
