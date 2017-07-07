package Array;

/**
 * Created by arch on 7/5/17.
 */
public class MainInArray {
    public static void main(String[] args){

        ArrayList list = new ArrayList(2);
        ArrayList cplist = new ArrayList();
        System.out.println(list.size());

        for(int i = 0; i < 7; i++)
            list.set(i, i);

//        list.copyto(cplist);
//        cplist.stdprint();
//        list.stdprint();
        cplist.randomset(12);
        cplist.stdprint();
        System.out.println();
    }
}
