package creaking_the_coding_interview.linklist;

public class ReturnKthElement {
    private CustomLinkList customLinkList=null;
    public ReturnKthElement(CustomLinkList customLinkList){
        this.customLinkList=customLinkList;
    }

    public Node getKthElement(Node head, int k){
        if(head == null)return null;
        Node runner01=head;
        Node runner02=head;
        for(int i=0;i<k;i++){
            runner01=runner01.next;

        }
        while (runner01 != null){
            runner02=runner02.next;
            runner01=runner01.next;
        }
        return runner02;
    }

    //nave way
    public Node getKthElementNaive(Node head, int k){
        int actualLength = this.getLength(head);
        int length = actualLength-k;
        Node tempHead = head;
        int count=0;
        while (true){
            count++;
            tempHead= tempHead.next;
            if(count== length){
                return tempHead;
            }
        }
    }


    public int getLength(Node head){
        int count=0;
        Node tempHead = head;
        while (tempHead != null){
            count++;
            tempHead=tempHead.next;
        }
        return count;
    }

}
