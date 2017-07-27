package Annotations;

import java.lang.reflect.Field;

public class Unicorn {

    public static Object makeMagic(Object object) {

        Class cl;
        Field field;
        String value;

        cl = object.getClass();
        try {
            field = cl.getDeclaredField("position");
            value = field.getAnnotation(Position.class).value();
            field.set(object, value);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return object;
    }
}