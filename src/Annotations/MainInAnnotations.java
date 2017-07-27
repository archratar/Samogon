package Annotations;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainInAnnotations {
    public static void main(String[] args) {

        try {
            Class son = Class.forName("Annotations.ReflectionTest");
            Field[] declaredFields = son.getDeclaredFields();
            Field[] fields = son.getFields();

            // all class fields, ! super fields
            for(Field field : declaredFields) {

                int mod;
                System.out.print("Declarefields : " + field + ", ");
                System.out.print(mod = field.getModifiers());

                if (Modifier.isPrivate(mod)) {
                    field.setAccessible(true);
                    field.set(field, 10);
                    System.out.print(" private : " + field.getModifiers());
                }
                System.out.println();
            }
            System.out.println();
            // all public fields, ! private ! protected
            for (Field field : fields) {
                System.out.print("fields : " + field + ", ");
                System.out.println(field.getModifiers());
            }

            System.out.println("\nson`s superclass" + son.getSuperclass().getName());

            Method[] methods = son.getMethods();

            System.out.println("\nson`s methods");
            for (Method method : methods) {
                System.out.println(method.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




//    Miner miner = new Miner();
//    Spaklator spaklator = new Spaklator();
//
//        Unicorn.makeMagic(miner);
//                Unicorn.makeMagic(spaklator);
//
//                System.out.println("Miner - " + miner.position + " " + "Spaklator - " + spaklator.position);