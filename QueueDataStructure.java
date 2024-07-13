public class QueueDataStructure {
    public static void main(String[] args) {

    }
}

class QueueData {
    int capacity;
    int front;
    int rear;
    int currentSize;
    int queueArr[];

    QueueData(int capacity) {
        this.capacity = capacity;
        front = 0;
        rear = -1;
        queueArr = new int[this.capacity];
    }

    public boolean isFull() {
        if (currentSize == capacity) {
            System.out.println("full");
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (currentSize == 0) {
            System.out.println("empty");
            return true;
        }
        return false;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("empty");
            return -1;
        }
        return queueArr[front];
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("full");
        } else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }
            queueArr[rear] = data;
            currentSize++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        } else {
            front++;
            currentSize--;
            if (front == capacity - 1) {
                return queueArr[front--];
            } else {
                return queueArr[front - 1];
            }
        }
    }
}
