import java.util.Scanner;
public class Ascii {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        char a = n.next().charAt(0);
        int val= a;
        if(val>65 && val<=90){
            System.out.println("Uppercase");

        }
        else if(val>97 && val<=122){
        System.out.println("Lowercase");

    }
        else if(val>48 && val<=57){
            System.out.println("Number");

        }
        else{
            System.out.println("Symbol");
        }
}
    
}
