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

     private Node searchKey(int key){
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
             Node cur = searchKey(key);
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
         while(contains(key)){
             remove(key);
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
             cur = this.head;
             this.head = null;
             this.head = cur.next;
         }

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
