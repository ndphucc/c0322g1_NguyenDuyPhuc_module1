package ss11_stack_queue.bai_tap.trien_khai_queue;

public class Solution {
    Queue listQueue = new Queue();
    public void enQueue(int element) {
        Node node = new Node(element);
        if(listQueue.getFront()==null) {
            listQueue.front=node;
            listQueue.rear=node;
            listQueue.front=listQueue.rear;

        }else {
            Node temp=listQueue.rear.link;
            listQueue.rear.link=node;
            node.link=temp;
        }
    }
    public Object deQueue() {
        if (listQueue.front==null) {
            return null;
        }else if (listQueue.front.link==listQueue.rear){
            Node temp=listQueue.front;
            listQueue.front=null;
            listQueue.rear=null;
            return temp.data;
        }else {
            Node temp = listQueue.front;
            for (int i = 0; temp.link.link!=listQueue.rear; i++) {
                temp=temp.link;
            }
            Object result= temp.link.link.data;
            temp.link=listQueue.front;
            listQueue.rear=temp;
            return result;
        }
    }
}
