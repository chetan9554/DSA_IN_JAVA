import java.util.*;

interface hervibore{
     void eat();
}
interface carnibore{
    void eat();
}
class bear implements hervibore,carnibore{
    public void eat(){
        System.out.println("beat can eat grass");
    }
   
}
public class mulitlipal{
public static void main(String args[]){
    bear b1=new bear();
    b1.eat();
}}