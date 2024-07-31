import java.util.*;
public class Taps{
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);
        int a,b;
        a=read.nextInt();
        b=read.nextInt();
        float c=((float)(a-b)/a)*100;
        System.out.printf("%.2f",c);
    }
}