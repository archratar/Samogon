package Exeptionssss;

import java.lang.*;

/**
 * Created by arch on 7/10/17.
 */
public class Except {
    public static void main(String[] args) {

        // arithmetic exception
        int numerator = 1, denominator = 0;
        // array index out of bound
        int array[] = new int[1]; array[0] = 23;
        int index = 0;
        // Negative array size
        int arraySize = 0;
        // null pointer
        boolean wannaCatchNullPointer = false;
        // invalid array
        boolean invalidArray = false;
        // invalid class cast
        boolean invalidCast = false;
        // argument exception
        boolean argumentInvalid = false;

        try {
            dividebyzero(numerator, denominator);
            outOfBound(array, index);
            int a[] = negativeArraySize(arraySize);
            nullPointer(wannaCatchNullPointer);
            invalidArr(invalidArray);
            invalidClassCast(invalidCast);
        } catch(ArithmeticException e){
            System.out.println("bad arithmetic operation" + e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array out of bound" + "index was " + e);
        } catch(NegativeArraySizeException e){
            System.out.println("Negative array size " + e);
        } catch(NullPointerException e){
            System.out.println("U have been catch an error\n" + e);
        } catch(ArrayStoreException e){
            System.out.println("Sir, you cant store different types of data in an array\n" + e);
        } catch(ClassCastException e){
            System.out.println("Sir, you cant cast to this type\n" + e);
        }
    }

    public static int dividebyzero(int numerator, int denominator){
        return numerator/denominator;
    }

    public static int outOfBound(int array[],int index){
        return array[index];
    }

    public static int[] negativeArraySize(int arraySize){
        return new int[arraySize];
    }

    public static void nullPointer(boolean isnull){
        if (isnull) {
            Object o = null;
            o.toString();
        } else {
            ;
        }
    }

    public static void invalidArr(boolean invalidArray){
        if(invalidArray){
            Object x[] = new String[3];
            x[0] = new Integer[0];
        } else{
            ;
        }
    }

    public static void invalidClassCast(boolean invalidCast){
        if(invalidCast){
            Object o = new Integer(0);
            Object obj = (String)o;
//            System.out.println((String)o);
        } else{
            ;
        }
    }

    public static void exception() throws Exception {
        throw new Exception("Hello");
//        Throwable.getMessage();
    }
}
