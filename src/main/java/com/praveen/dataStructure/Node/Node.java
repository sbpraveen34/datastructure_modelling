package com.praveen.dataStructure.Node;

public abstract class Node<T> implements INode<T> {
    T data;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
