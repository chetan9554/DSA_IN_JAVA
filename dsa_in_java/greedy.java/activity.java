import java.util.*;
public class activity{
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        
        ArrayList<Integer>ans=new ArrayList<>();
        int count=1;
        ans.add(0);
        int lastend=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastend){
                count++;
                ans.add(i);
                lastend=end[i];
            }
        }
        System.out.print(count+" ");

    }
}