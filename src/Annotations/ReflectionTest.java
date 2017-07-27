package Annotations;

import java.io.Serializable;

public class ReflectionTest extends ReflectionBatya implements Serializable {

    public int pubField;
    private int privField;
    protected int protField;
    int noModField;

    public void pubBatyaMethod() {
        System.out.println("batya`s son public method");
    }

    private int privMethod() {
        return 10;
    }

    public int getPrivField() {
        return privField;
    }

    public void setPrivField(int privField) {
        this.privField = privField;
    }

    public int getProtField() {
        return protField;
    }

    public void setProtField(int protField) {
        this.privField = protField;
    }
}
