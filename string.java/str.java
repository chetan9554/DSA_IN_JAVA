import java.util.*;
public class str{
    public static void main(String args[]){
        int count=0;
        String name1="love";
       for(int i=0;i<name1.length();i++){
        char ch=name1.charAt(i);    
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
        }
    }
        System.out.println(count);
       }
    }
