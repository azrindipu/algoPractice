package creaking_the_coding_interview.linklist;

public class Test {

    public Node insertLastData(Node head, int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return head;
        }
        Node temp = head;
        while (temp.next != null){
            temp=temp.next;
        }
        temp.next=node;
        return head;
    }

    public Node insertFirst(Node head, int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return head;
        }
        node.next=head;
        return node;
    }

    public int getLength(Node head){
        int count=0;
        Node temp = head;
        while (temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public void printList(Node head){
        if(head== null)return;
        System.out.print("Printed link list: ");
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
