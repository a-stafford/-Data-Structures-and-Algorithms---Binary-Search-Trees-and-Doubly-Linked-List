package dsacoursework;

public class Node<E> {

    int data;
    Node next;
    Node prev;

    public Node(){
        next = null;
        prev = null;
        data = 0;
    }
    
    
    
    public Node(int d, Node n, Node p) {
        data = d;
        next = n;
        prev = p;
    }

    public int getData() {
        return data;
    }

    public void setData(int d) {
        data = d;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        next = n;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node p) {
        prev = p;
    }

}
