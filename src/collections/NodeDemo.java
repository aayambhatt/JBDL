package collections;

public class NodeDemo {
    public static void main(String[] args) {
        Node head = new Node();
        head.val = 10;

        Node second = new Node();
        second.val = 20;

        Node third = new Node();
        third.val = 30;

        head.next = second;
        second.next = third;
        third.next = null;




        // traversing
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
