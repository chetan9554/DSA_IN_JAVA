import java.util.*;
 class calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a ,int b, int c){
        return a+b+c;
    }
}
public class methodoverloading{
    public static void main(String args[]){
        calculator c1=new calculator();
       System.out.println(c1.sum(3,4));
       System.out.println(c1.sum((float)2.0,(float)5.0));
       System.out.println(c1.sum(3,4,6));

    }
}