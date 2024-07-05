import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Power_Set {
    public static List<String> AllPossibleStrings(String s)
    {
        // Code here
          int l=s.length();
       ArrayList<String> a=new ArrayList<>();
       for(int i=1 ;i<(1<<l) ; i++){
           StringBuilder str=new StringBuilder();
           for(int j=0; j<l; j++){
               if((i&(1<<j))!=0){
                   str.append(s.charAt(j));
               }
           }
           a.add(str.toString());
       }
       Collections.sort(a);
       
        return a;
    }

    public static void main(String[] args) {
        String s="abc";
        System.out.println(AllPossibleStrings(s));
    }
}
