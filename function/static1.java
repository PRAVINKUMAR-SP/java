class static1 {
    public static void main(String[] args) {
        System.out.println("This is a static method example.");
        a.a1();

}}
class a{
    static void a1() {
        System.out.println("Static method called.");
        add b = new add();
        b.a2();
        add.a3();
    }
}class add{
    void a2(){
        int a=5;
        int b=7;
        System.out.println(a+b);
    }
    static void a3(){
        System.out.println("Static method in add class.");
    }
}

