package com.bit.dao;

import com.bit.impl.Ilinked;


public class MySingleListImpl implements Ilinked{

    class Node{
       public   int data;
       public   Node  next;

         public Node(int data){
             this.data = data;
             this.next = null;

         }
     }
     private Node head;
     public MySingleListImpl(){

         this.head = null;
     }
     private Node searchLast(Node head){
         Node cur = head;
         while(cur.next != null ){
             cur = cur.next;
         }
         return cur;
     }
   private Node searchIndex(int index){
         if(index < 0|| index > getLength()){
            throw new IndexOutOfBoundsException("下表不合法");
         }
         int i = 0;
         Node cur = this.head;
         for(i = 0; (i < index)&&(cur.next != null); i++){
             cur = cur.next;
         }
         return cur;
     }

     private Node searchPre(int key){
         Node cur = this.head;
         Node cur1 = cur;
         while(cur != null){
             if(cur.data == key){
                 return cur1;
             }
             cur1 = cur;
             cur = cur.next;
         }

         return  null;
         /* if(cur.next == null){
               return this.head;
         }
            while(cur.next != null){
            if(key == cur.next.data){
                return cur;
            }
            cur = cur.next;
        }
        return null;*/
     }

    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
        }else{
            node.next = this.head;
            this.head = node;
        }
    }

    @Override
    public void addLast(int data) {
         Node node = new Node(data);
         if(this.head == null){
             this.head = node;
         }else{
             Node abs = searchLast(this.head);
             abs.next = node;
        }

    }

    @Override
    public boolean addindex(int index, int data) {
        if(index < 0|| index > getLength()){
            return false;
        }
        if(index == 0){
            addFirst(data);
            return true;
        }else{
         Node abs = searchIndex(index);
         Node node =  new Node(data);
         node.next = abs.next;
         abs.next = node;
         return true;
        }
    }

    @Override
    public boolean contains(int key) {
         Node cur =  this.head;
         while(cur!=null){
             if(cur.data == key){
                 return true;
             }
             cur = cur.next;
         }
        return false;
    }

    @Override
    public int remove(int key) {
         boolean abs = contains(key);
         if(abs){
             if(key == this.head.data){//独立出来 头 单独处理
                 this.head = this.head.next;
                 return 1000;//删除成功给一千；
             }
             Node cur = searchPre(key);
             if(cur == null){
                 throw new NullPointerException("空指针问题");
             }
              if(cur.next.next == null){
               cur.next = null;
               return 1000;
             }else{
                 cur.next = cur.next.next;
             }
         }
             return -1;
    }

    @Override
    public void removeAllKey(int key) {
/*
         while(contains(key)){
             remove(key);
         }
*/
         Node pre = this.head;
         Node cur = this.head.next;
         while(cur != null){
             if(cur.data == key){
                 pre.next = cur.next;
                 cur = cur.next;
             }else{
                 pre = cur;
                 cur =cur.next;

             }
         }
         if(this.head.data ==  key){
             this.head = this.head.next;
         }

    }

    @Override
    public int getLength() {
         int  length = 0;
         Node cur = this.head;
         while(cur != null){
             length++;
             cur = cur.next;
         }

        return length;
    }

    @Override
    public void display() {
         if(this.head == null){
             throw new NullPointerException("空链表");
         }
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }

    }

    @Override
    public void clear() {
         Node cur ;
         while(this.head != null){
             cur = this.head.next;
             this.head = null;
             this.head = cur;
         }

    }
    public Node middleNode(Node head){
        Node cur =  head;
        int middle = getLength()/2;
        for(int i = 0; i < middle; i++,cur = cur.next);
        return cur;
    }
    public   Node FindKthToTail(Node head,int k){
         Node cur = head;
         Node fast = null;
         Node slow = null;
         int count= 0;
         while(cur != null){
             count++;
             cur = cur.next;
         }

         if(fast == null || k <= 0 || k > count){
             return null;
         }
         cur = head;

         for(int i = 0; i < k - 1; cur = cur.next,i++);
         fast = cur;
         while(fast != null){
             fast = fast.next;
             slow = slow.next;
         }
         return slow;


    }
    public   Node dada(int k){
         Node aS = null;
         Node aE = null;
         Node bS = null;
         Node bE = null;
         Node pHead = head;
         while(pHead != null){
             Node pHeadNext = pHead.next;
             pHead.next = null;

             if(pHead.data < k){
                 if(pHead == null){
                     aS  = pHead;
                     aE = pHead.next;
                 }else{
                     aE.next = pHead;
                     aE = pHead.next;
                 }
             }else{
                 if(pHead == null){
                     bS  = pHead;
                     bE = pHead;
                 }else{
                     bE.next = pHead;
                     bE = pHead;
                 }
             }
             pHead = pHeadNext;
         }
        aE.next = bS;

         return  aE;
    }


}

























/*
public class MySingleListImpl implements Ilinked {

    class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private  Node head;
   public MySingleListImpl(){
        this.head = null;
   }
    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if(head == null){
            node.next = this.head;

        }else{
            node.next = this.head;

        }

    }

    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if(this.head == null){
            this.head = node;
        }else{
            while(cur != NULL){
                cur = cur.next;
            }
            cur.next = node;
        }

    }
     //找到index节点
    private Node searchIndex(int index){
       int count = 0;
      for(;(count < index-1); count++);
    }
    private  void checkIndex(int index){
       if(index< 0 || index > getLength()){
           throw new IndexOutOfBoundsException("下表不合法");
       }
    }
    @Override
    public boolean addindex(int index, int data) {
      Node cur =   searchIndex(index);
        return false;
    }

    @Override
    public boolean contains(int key) {
       Node cur = head;
       while(cur.next != null){
           if(cur.data == key){
               return true;
           }
           cur = cur.next;
        }
        return false;
    }

    @Override
    public int remove(int key) {
        return 0;
    }
  public  void display(){
       Node cur = this.head;
       for(; this.cur.next;  this.cur = this.cur.next){
           System.out.println(cur.data);
       }
    }

  public  int getLength(){
       Node cur = this.head;
       int count = 0;
       while(cur.next != null){
           count++;
           cur = cur.next;
       }
       return count;
    }

}
*/



