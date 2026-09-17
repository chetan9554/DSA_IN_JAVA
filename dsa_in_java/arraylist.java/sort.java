import java.util.*;

public class sort{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(7);
        Collections.sort(list);
        System.out.println("sorted arraylist is"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("reverse list is"+list);
    }
}
