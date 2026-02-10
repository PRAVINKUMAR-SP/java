class a{
    void a1(int a, int b){
        int c=a+b;
        System.out.println("The sum is: "+c);
    }
}
class perameter {
    public static void main(String[] args){
        a b=new a();
        b.a1(10,10);
    }
}