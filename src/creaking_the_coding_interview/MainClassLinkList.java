package creaking_the_coding_interview;

import creaking_the_coding_interview.linklist.Node;
import creaking_the_coding_interview.linklist.Test;

public class MainClassLinkList {
    public static void main(String[] args){

        //test
        Node head = null;
        Test test = new Test();
        head=test.insertLastData(head, 10);
        head=test.insertLastData(head, 11);
        head=test.insertLastData(head, 12);
        head=test.insertLastData(head, 13);
        head=test.insertLastData(head, 14);
        test.printList(head);
        System.out.println("Length: "+test.getLength(head));
        head= test.insertFirst(head,5);
        test.printList(head);
        System.out.println("Length: "+test.getLength(head));

    }
}
