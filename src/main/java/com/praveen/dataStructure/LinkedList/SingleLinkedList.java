package com.praveen.dataStructure.LinkedList;


import com.praveen.dataStructure.Node.SLNode;

public abstract class SingleLinkedList<T> extends LinkedList<SLNode<T>> {
    public abstract SLNode getNext();
    public SLNode createNode(T data) {
        return new SLNode<T>(data, null);
    }
}