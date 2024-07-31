import java.util.*;
public class Taps{
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);
        int a,b;
        a=read.nextInt();
        b=read.nextInt();
        System.out.printf("%.2f",Math.sqrt((a*a)+(b*b)));
    }
}