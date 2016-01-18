package org.sergei._1st.item49;

/**
 * Created by Sergei on 18.01.2016.
 */
public class DeadlockQueue extends WorkQueue {
    @Override
    protected void processItem(final Object workItem) throws InterruptedException {
        // Create a new thread that returns workItem to queue
        Thread child = new Thread("Child") {
            public void run() {
                // method enqueue synchronize on queue object,
                // but this monitor currently in use by WorkerThread
                enqueue(workItem); }
        };
        child.start();
        child.join(); // Deadlock!
    }
}
