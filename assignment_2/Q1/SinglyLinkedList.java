import java.util.*;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class SinglyLinkedList<E extends Comparable<E>> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    private static class Node<E> {
        private E element;
        private Node<E> next;
    
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }
    
        public E getElement(){
            return element;
        }
    
        public Node<E> getNext(){
            return next;
        }
    
        public void setNext(Node<E> n){
            next = n;
        }
    }

    public SinglyLinkedList(){

    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public E first(){
        if (isEmpty()){
            return null;
        } 
        return head.getElement();
    }

    public E last(){
        if (isEmpty()){
            return null;
        }
        return tail.getElement();
    }

    public void addFirst(E e){
        head = new Node<>(e, head);

        if (isEmpty()){
            tail = head;
        }
        size++;
    }

    public void addLast(E e){
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()){
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    public E removeFirst(){
        if (isEmpty()){
            return null;
        }

        E answer = head.getElement();
        head = head.getNext();
        size--;

        if (isEmpty()){
            tail = null;
        }
        return answer;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node<E> current = head;
        while (current != null) {
            sb.append(current.getElement());
            sb.append(" ");
            current = current.getNext();
        }
        return sb.toString();
    }

    // write your codes here
    public void swap(){
        if(isEmpty() || size == 1) return;

        // Create a treemap for storing the elements + corresponding position
        // Create another treemap for swapping operations + new position 
        TreeMap<E, Integer> treemap = new TreeMap<>();
        TreeMap<Integer, E> solTreemap = new TreeMap<>();

        // Set current to head
        Node<E> current = head;

        // Set counter to 0, counter is used to keep track of original position
        int counter = 0;

        // Put each <Element, Position> into the treemap
        // Remove each node from the linked list
        while(current != null) {
            treemap.put(current.getElement(), counter++);
            current = current.getNext();
            removeFirst();
        }
        
        // Perform swapping operations
        for(int i = 0; i < counter / 2; i++) {
            solTreemap.put(treemap.get(treemap.lastKey()), treemap.firstKey());
            solTreemap.put(treemap.get(treemap.firstKey()), treemap.lastKey());
            treemap.remove(treemap.firstKey());
            treemap.remove(treemap.lastKey());
        }

        // For cases where the size of linked list is not even, put the extra <Element, Position> into the treemap
        if(counter % 2 != 0) {
            solTreemap.put(treemap.get(treemap.firstKey()), treemap.firstKey());
        }

        // Readd all the elements in correct order
        for(Integer key : solTreemap.keySet()) {
            addLast(solTreemap.get(key));
        }
    }
}

