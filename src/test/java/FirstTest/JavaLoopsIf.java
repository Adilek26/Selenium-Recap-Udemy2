package FirstTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaLoopsIf {
    public static void main(String[] args){
        int [] arr={1,2,4,5,6,8,9,10,122};
        //Find this array values even and odd
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" is an even number");
            }else {
                System.out.println(arr[i]+" is an odd number");
            }
        }
        ArrayList<String> a = new ArrayList<String>();
        a.add("adile");
        a.add("kara");
        a.add("deniz");
        a.add("test");
        a.add("kara");
        System.out.println(a);
        a.remove(1);
        System.out.println(a.get(3));
        System.out.println("Array List");
        System.out.println(a);
        System.out.println("For loop ****");
        for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
        System.out.println("***********");
        for(String val:a){
            System.out.println(val);
        }

        //items present in the arraylist
        System.out.println(a.contains("deniz"));
        //To convert array to arraylist
        List<int[]> arrList= Arrays.asList(arr);
        System.out.println(arrList);
    }
}
