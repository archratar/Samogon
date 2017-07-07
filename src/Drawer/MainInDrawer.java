package Drawer;

/**
 * Created by arch on 7/4/17.
 */
public class MainInDrawer {
    public static void main (String[] args){


        shapeRenderer(new Triangle(), new Square());
    }

    public static void shapeRenderer(Shape...shapes) {
        for (int i = 0; i < shapes.length; i++) {

            shapes[i].renderShape();
        }
    }
}
