package com.praveen.dataStructure;

import com.praveen.dataStructure.SLQueue.ISLQueue;
import com.praveen.dataStructure.SLQueue.SLQueueImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        System.out.println( "Hello World!" );
        ISLQueue<String> queue = new SLQueueImpl<String>("0");
        queue.append("1");
        queue.append("2");
        queue.append("3");
        queue.append("4");
        queue.append("5");
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        queue.pop();
        System.out.println( "Hello World!" );
        queue.pop();
        System.out.println( "Hello World!" );
        queue.pop();

    }
}
