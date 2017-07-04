package Univer;

import java.util.List;

/**
 * Created by arch on 7/3/17.
 */
public class Faculty {

    private String name;
    private List<Cafedra> cafedras;

    public void faculty(String name, List<Cafedra> cafedras) {
        this.name = name;
        this.cafedras = cafedras;
    }
}
