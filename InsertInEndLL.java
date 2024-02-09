class InsertInEndLL {
    public static void main(String[] args) {
        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(40);
        head.next.next.next = new Node1(60);
        head.next.next.next.next = new Node1(90);

        deleteAtEnd(head);
        int x = 88;
        insertAtEnd(head,x);
        while(head != null)
        {
            System.out.println(head.data+" ");
            head = head.next;
        }

    }
    static void deleteAtEnd(Node1 head){  
        if(head == null )
        {
            return ;
        }
        if(head.next == null){
            head = head.next;
            return ;
        }

         
        while(head.next.next != null){
            head = head.next;
        }
        head.next = head.next.next;
        return ;
    }
    static Node1 insertAtEnd(Node1 head,int x){
        Node1 newNode = new Node1(x);
        if(head == null)
        return newNode;

        while(head.next != null){
            head = head.next;
        }
        head.next = newNode;
        return head;

    }
}

class Node1{
    Node1 next;
    int data;
    Node1(int d){
        data = d;
        next =null;
    }
}