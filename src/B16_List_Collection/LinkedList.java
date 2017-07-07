package B16_List_Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by arch on 7/4/17.
 */
public class LinkedList<T> implements List{

    private static final int MAX_CAPACITY = 2147483639;
    private int DEF_CAPACITY = 25;

    private int size = 0;
    private Object[] data;

    public LinkedList (int size){
        this.size = size > 0 ? size: DEF_CAPACITY;
        this.data = new Object[this.size];
    }
    public LinkedList (){
        this.size = DEF_CAPACITY;
        this.data = new Object[this.size];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object get(int i) {
        return this.data[i];
    }

    @Override
    public Object set(int i, Object o) {
        return null;
    }

    @Override
    public void add(int i, Object o) {
        this.data[i] = o;
    }

    @Override
    public boolean add(Object o) {
        this.data[size++] = o;
        return true;
    }

    @Override
    public Object remove(int i) {
        this.data[i] = 0;
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean addAll(Collection collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int i) {
        return null;
    }

    @Override
    public List subList(int i, int i1) {
        return null;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return new Object[0];
    }
}
