package Array;

/**
 * Created by arch on 7/4/17.
 */
public class ArrayList implements ArrayI {

    private static int defaultSize = 20;
    private float expandCapacity = 1.8f;
    private int size;
    private int []data;

    ArrayList(int size){
        data = new int[size+1];
        this.size = size;
    }

    ArrayList(){
        data = new int[defaultSize];
        this.size = defaultSize;
    }

    public int size(){
        return this.size;
    }

    public int get(int i){
        return i <= size ? this.data[i]: 0;
    }

    public void set(int i, int value){
        if (this.size > i)
            this.data[i] = value;
        else{
            expand(i);
            this.data[i] = value;
        }
    }

    public boolean exists(int value){
        for(int i = 0; i < this.size; i++){
            if (this.data[i] == value)
                return true;
        }
        return false;
    }

    public void randomset(int seed){
        for(int i = 0; i < this.size; i++){
            data[i] = (int)(Math.random() * seed);
        }
    }

    public void copyto(ArrayList destination){
        ArrayList dest = new ArrayList(this.size);

        for(int i = 0; i < this.size; i++){
            dest.data[i] = this.data[i];
        }
        destination.data = dest.data;
        destination.size = this.size;
    }

    public void stdprint(){
        for(int i = 0; i < this.size; i++){
            System.out.print("[" + i + "]" + " " + this.data[i] + " ");
        }
        System.out.println();
    }

    public void stdprint(boolean inOneColumn){
        String column = inOneColumn ? "\n": " ";
        for(int i = 0; i < this.size; i++){
            System.out.print("[" + i + "]" + " " + this.data[i] + column);
        }
        System.out.println();
    }

    private void expand(int howmuch){
        int currentSize = this.size;
        this.size = (int)((float)howmuch * expandCapacity + 0.5);
        cp(this.size, currentSize);
    }

    private void cp(int size, int currentSize){
        int [] newdata;
        newdata = new int[this.size];

        for(int i = 0; i < currentSize; i++){
            newdata[i] = this.data[i];
        }

        this.data = newdata;
    }
}
