import java.util.Scanner;

public class swaptwonumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number ");
        int a = sc.nextInt();
        System.out.println("enter the second number ");
        int b = sc.nextInt();
        System.out.println(a + " " + b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a + " " + b);
    }
}
