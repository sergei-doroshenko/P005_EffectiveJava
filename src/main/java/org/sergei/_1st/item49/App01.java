package org.sergei._1st.item49;

/**
 * Created by Sergei on 18.01.2016.
 */
public class App01 {
    public static void main(String[] args) {
        WorkQueue queue = new DeadlockQueue();
        queue.enqueue("First task");
        queue.enqueue("Second task");
        queue.enqueue("3rd task");
//        queue.stop();
    }
}
