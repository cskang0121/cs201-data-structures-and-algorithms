public class SinglyLinkedList<E> {
    
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

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

    // Write your codes below
    @Override
    public String toString(){
        Node<E> ptr = head;

        String str = "";

        while(ptr != null) {
            str += ptr.getElement();
            ptr = ptr.getNext();
        }

        return str;
    }

    public E removeLast(){
        if (size == 0) return null;

        E removed = tail.getElement();

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node<E> ptr = head;
            while(ptr.getNext() != tail) 
                ptr = ptr.getNext();
        
            ptr.setNext(null);
            tail = ptr;

        }
        
        size--;

        return removed;
    }

    public void reverse() {       
        if (size == 0 || size == 1) return;
        
        Node<E> prev = null;
        Node<E> cur = head;
        Node<E> next = null;

        while (cur != null) {
            if (cur == head) tail = cur;

            next = cur.getNext();

            cur.setNext(prev);
            prev = cur;
            cur = next;
        }

        head = prev;
    }
}