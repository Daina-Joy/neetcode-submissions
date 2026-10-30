class LinkedList {
   class Node{
    int val;
    Node next;
     Node(int val){
       this.val=val;
       this.next=null;
   }
   }
   Node head; 
   int size;
    public LinkedList() {
        head=null;
        size=0;
    }

    public int get(int index) {
        if(index<0 || index >= size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
               temp=temp.next;
        }
        return temp.val;
    }

    public void insertHead(int val) {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        size++;
    }

    public void insertTail(int val) {
     Node newNode=new Node(val);
     if(head==null){
        head=newNode;
     }else{
        Node temp=head;
        while(temp.next!=null)
        temp=temp.next;
      temp.next=newNode;
     }
     size++;
    }

    public boolean remove(int index) {
         if(index<0 || index >= size){
            return false;
        }
        if(index == 0){
            head=head.next;
        }else{
            Node temp = head;
            for(int i=0;i< index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        size --;
        return true;
    }


    public ArrayList<Integer> getValues() {
           ArrayList<Integer> result=new ArrayList<Integer>();
           Node temp=head;
           for(int i=0;i< size;i++){
            result.add(temp.val);
            temp=temp.next;
           }
            return result;
    }
   
}
