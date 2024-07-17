public  class queue_linkedlist {
    Node front ;
    Node rear;
    int size;

    public queue_linkedlist() {
        front = rear= null ;
    }
    public boolean isEmpty(){
        return(front == null && rear == null);
    }
    public boolean enqueue(int data){
        Node newnode = new Node(data);
        if(isEmpty()){
            front = rear = newnode;
        }else{
            rear.next = newnode;
            rear = newnode;
        }
        size++;
        return true;
    }
    public Integer dequeue(){
        if(isEmpty()){
            return null;
        }else{
            int data = front.data;
            if(front == rear){
                front = rear = null;
            }else{
                front = front.next;
            }
            size--;
            return data;
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            Node current = front;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
            System.out.println();
        }
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        return front.data;
    }
    public int size (){
        return size;
    }
    public int min() {
        if (isEmpty()) {
            throw new RuntimeException("Your Stack is Empty");
        }
        int min = front.data;
        Node temp = front;
        while (temp != null) {
            if (min > temp.data) {
                min = temp.data;
            }
            temp = temp.next;
        }
        return min;
    }
    public int max() {
        if (isEmpty()) {
            throw new RuntimeException("Your Stack is Empty");
        }
        int max = front.data;
        Node temp = front;
        while (temp != null) {
            if (max < temp.data) {
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }
    public int sum(){
        queue_linkedlist temp = new queue_linkedlist();
        int sum = 0;
        int x;
        while(!isEmpty()){
            x = dequeue();
            sum += x;
        }
        while(!temp.isEmpty()){
            x = temp.dequeue();
            enqueue(x);
        }
        return sum;
    }
//    public int getLen(){
//        int length = 0;
//        Node temp = front;
//        while (temp != null) {
//            length++;
//            temp = temp.next;
//        }
//        return length;
//    }
    public boolean search(int x) {
        Node current = front;
        while (current != null) {
            if (current.data == x) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void clear(){
        front = rear = null ;
    }
    @Override
    public String toString() {
        return "queue_linkedlist{" +
                "front=" + front +
                ", rear=" + rear +
                ", size=" + size +
                '}';
    }
}

