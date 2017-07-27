package Annotations;

public class ReflectionBatya extends ReflectionDed implements Cloneable {

    private int privBatyaField;
    public int pubBatyaField;

    private void privBatyaMethod() {
        System.out.println("batya private method");
    }

    public void pubBatyaMethod() {
        System.out.println("batya public method");
    }

    public int getPrivBatyaField() {
        return privBatyaField;
    }

    public void setPrivBatyaField(int privBatyaField) {
        this.privBatyaField = privBatyaField;
    }
}
