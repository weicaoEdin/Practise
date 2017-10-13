package com.weicao;

public class Queue<E> {

    Node head,last;
    private int size;

    public int size(){
        return size;
    }

    public void enqueue(E e){
        Node node = new Node(e);
        size++;
        if (last != null ){
            last.setNext(node);
            last = node;
            return;
        }
        head = node;
        last = head;
    }

    public E Dequeue(){
        if(head == null || last == null) return null;

        E e = head.getE();
        head = head.getNext();
        size--;
        if(size==0) last = null;
        return e;

    }







    private class Node {
        E e;
        Node next;

        public Node(E e) {
            this.e = e;
        }

        public E getE() {
            return e;
        }

        public void setE(E e) {
            this.e = e;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }




}
