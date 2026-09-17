import java.util.*;
public class max{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(32);
        list.add(12);
        System.out.println(list);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size()-1;i++){
        if(max<list.get(i)){
        max=list.get(i);
        }
    }
     System.out.println("maximum number is:"+max);
     System.out.println(list.size());
    }
}