package FirstTest;

public class StringObject {
    public static void main(String[] args) {
        //psvm to create main method
        String st= "Adile Kara Deniz";
        String st1= new String("Hello!");
        String st2= "Adile Kara Deniz Java";
        String[] splittedStr= st.split(" ");
        //cut the string from white spaces
        System.out.println(splittedStr[0]);
        System.out.println(splittedStr[1]);
        String[] splittedStr1= st.split(" Kara");
        System.out.println(splittedStr1[0]);
        System.out.println(splittedStr1[1]);
       // System.out.println(splittedStr1[2]);
        for(int i=0; i<st2.length(); i++){
            System.out.print(st2.charAt(i));
        }
        System.out.println();
        System.out.println("Reverse String or Palendrome");
        for(int i=st2.length()-1; i>=0; i--){
            System.out.print(st2.charAt(i));
        }
    }
}
