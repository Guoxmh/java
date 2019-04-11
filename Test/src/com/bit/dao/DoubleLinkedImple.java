package com.bit.dao;

import com.bit.impl.IDoubleLinked;

public class DoubleLinkedImple implements IDoubleLinked {
    class Node {
        Node prve;
        public Integer data;
        Node next;

        public Node(int data) {
            this.prve = null;
            this.data = data;
            this.next = null;
        }
    }

        public   Node head;
        public   Node last;
        public DoubleLinkedImple(){
            this.head = null;
            this.last = null;
        }



    @Override
    public void addFirst(int data){
        Node node = new Node(data);
            if(this.head == null){
                this.head = node;
                this.last = node;
            } else {
                  node.next = this.head;
                  this.head.prve = node;
                  this.head = node;
            }
    }

    @Override
    public void addLast(int data) {
            Node node =  new Node(data);
            if(this.head == null ){
                this.head = node;
                node.prve =null;
                node.next = null;
            }else {
                this.last.next = node;
                node.prve = this.last;
                this.last = node;
            }
    }
    private void checkIndex(int index){
            if(index < 0 || index > getLength()){
               throw new IndexOutOfBoundsException("xiabiaobuhefa");
            }
    }

    @Override
    public boolean addindex(int index, int data) {

            checkIndex(index);
            if(index == 0){
                addFirst(data);
                return true;
            }

            if(index == getLength()){
               addLast(data);
               return true;
             }else{
                Node node = new Node(data);
                Node cur = this.head;
            for(int i = 0; i < index; i++,cur = cur.next);
            node.next = cur;
            cur.prve.next = node;
            node.prve = cur.prve;
            cur.prve = node;
               return true;
            }
    }

    @Override
    public boolean contains(int key) {
            Node cur = this.head;
            while(cur != null){
                if(cur.data == key){
                    return true;
                }
                cur = cur.next;
            }
        return false;
    }

    @Override
    public int remove(int key) {//考虑删除的所有情况  头  中间  尾巴
            Node cur = this.head;
            while(cur != null){
                if(cur.data ==key){
                    int oldDatd = cur.data;
                    if(cur == this.head){
                        this.head = this.head.next;
                        this.head.prve = null;
                    }else{
                               cur.prve.next =  cur.next;
                               if(cur.next != null) {
                                   cur.next.prve = cur.prve;
                               }else{
                                   //删除最后一个 last改变
                                   this.last = cur.prve;
                               }
                    }
                    return  oldDatd;

                }
                cur = cur.next;
            }
        return -1;
    }

    @Override
    public void removeAllKey(int key) {
        Node cur = this.head;
        while(cur != null){
            if(cur.data ==key){
                //int oldDatd = cur.data;
                if(cur == this.head){
                    this.head = this.head.next;
                    this.head.prve = null;
                }else{
                    cur.prve.next =  cur.next;
                    if(cur.next != null) {
                        cur.next.prve = cur.prve;
                    }else{
                        //删除最后一个 last改变
                        this.last = cur.prve;
                    }
                }
                //return  oldDatd;

            }
            cur = cur.next;
        }



        //return -1;

    }

    @Override
    public int getLength() {
            int count = 0;
            Node cur = this.head;
            while(cur != null){
                count++;
                cur = cur.next;
            }
        return count;
    }

    @Override
    public void display() {
            Node cur =  this.head;
            while(cur != null){
                System.out.print(cur.data+" ");
                cur= cur.next;
            }


    }

    @Override
    public void clear() {

            while(this.head != null ){
                Node cur = this.head.next;
                this.head.prve = null;
                this.head.next = null;
                this.head = cur;

            }
            this.last = null;// 大型翻车现场

    }
}


