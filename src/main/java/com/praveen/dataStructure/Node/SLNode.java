package com.praveen.dataStructure.Node;

public class SLNode<T> extends Node<T> {
    SLNode next;

    public SLNode(T data, SLNode next) {
        super(data);
        this.next = next;
    }

    public SLNode getNext() {
        return next;
    }

    public void setNext(SLNode next) {
        this.next = next;
    }
}
