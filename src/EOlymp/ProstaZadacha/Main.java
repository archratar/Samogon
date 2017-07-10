package EOlymp.ProstaZadacha;

import java.io.*;
import java.util.*;

/**
 * Created by arch on 7/10/17.
 *
 * Програма зчитує двоцифрове число і виводить через пропуск кожну цифру окремо.

     Вхідні дані
     Натуральне число на проміжку від 10 до 99 включно.

     Вихідні дані
     Спочатку першу цифру числа і через пропуск другу.
 */
public class Main {
    public static void main(String[] args){

        int number = 34;
        int []num = new int[2];
        num[0] = number/10;
        num[1] = number%10;
        System.out.println(num[0] + " " + num[1]);
    }
}
