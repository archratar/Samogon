package LinkedListCustom;

/**
 * Created by arch on 7/12/17.
 */
public interface LinkedListPower<T>{

    public int size();
    public void add(T t);
    public void remove(T t);
    public void stdout();
    public boolean exists(T value);
}
