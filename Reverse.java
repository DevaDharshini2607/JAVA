import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b= a/100;
        int c=(a/10)%10;
        int d=a%10;
        int reverse =d*100+c*10+b;
        System.out.println(reverse);
    }
    
}
