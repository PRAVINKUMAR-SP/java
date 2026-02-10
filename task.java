public class task {
    public static void main(String[] args) {
        int num= 20;
        if(num<0){
            System.out.println("negative");
        }
        else if(num>0){
            System.out.println("positive");
        }
        else{
            System.out.println("Zero");
        }

        //even or odd
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

        int a=10;
        int b=20;
        int c=30;
        if(a==b && a==c && b==c){
            System.out.println("All are equal");
        }
        else{
            System.out.println("All are different");
        }
    }
}
