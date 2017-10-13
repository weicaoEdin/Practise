package com.weicao;

public class Stack <V> {

    Node head;
    int size;

    public V pop(){
        if(head == null) return null;

        V value = head.getValue();
        head = head.getNext();
        size--;
        return value;

    }

    public void add(V v){

        Node node = new Node(v);
        node.setNextVal(head);
        head = node;
        size++;

    }

    public V peek(){
        if(head == null) return null;
        return head.getValue();
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private class Node{

        V value;
        Node next;

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNextVal(Node next) {
            this.next = next;
        }

        public Node(V v) {
            this.value = v;
            this.next = null;
        }
    }




}
