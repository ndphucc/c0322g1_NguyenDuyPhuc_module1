package ss11_stack_queue.bai_tap.trien_khai_queue;

public class Queue {
    public Node front;
    public Node rear;
    public Queue() {
        if(rear!=null)
        rear.link=front;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }
}
