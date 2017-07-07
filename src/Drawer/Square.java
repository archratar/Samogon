package Drawer;

/**
 * Created by arch on 7/4/17.
 */
public class Square implements Shape {

    String square = "square";

    @Override
    public void renderShape() {
        System.out.println(square);
    }
}
