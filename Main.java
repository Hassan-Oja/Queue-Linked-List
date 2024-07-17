public class Main {
    public static void main(String[] args) {
        queue_linkedlist q1 = new queue_linkedlist();

        System.out.println(q1.isEmpty());


        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.display();
        System.out.println("");

        System.out.println(q1.peek());
        System.out.println("");

        System.out.println(q1.isEmpty());
        System.out.println("");

        q1.dequeue();
        q1.dequeue();
        q1.display();
        System.out.println("");

        System.out.println(q1.size());
        System.out.println("");

        System.out.println(q1.min());
        System.out.println("");

        System.out.println(q1.max());
        System.out.println("");

        System.out.println(q1.sum());
        System.out.println("");
        System.out.println(q1.search(50));


//        q1.clear();
//        System.out.println(q1.isEmpty());
//        System.out.println("");

    }

}