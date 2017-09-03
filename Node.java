class Node {
    private int value;
    private Node next;

    // constructor
    public Node(int value){
        next = null;
        this.value = value;
    }

    // getter
    public int getValue(){
        return value;
    }

    // setter
    public void setValue(int val){
        value = val;
    }

    // getter
    public Node getNext(){
        return next;
    }

    // setter
    public void setNext(Node next){
        this.next = next;
    }
}
