class InsertInFrontOfLL {
 
        public static void main(String[] args) {
            
            Node head  = new Node(10);
            head.next  = new Node(20);
            head.next.next  = new Node(30);
            head.next.next.next  = new Node(40);
            head.next.next.next.next  = new Node(50);

            Node head1 = deleteAtBegin(head);

            int x1 = 3;
            Node head2 = insertInFrontLL(head1,x1);
            while (head2 != null) {
                
                System.out.println(head2.data);
                head2 = head2.next;
            }
            
            

        }
        static Node deleteAtBegin(Node head){
            if(head == null) 
            return null;

            Node temp = head;
            head = head.next;
            return head;


        }
    
    static Node insertInFrontLL(Node head,int x){
       
        Node newNode = new Node(x);
        if(head == null)
         return newNode;
        
        Node temp = head;
        head = newNode ;
        newNode.next = temp;
        
        return head;
    }
}
    
    class Node{
        int data;
        Node next;
        Node(int d){
          data = d;
           next = null;
        }
        
    }
    

