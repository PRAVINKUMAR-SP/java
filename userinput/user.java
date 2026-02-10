import java.util.Scanner;

class user{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Name: ");
        int num = sc.nextInt();
        System.out.print("Enter a Password: ");
        int pass = sc.nextInt();   // input integer

        System.out.println("Account is Created");
        System.out.println("Login (y/n)");
        int num1 = sc.nextInt();

        sc.close();
    }
}