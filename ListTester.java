class ListTester {
    public static void main(String[] args){
        SinglyLinkedList sLL = new SinglyLinkedList();

        sLL.add(1);
        sLL.add(2);
        sLL.add(3);
        sLL.add(4);
        sLL.add(5);

        sLL.printValues();
        System.out.println(sLL.find(5));
        System.out.println(sLL.find(6));


        sLL.removeAt(1);
        sLL.printValues();

        sLL.remove();
        sLL.printValues();
    }
}
