package Array;

/**
 * Created by arch on 7/4/17.
 */
public interface ArrayI {

    public int size();
    public int get(int i);
    public void set(int i, int value);
    public void randomset(int seed);
    public void copyto(ArrayList destination);
    public void stdprint();
    public boolean exists(int value);
}
