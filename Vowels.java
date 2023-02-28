import java.util.*;
public class Vowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<String> str=new LinkedList<>();
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        while(!sc.hasNextInt())
        {
            str.add(sc.next());
        }
        String check="AEIOUaeiou";
        for(int i=0;i<str.size();i++){
            String s=str.get(i);
            ArrayList<Integer>arr1=new ArrayList<>();
        for(int j=0;j<s.length();j++){
            if(check.contains(s.charAt(j)+"")){
                arr1.add(j);
            }
        }
        arr.add(arr1);
    }
    System.out.println(arr);
}
}
