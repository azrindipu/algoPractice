package creaking_the_coding_interview;

import creaking_the_coding_interview.linklist.*;

public class MainClassLinkList {
    public static void main(String[] args){

        //test
        Node head = null;
        CustomLinkList customLinkList = new CustomLinkList();
        head=customLinkList.insertLastData(head, 10);
        head=customLinkList.insertLastData(head, 11);
        head=customLinkList.insertLastData(head, 12);
        head=customLinkList.insertLastData(head, 13);
        head=customLinkList.insertLastData(head, 14);
        customLinkList.printList(head);
        System.out.println("Length: "+customLinkList.getLength(head));
        head= customLinkList.insertFirst(head,10);
        customLinkList.printList(head);
        System.out.println("Length: "+customLinkList.getLength(head));


        /*Remove Dups: Write code to remove duplicates from an unsorted linked list.
          FOLLOW UP
          How would you solve this problem if a temporary buffer is not allowed?*/

        RemoveDups removeDups = new RemoveDups(customLinkList);
        removeDups.removeDuplicate(head);
        customLinkList.printList(head);
        head=customLinkList.insertLastData(head, 10);
        removeDups.removeDuplicateInPlace(head);
        customLinkList.printList(head);

        /*Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.*/

        ReturnKthElement returnKthElement = new ReturnKthElement(customLinkList);
        Node k = returnKthElement.getKthElement(head, 3);
        System.out.println("Kth element: "+k.data);
        k= returnKthElement.getKthElementNaive(head, 3);
        System.out.println("Kth element: "+k.data);

        /*Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
        the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
        that node.
        EXAMPLE
        lnput:the node c from the linked list a->b->c->d->e->f
        Result: nothing is returned, but the new linked list looks like a ->b->d- >e- >f*/

        DeleteMiddleNode deleteMiddleNode = new DeleteMiddleNode(customLinkList);
        Node temNode = head.next;
        deleteMiddleNode.deleteGivenNode(temNode);
        customLinkList.printList(head);
    }
}
