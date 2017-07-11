package ЗдесКирилиця;

/**
 * Created by arch on 7/11/17.
 */
public class Дерево {

    public Узел узел;
    public Узел вПравоПойдешь;
    public Узел вЛевоПойдешь;

    Дерево(int цифра, String предложение){
        this.узел = new Узел(цифра, предложение);
    }

    public void добавь(int цифра, String предложение){
//        if(){
//            ;
//        } else{
//            ;
//        }
    }

    public void положи(int цифра, String предложение){
        if(this.узел == null){
            this.узел.цифра = цифра;
            this.узел.предложение = предложение;
        } else{
            добавь(цифра, предложение);
        }
    }

    public void достань(){
        ;
    }

    public static class Узел {
        public int цифра;
        public String предложение;

        Узел (int цифра, String предложение){
            this.цифра = цифра;
            this.предложение = предложение;
        }
    }
}
