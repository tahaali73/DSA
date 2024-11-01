public class stackLinkedList{
    private Node first = null;

    private class Node{
        String item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void push(String item){
       Node Head = first;
       first = new Node();
       first.item = item;
       first.next = Head;
    }

    public String pop(){
        String item = first.item;
        first = first.next;
        return item;
    }
}