import java.util.Scanner;

class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

         sc.nextLine();// clear buffer

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        System.out.print("Enter phone number: ");
        int phone = sc.nextInt();

        System.out.print("Enter phone number: ");
        int phone1 = sc.nextInt();

        System.out.println("\nUser Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Phone Number: " + phone);
        System.out.println("Phone Number1: " + phone1);
        }
    
}
