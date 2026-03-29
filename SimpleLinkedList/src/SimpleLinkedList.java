package structures;

public class SimpleLinkedList<V> implements List<V>{
    
    private Node<V> head;

    public SimpleLinkedList() {
        this.head = null;
    }

    public void add(V e) {
        Node<V> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<V> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    //Not implemented
@Override
    public void add(int index, Object element) {
        int size = 0;
        Node<V> tail = null;
        Node<V> newNode = new Node(element);
        //excepciones
        Node<V> temp = head;

        while (temp != null) {
            tail = temp;        // el último nodo visitado será el tail
            temp = temp.getNext();
            size++;
        }
        //si el indice esta por debajo o por fuera
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        //si se ingresa un  objeto nulo
        if (element == null) {
            throw new NullPointerException();
        }
        //si la lista esta vacia
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } //INSERTAR AL PRINCIPIO
        else if (index == 0) {
            newNode.setNext(head);
            head = newNode;
            //si esta al final
        } else {
            Node<V> currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }

            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
            if (index == size) {
                tail.setNext(newNode);
                tail = newNode;
            }
        }

    }
    
    //Not implemented
    @Override
    public boolean addAll(Collection<? extends V> c) {
        return false;
    }
    
    //Not implemented
    @Override
    public boolean addAll(int index, Collection<? extends V> c) {
        return false;
    }
    
    //Not implemented
    @Override
    public void clear() {
        
    }
    
    //Not implemented
    @Override
    public boolean contains(Object o) {
        return false;
    }
    
    //Not implemented
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }
    
    //Not implemented
    @Override
    public boolean equals(Object o) {
        return false;
    }
    
    //Not implemented
    @Override
    public V get(int index) {
        return null;
    }
    
    //Not implemented
    @Override
    public int indexOf(Object o) {
        return -1;
    }
    
    //Not implemented
    @Override
    public boolean isEmpty() {
        return false;
    }
    
    //Not implemented
    @Override
    public Iterator<V> iterator() {
        return null;
    }
    
    //Not implemented
    @Override
    public int lastIndexOf(Object o) {
        return -1;
    }
    
    //Not implemented
    @Override
    public ListIterator<V> listIterator() {
        return null;
    }
    
    //Not implemented
    @Override
    public ListIterator<V> listIterator(int index) {
        return null;
    }
    
    //Not implemented
    @Override
    public V remove(int index) {
        return null;
    }
    
    //Not implemented
    @Override
    public boolean remove(Object o) {
        return false;
    }
    
    //Not implemented
    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }
    
    //Not implemented
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }
    
    //Not implemented
    @Override
    public V set(int index, E element) {
        return null;
    }
    
    //Not implemented
    @Override
    public int size() {
        return 0;
    }
    
    //Not implemented
    @Override
    public List<V> subList(int fromIndex, int toIndex) {
        return null;
    }
    
    //Not implemented
    @Override
    public Object[] toArray() {
        return new Object[0];
    }
    
    //Not implemented
    @Override
    public <V> V[] toArray(V[] a) {
        return null;
    }
    
}
