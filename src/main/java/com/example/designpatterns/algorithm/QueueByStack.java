package com.example.designpatterns.algorithm;

import java.util.Queue;
import java.util.Stack;

public class QueueByStack<T> {
    private final Stack<T> stack = new Stack<>();
    private final Stack<T> reversedStack = new Stack<>();

    public int size(){
        return stack.size() + reversedStack.size();
    }

    public boolean empty(){
        return size() == 0;
    }

    public boolean add(T element){
        return stack.add(element);
    };

    public T poll(){
        if (reversedStack.empty()){
            if (stack.empty()){
                return null;
            }
            while (!stack.empty()){
                reversedStack.add(stack.pop());
            }
        }
        return reversedStack.pop();
    }

    public T peek(){
        if (reversedStack.empty()){
            if (stack.empty()){
                return null;
            }
            while (!stack.empty()){
                reversedStack.add(stack.pop());
            }
        }
        return reversedStack.peek();
    }
}
