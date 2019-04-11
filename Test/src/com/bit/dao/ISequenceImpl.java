package com.bit.dao;

import com.bit.impl.ISequence;


import java.util.Arrays;

public class ISequenceImpl implements ISequence {
    public Object[] elemData;
    public int usedSize;
    public static final int DAFAULT_CAPACITY = 10;

    public ISequenceImpl(){
          this.elemData = new Object[DAFAULT_CAPACITY];
          this.usedSize =  0;

    }
    public boolean isFUll(){
        if(this.usedSize == DAFAULT_CAPACITY){
            return true;
        }
        return false;
    }

    @Override
    public boolean add(int pos, Object data) {
        //1.判断满了没
        if(pos < 0 || pos > this.usedSize ){
            return false;
        }
        if(isFUll()){
            this.elemData = Arrays.copyOf(this.elemData,elemData.length*2);
        }
        //2.挪动
        for(int i = this.usedSize; i >= pos; i--){
            this.elemData[i+1] = this.elemData[i];
        }
        //3.插入
        this.elemData[pos] = data;
        this.usedSize++;
        return true;
    }

    @Override
    public int search(Object key) {
        if(key == null){
            throw new UnsupportedOperationException("输入不合法");
        }
        if(this.usedSize == 0){
            return -1;
        }
        for(int i = 0; i < this.usedSize; i++){
            if(this.elemData[i].equals(key)){
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean contains(Object key) {
        int index = search(key);
        if(index == -1){
            return false;
        }
        return true;
    }

    @Override
    public Object getPos(int pos) {
        if(pos < 0 || pos > this.usedSize-1){
            return null;
        }

        return this.elemData[pos];
    }

    @Override
    public Object remove(Object key) {
        int index = search(key);
        if(index == -1){
            return null;
        }
        Object OldValue = this.elemData[index];
        for(int i = index; i < this.usedSize; i++){
            this.elemData[i] = this.elemData[i+1];
        }
        this.elemData[usedSize-1] = null;
        this.usedSize--;
        return OldValue;
    }

    @Override
    public int size() {

        return this.usedSize;
    }

    @Override
    public void display() {
        for(int i = 0; i < this.usedSize; i++){
            System.out.print(this.elemData[i]+" ");
        }
        System.out.println();
    }

    @Override
    public void clear() {
        for(int i = 0; i < this.usedSize; i++){
            this.elemData[i] = null;
        }
        this.usedSize = 0;
    }
}

