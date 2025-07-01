package com.example.designpatterns.algorithm;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueByStackTest {
    QueueByStack<String> queue = new QueueByStack<>();

    @Test
    void add() {
        queue.add("A");
        queue.add("B");
        System.out.println(queue.peek());
        queue.add("C");

        queue.poll();
        queue.add("D");
        queue.add("E");
        queue.poll();

        while (!queue.empty()){
            System.out.println(queue.poll());
        }
    }

    @Test
    @Disabled
    void poll() {
    }

    @Test
    @Disabled
    void peek() {
    }
}