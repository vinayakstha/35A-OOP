public class StackDataStructure {
    public static void main(String[] args) {
        StackData sd = new StackData(3);
        sd.push(10);
        sd.push(20);
        System.out.println(sd.peek());
        sd.push(30);
        System.out.println(sd.peek());
        System.out.println(sd.pop());
        System.out.println(sd.peek());
    }
}

class StackData {
    int maxSize;
    int[] stack_arr;
    int top;

    StackData(int maxSize) {
        this.maxSize = maxSize;
        stack_arr = new int[this.maxSize];
        top = -1;
    }

    // if top pointer has not been updated we presumer its empty
    public boolean isEmpty() {
        return top == -1;
    }

    // if the top is on the last index od array, we presume it's full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        }
        return stack_arr[top];
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("full");
        } else {
            top++;
        }
    }

    public int pop() {
        // remove the last element of stack
        if (isEmpty()) {
            System.out.println("empty");
            return -1;
        } else {
            // decrease index
            top--;
            System.out.println(stack_arr[top]);
            return stack_arr[top];
        }
    }
}
