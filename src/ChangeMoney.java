import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter your money(USD):");
        int usd= scanner.nextInt();
        int rate = 23000;
        int vnd= usd*rate;
        System.out.println("after change your money is: "+vnd +" VND");
    }
}
