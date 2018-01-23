package com.praveen.dataStructure.Node;

public class BinaryTreeNode<T> extends Node<T> {
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(T data, BinaryTreeNode left, BinaryTreeNode right) {
        super(data);
        this.left = left;
        this.right = right;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
}
