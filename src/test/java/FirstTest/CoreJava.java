package FirstTest;

public class CoreJava {
    public static void main(String [] args){
        //Arrays
        int[] arr= new int[5];  //how many values inside array
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=5;
        arr[4]=6;
        System.out.println(arr[1]);

        int[]arr2={1,2,4,5,6};
        System.out.println(arr2[3]);

        //for loop
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        String[] arr3= {"Adile ", "Karadeniz ","tester"};
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);
        }

        //for enhance
        for( String s: arr3){
            System.out.println(s);
        }
    }
}
