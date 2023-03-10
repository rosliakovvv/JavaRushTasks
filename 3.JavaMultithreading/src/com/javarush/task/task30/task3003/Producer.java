package com.javarush.task.task30.task3003;

import java.util.concurrent.TransferQueue;

/**
 * Created by User on 13.10.2020.
 */
public class Producer implements Runnable {
    private TransferQueue<ShareItem> queue;

    public Producer(TransferQueue<ShareItem> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 9; i++) {
            if (Thread.currentThread().isInterrupted()){return;}
            System.out.format("Элемент 'ShareItem-%d' добавлен%n",i);
            queue.offer(new ShareItem("ShareItem-" + i,i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
            if (queue.hasWaitingConsumer()){
                System.out.format("Consumer в ожидании!%n");
            }
        }

    }
}
