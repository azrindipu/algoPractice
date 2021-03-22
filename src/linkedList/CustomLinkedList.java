package linkedList;

public class CustomLinkedList {
    private Node head;

    public Node insert(int data){
        Node node = new Node();
        node.setData(data);
        node.setNext(null);
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while (n.getNext()!=null){
                n = n.getNext();
            }
            n.setNext(node);
        }
        return node;
    }

    public void printList(){
        Node n = head;
        while (true){
            if(n == null){
                System.out.println("Sorry list is empty");
                break;
            }
            if(n != null){
                System.out.println(n.getData());
                if(n.getNext() == null){
                    break;
                }
                n=n.getNext();
            }
        }
    }

    public int getLength(){
        Node n = head;
        int counter = 0;
        if(n == null){
            return counter;
        }
        while (n.getNext() != null){
            counter++;
            n = n.getNext();
        }
        return counter;
    }
}
