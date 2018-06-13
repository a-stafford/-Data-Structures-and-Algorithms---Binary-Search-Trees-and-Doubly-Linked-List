package dsacoursework;

public class DoubleList {

    private Node head;
    private int size, i = 0;
    

    public void addValue(int data) {
        Node nextPointer = new Node(data, null, null);
        Node temp, pointer;
        boolean add = false;
        if (head == null) {
            head = nextPointer;
            System.out.println("I" + head.getData());

        } else if (data <= head.getData()) {
            System.out.println("I" + data + " " + "B" + head.getData());

            nextPointer.setNext(head);
            head.setPrev(nextPointer);
            head.getNext();
            head = nextPointer;
        } else {
            if(i < 1){
                System.out.println("I" + data + " " + "A" + head.getData());
                i++;
            }
            temp = head;
            pointer = head.getNext();

            while (pointer != null) {

                if (data >= temp.getData() && pointer.getNext() == null ) {
                    if(data > pointer.getData()){
                    
                    System.out.println("I" + data + " " + "A" + pointer.getData());
                    }

                }

                if (data >= temp.getData() && data <= pointer.getData() ) {

                    System.out.println("I" + data + " " + "A" + temp.getData() + " " + "B" + pointer.getData());
                    temp.setNext(nextPointer);
                    nextPointer.setPrev(temp);
                    nextPointer.setNext(pointer);
                    pointer.setPrev(nextPointer);
                    add = true;
                    break;
                } else {

                    temp = pointer;
                    pointer = pointer.getNext();
                }
            }
            if (!add) {
                temp.setNext(nextPointer);
                nextPointer.setPrev(temp);

            }
        }
        size++;
    }

    public void display() {
        System.out.print("Doubly Linked List = ");
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        if (head.getNext() == null) {
            System.out.println(head.getData());
            return;
        }
        Node ptr = head;
        System.out.print(head.getData() + " <-> ");
        ptr = head.getNext();
        while (ptr.getNext() != null) {
            System.out.print(ptr.getData() + " <-> ");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData() + "\n");
    }
}
