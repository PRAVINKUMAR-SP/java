class retur {
    public static void main(String[] args) {
        add b=new add();
        b.a1();
        int result = b.a1();
        System.out.println("The sum is: " + result);
    }
    
}
class add{
    int a1(){
        int a=5;
        int b=10;
        return (a+b);
    }
}
