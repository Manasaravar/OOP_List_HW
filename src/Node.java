public class Node <T> {

    private Node next, previous;
    private T e;

    public Node () {
        this.next = null;
        this.previous = null;
        //this.e = null;
    }

//    public Node(Node previous) {
//        this.next = null;
//        this.previous = previous;
//    }

    public Node(Node next, Node previous, T e) {
        this.next = next;
        this.previous = previous;
        this.e = e;
    }

    public Node(T e) {
        this.e = e;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public T getE() {
        return e;
    }

    public void setE(T e) {
        this.e = e;
    }
}
