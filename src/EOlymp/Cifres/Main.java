package EOlymp.Cifres;

import java.io.*;

/**
 * Created by arch on 7/10/17.
 *
 * Підрахувати кількість цифр цілого невід'ємного числа n.

     Вхідні дані
     Одне ціле невід'ємне число n (0 ≤ n ≤ 2 ∙109).

     Вихідні дані
     Кількість цифр у числі n.
 */
public class Main {
    public static void main(String[] args){

        int max = (int) (2 * Math.pow(10.0d, 9.0d));
        System.out.println(max);
        int number = 0;
        int decimals = 0;

        for(int i = 0; number != 0; i++){
            number /= 10;
            decimals++;
        }

        System.out.println(decimals);
    }
}
