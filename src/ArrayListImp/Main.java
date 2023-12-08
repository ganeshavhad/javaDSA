package ArrayListImp;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
        customArrayList.add(10);
        customArrayList.add(20);
        customArrayList.add(30);
        customArrayList.add(40);

        System.out.println("Size: " + customArrayList.size());
        System.out.println("Element at index 1: " + customArrayList.get(1));

        customArrayList.remove(0);
        System.out.println("Size after removal: " + customArrayList.size());
        
	}
	}

//	I can	help you 	with that! 	An ArrayList 	is a	dynamic array 	implementation that 	automatically resizes
//	itself as 	elements are 	added or removed.Here's 	a simple 	implementation of 	an ArrayList 	in Java 	without using 	the Collections framework:


 class CustomArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] data;
    private int size;

    public CustomArrayList() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(E element) {
        if (size == data.length) {
            expandCapacity();
        }
        data[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) data[index];
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
    }

    private void expandCapacity() {
        int newCapacity = data.length * 2;
        data = Arrays.copyOf(data, newCapacity);
    }

    
}

//Please note that this is a basic implementation and lacks some features of the standard ArrayList, such as iterator support, generic type safety enforcement, and certain optimization strategies. Depending on your use case, you might need to add more methods and features to make it more complete and efficient.
