package com.praveen.dataStructure.SLQueue;

import com.praveen.dataStructure.Node.SLNode;

public interface ISLQueue<T> {
    void append(T data) throws Exception;

    SLNode pop() throws Exception;
}
