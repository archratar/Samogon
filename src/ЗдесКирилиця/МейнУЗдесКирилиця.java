package ЗдесКирилиця;

/**
 * Created by arch on 7/11/17.
 */
public class МейнУЗдесКирилиця {
    public static void main(String[] args){
        Дерево дерево = new Дерево(1, "string");

//        дерево.добавь(1,"боярин в здравии");
        System.out.println(дерево.узел.цифра);
        System.out.println(дерево.узел.предложение);
    }
}
