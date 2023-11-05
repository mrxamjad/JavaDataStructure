class Node{
    int value;
    Node next;
    Node prev;
     public Node( int value){
        this.value=value;

     }
      public Node( int value, Node next, Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
      }
}

class DLL{
    int size;
    Node head;
    Node tail;

    //Display the Double linkedList
    public void printList(){
        Node node=head;
        if(head==null){
            System.out.println("No Data Found");
        }else{
            while(node!=null){
                System.out.print(node.value+"->");
                tail=node;
                node=node.next;
            }
            System.out.println("END");
        }
    }

    // Method for inserting a value in first position

    public void insertFirst( int value){
        Node node= new Node(value);

        if(head==null){
            head=node;
            tail=head;
            
        }

        else if( head ==tail){
            head.prev=node;
            node.next=head;
            tail=head;
            head=node;
        }else{
            head.prev=node;
            node.next=head;
            head=node;
        }
        size++;


    }
    
}

class DoubleLinkedList {
    public static void main(String[] args) {
        DLL list= new DLL();
        list.printList();
        list.insertFirst(12);
        list.insertFirst(22);
        list.insertFirst(43);
        list.insertFirst(2);
        list.insertFirst(89);
        list.printList();


        
    }
    
}
