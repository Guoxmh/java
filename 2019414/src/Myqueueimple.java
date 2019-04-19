public class Myqueueimple implements IMyQueue{

    class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public Node rear;
    public int usedSize;
    public Myqueueimple(){
        this.head = null;
        this.rear = null;
        this.usedSize = 0;

    }
    @Override
    public boolean empty() {

        return this.head == null;
    }

    @Override
    public int peek() {
        if(empty()){
            throw  new UnsupportedOperationException();
        }
        return this.head.data;
    }

    @Override
    public int poll() {
        if(empty()){
            throw  new UnsupportedOperationException();
        }
        int value = this.head.data;
        head = head.next;
        this.usedSize--;
        return value;
    }

    @Override
    public void add(int item) {
        Node node = new Node(item);
        if(this.head == null){
            this.head = node;
            this.rear = node;
        }else{
            this.rear.next = node;
            rear = rear.next;
        }
        this.usedSize++;
    }

    @Override
    public int size() {

        return this.usedSize;
    }
}
