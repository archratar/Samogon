package Drawer;

/**
 * Created by arch on 7/4/17.
 */
public class Triangle implements Shape {

    String triangle = "triangle";

    @Override
    public void renderShape() {
        System.out.println(triangle);
    }
}
