import java.util.*;
public class Taps{
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);
        float a,b;
        a=read.nextFloat();
        b=read.nextFloat();
        float c=((b-a)/a)*100;
        System.out.printf("%.2f",c);
    }
}