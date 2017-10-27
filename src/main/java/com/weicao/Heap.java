package com.weicao;

import java.util.Arrays;

public class Heap<E extends Comparable> {

    private E[] heap;
    private int size;
    private static final int DEFAULT_CAPACITY = 11;

    public Heap() {
        this.heap = (E[]) new Comparable[DEFAULT_CAPACITY];
        size = 0;
    }

    private void heapifyUp(){

        int index = size-1;
        if(isEmpty()) return;

        while(hasParentIndex(index)){
            if(heap[getParentIndex(index)].compareTo(heap[index])> 0){
                swap(index,getParentIndex(index));
                index = getParentIndex(index);
            }else break;
        }

    }

    private void heapifyDown(){
        int i = 0;
        int targetIndex;

        while(hasLeftChild(i)){
            targetIndex = getLeftChildIndex(i);

            if(hasRightChild(i)){
                if(heap[getRightChildIndex(i)].compareTo(heap[getLeftChildIndex(i)])<0 ){
                    targetIndex = getRightChildIndex(i);
                }
            }

            if(heap[targetIndex].compareTo(heap[i]) < 0 ){
                swap(i,targetIndex);
                i = targetIndex;
            }else break;
        }
    }

    public boolean hasLeftChild(int index){
        return index*2+1 < size;
    }

    private boolean hasRightChild(int index){
        return index*2+2 < size;
    }

    private int getLeftChildIndex(int index){
        return index*2+1;
    }

    private int getRightChildIndex(int index){
        return index*2+2;
    }

    private int getParentIndex(int index){
        return (index-1)/2;
    }

    private boolean hasParentIndex(int index){
        return index > 0;
    }

    public void add(E e){
        if( ++size > heap.length) expand();
        heap[size-1] = e;
        heapifyUp();
    }

    public E peak() throws Exception{
        if(isEmpty()) throw new Exception("Empty heap.");
        return heap[0];
    }

    public E remove() throws Exception{
        if(isEmpty()) throw new Exception("Empty heap.");
        E e = heap[0];
        if(--size > 0){
            heap[0] = heap[size];
            heapifyDown();
        }
        return e;
    }

    private void expand(){
        this.heap = Arrays.copyOf(heap,heap.length*2);
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void swap(int i, int j){
        E temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
        return;
    }


}
