package linkedList;

public class CustomLinkedList {
    private Node head;

    public Node insertLast(int data){
        System.out.println("Inserting at end: "+data);
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

    public Node insertFirt(int data){
        System.out.println("Inserting at start: "+data);
        Node node = new Node();
        node.setData(data);
        node.setNext(null);
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            head=node;
            head.setNext(temp);
        }
        return node;
    }

    public void printList(){
        System.out.println("Printing the values");
        Node n = head;
        while (true){
            if(n == null){
                System.out.println("Sorry list is empty");
                break;
            }
            if(n != null){
                System.out.print(n.getData()+" ");
                if(n.getNext() == null){
                    break;
                }
                n=n.getNext();
            }
        }
        System.out.println();
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

    public void getMiddleValue(){
        int len = this.getLength();
        if(len == 0){
            System.out.println("List is empty");
        }
        else{
            int midLen = len/2;
            int counter = 0;
            Node n = head;
            while (n.getNext() != null){
                if(counter == midLen){
                    System.out.println("Middle value is :"+n.getData());
                }
                counter++;
                n = n.getNext();
            }
        }
    }

    public void deleteElement(int data){
        if(head == null){
            System.out.print("No data to delete");
            return;
        }
        else{
            boolean isDeleted = false;
            if(head.getData() == data){
                head = head.getNext();
                isDeleted = true;
            }
            else{
                Node n = head;
                Node prevNode = null;
                while (true){
                    if(n.getData() == data){
                        prevNode.setNext(n.getNext());
                        isDeleted = true;
                    }
                    if(prevNode == null){
                        prevNode = head;
                    }
                    else{
                        prevNode = n;
                    }
                    if(n.getNext() == null){
                        break;
                    }
                    n = n.getNext();
                }
            }
            if(isDeleted){
                System.out.println(data+" is deleted");
            }
            else{
                System.out.println(data+" is not found in the list");
            }
        }
    }
}
