package com.bit.dao;

import com.bit.impl.IDoubleLinked;

public class DoubleLinkedImple implements IDoubleLinked {
    class Node {
        Node frontNext;
        public Integer data;
        Node tailNext;

        public Node(int data) {
            this.frontNext = null;
            this.data = data;
            this.tailNext = null;
        }
    }
        private  Node head;
        public DoubleLinkedImple(){
            this.head = null;
        }



    @Override
    public void addFirst(int data) {

    }

    @Override
    public void addLast(int data) {

    }

    @Override
    public boolean addindex(int index, int data) {
        return false;
    }

    @Override
    public boolean contains(int key) {
        return false;
    }

    @Override
    public int remove(int key) {
        return 0;
    }

    @Override
    public void removeAllKey(int key) {

    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public void display() {

    }

    @Override
    public void clear() {

    }
}
