package com.praveen.dataStructure.Node;

public class DLNode<T> extends Node<T> {

    private DLNode next;
    private DLNode prev;

    public DLNode(T data, DLNode next, DLNode prev) {
        super(data);
        this.next = next;
        this.prev = prev;
    }
}
