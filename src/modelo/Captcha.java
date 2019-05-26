package controlador;

import java.util.Random;

public class Captcha {
    public int [] num={0,1,2,3,4,5,6,7,8,9};
    public String [] numS={"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
    public Random rnd;
    public int a;
    public int b;
    public int sum;

    public Captcha() {
        this.num = num;
        this.numS = numS;
        this.rnd = new Random();
        this.a =rnd.nextInt(9);
        this.b = rnd.nextInt(9);
        this.sum = this.a + this.b;
    }

    public int getSum() {
        return sum;
    }

    public String  validarCaptha(){
        return this.a+" + "+numS[b];
    }
}
