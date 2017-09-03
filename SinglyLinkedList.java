class SinglyLinkedList {
    Node head;

    public SinglyLinkedList(){
        head = null;
    }

    public SinglyLinkedList add(int val){
        Node newNode = new Node(val);
        if(this.head == null) {this.head = newNode;}
        else {
            Node runner = this.head;
            while (runner.getNext() != null){
                runner = runner.getNext();
            }
            runner.setNext(newNode);
        }
        return this;
    }

    public void printValues(){
        Node runner = this.head;
        while(runner != null){
            System.out.println(runner.getValue());
            runner = runner.getNext();
        }
    }

    public SinglyLinkedList remove(){
        Node runner = this.head;
        while (runner.getNext().getNext() != null){
            runner = runner.getNext();
        }
        runner.setNext(null);
        return this;
    }

    // this.popBack = function() {
    //     if (!this.head) {return null;}
    //     var returnVal;
    //     if (!this.head.next) {
    //         returnVal = this.head.val;
    //         this.head = null;
    //         return returnVal;
    //     }
    //     var runner = this.head;
    //     while (runner.next.next)
    //     { runner = runner.next;}
    //     returnVal = runner.next.val;
    //     runner.next = null;
    //     return returnVal;
    // }

    public Node find(int val){
        Node runner = this.head;
        while (runner != null){
            if (runner.getValue() == val){
                System.out.println( val + " found!");
                return runner;
            }
            else {
                runner = runner.getNext();
            }
        }
        System.out.println(val + " not found.");
        return this.head;
    }

    public SinglyLinkedList removeAt(int n){
        Node runner = this.head;
        while (n > 1){
            runner = runner.getNext();
            n--;
        }
        runner.setNext(runner.getNext().getNext());
        return this;
    }

}
