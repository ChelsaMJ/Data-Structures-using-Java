package queues;

public class QueueUsingCircularArray {
    public static void main(String[] args) {
        // Create a circular queue with a maximum size of 5
        CircularQueue q2 = new CircularQueue(5);
        System.out.println("Is the queue empty? " + q2.isEmpty());

        // Add an element to the queue
        q2.enqueue(5);
        System.out.println("Is the queue empty after enqueuing? " + q2.isEmpty());

        // Add few more elements
        q2.enqueue(1);
        q2.enqueue(3);
        q2.enqueue(7);
        q2.enqueue(9);
        q2.enqueue(0);
        System.out.println("Is the queue empty? " + q2.isEmpty());
        System.out.println("Is the queue Full? " + q2.isFull());

        // Remove few / more elements
        q2.dequeue();
        q2.dequeue();
        q2.dequeue();
        q2.dequeue();
        q2.dequeue();
        q2.dequeue();
        System.out.println("Is the queue empty? " + q2.isEmpty());
        System.out.println("Is the queue Full? " + q2.isFull());
    }
}

class CircularQueue {
    private int[] arr;
    private int size;
    private int front;
    private int rear;

    public CircularQueue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return ((rear + 1) % size == front);
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    // Add an element to the rear of the queue (enqueue)
    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + val);
        } else {
            if (isEmpty()) {
                front = 0; // Update front when the queue is initially empty
            }
            rear = (rear + 1) % size;
            this.arr[rear] = val;
            System.out.println("Enqueued: " + val);
            System.out.println("Rear = " + rear + " Front = " + front + " Size = " + size);
        }
    }

    // Remove an element from the front of the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is already empty. Cannot dequeue.");
            return -1; // Return a default value to indicate an empty queue
        } else {
            int data = this.arr[front];
            if (front == rear) {
                front = rear = -1; // Reset front and rear when the last element is dequeued
            } else {
                front = (front + 1) % size;
            }
            System.out.println("Dequeued: " + data);
            return data;
        }
    }
}
