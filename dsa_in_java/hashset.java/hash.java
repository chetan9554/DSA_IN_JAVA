import java.util.*;
class hash{
public static void main(String args[]){
HashSet<Integer>hs=new HashSet<>();
hs.add(1);
hs.add(2);
hs.add(3);
hs.add(2);
hs.add(1);
System.out.print(hs);
if(hs.contains(2)){
    System.out.println("set contains");
}
else{
    System.out.println("not contains");
}
}
}