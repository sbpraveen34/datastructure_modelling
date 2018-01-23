package com.praveen.dataStructure.SLQueue;

import com.praveen.dataStructure.LinkedList.SingleLinkedList;
import com.praveen.dataStructure.Node.SLNode;
import com.praveen.dataStructure.exception.EmptyQueueException;
import com.praveen.dataStructure.exception.InvalidNodeStateException;

public class SLQueueImpl<T> extends SingleLinkedList<T> implements ISLQueue<T> {

    private SLNode head;
    private SLNode tail;

    public SLQueueImpl(T data) {
        this.head = createNode(data);
        this.tail = this.head;
    }

    public void append(T data) throws Exception {
        final SLNode newNode = createNode(data);

        if (isQueueEmpty()) {
            this.tail = this.head = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    private boolean isQueueEmpty() {
        return this.head == null && this.tail == null;
    }

    public SLNode pop() throws Exception {
        assertState();

        final SLNode temp = this.head;
        if (this.head.getNext() == null) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.getNext();
        }

        return temp;
    }

    private void assertState() throws Exception {
        if (isQueueEmpty())
            throw new EmptyQueueException("Empty Queue");
        if (this.head == null || this.tail == null) {
            throw new InvalidNodeStateException("Invalid Queue Object Created");
        }
    }

    @Override
    public SLNode getNext() {
        return null;
    }
}
