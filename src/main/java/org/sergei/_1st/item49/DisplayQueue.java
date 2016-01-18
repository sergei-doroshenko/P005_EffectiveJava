package org.sergei._1st.item49;

/**
 * Created by Sergei on 18.01.2016.
 */
public class DisplayQueue extends WorkQueue {

    @Override
    protected void processItem(Object workItem) throws InterruptedException {
        System.out.println(workItem);
        Thread.sleep(1000);
    }
}
