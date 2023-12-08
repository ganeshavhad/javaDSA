package HashTable;
import java.util.LinkedList;

public class CustomeHashSet<E> {
    private static final int DEFAULT_CAPACITY = 16;
    private LinkedList<E>[] table;
    private int size;

    public CustomeHashSet() {
        table = new LinkedList[DEFAULT_CAPACITY];
        size = 0;
    }
    
    public static void main(String[] args) {
    	CustomeHashSet<Integer> customHashSet = new CustomeHashSet<>();
        customHashSet.add(10);
        customHashSet.add(20);
        customHashSet.add(30);

        System.out.println("Size: " + customHashSet.size());
        System.out.println("Contains 20: " + customHashSet.contains(20));

        customHashSet.remove(20);
        System.out.println("Size after removal: " + customHashSet.size());
    }
    

    public boolean add(E element) {
        int hash = element.hashCode();
        int index = hash % table.length;

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        LinkedList<E> bucket = table[index];
        for (E existingElement : bucket) {
            if (existingElement.equals(element)) {
                return false; // Element already exists
            }
        }

        bucket.add(element);
        size++;
        return true;
    }

    public boolean contains(E element) {
        int hash = element.hashCode();
        int index = hash % table.length;

        LinkedList<E> bucket = table[index];
        if (bucket == null) {
            return false;
        }

        for (E existingElement : bucket) {
            if (existingElement.equals(element)) {
                return true;
            }
        }

        return false;
    }

    public boolean remove(E element) {
        int hash = element.hashCode();
        int index = hash % table.length;

        LinkedList<E> bucket = table[index];
        if (bucket == null) {
            return false;
        }

        if (bucket.remove(element)) {
            size--;
            return true;
        }

        return false;
    }

    public int size() {
        return size;
    }

    
}

