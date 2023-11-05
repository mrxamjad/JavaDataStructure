class Node{
int data;
Node next;
}

class LinkedList{
    Node head;


    // Method to insert the value into node.
    public void insert(int data){
        Node n= new Node();
        n.data=data;
        n.next=null;
        if(head==null){
            head=n;

        }
        else{
            Node node=head;
            while(node.next!=null){
                node=node.next;
            }
            node.next=n;


        }
    }

    public void print(){
        if(head==null){
            System.out.println("NO DATA");
        }
        else{
            Node node=head;
            System.out.println(node.data);
            while(node.next!=null){
        
                node=node.next;
                System.out.println(node.data);
                
            }
            
        }
    }
}






public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList list= new LinkedList();
        list.insert(2);
        list.insert(3);
        list.insert(12);
        list.insert(15);

        list.print();
        
    }
    
}
