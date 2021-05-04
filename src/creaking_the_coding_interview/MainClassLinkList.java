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

        /*Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
        before all nodes greater than or equal to x. If x is contained within the list the values of x only need
        to be after the elements less than x (see below). The partition element x can appear anywhere in the
        "right partition"; it does not need to appear between the left and right partitions.
        EXAMPLE
        Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
        Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8*/

        customLinkList.insertLastData(head, 2);
        customLinkList.insertLastData(head, 20);
        customLinkList.printList(head);
        Partition partition = new Partition(customLinkList);
        Node partitionedHead = partition.makePartition(head, 12);
        customLinkList.printList(partitionedHead);
    }
}
