public class staticex {
    public static void main(String[] args) {
        test t1 = new test();
        t1.demo(10);
    }
}
class test{
    static void demo(int a){
        System.out.println(" hello " + a);
    }
}
