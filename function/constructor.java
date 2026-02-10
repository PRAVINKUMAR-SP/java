class add{
    static int c;
    static void add(){
        System.out.println("This is a static add method.");
        System.out.println(c);
    }
    
    static void add(int c){
        System.out.println(c);
        add.c=c;
        sub.yt();
        add.a();
        
    }
    static void a(){
        int a=5;
        int b=7;
        System.out.println(a+b+c);
    }
}
class sub{
    static void yt(){
        System.out.println("This is a static block in sub class.");
    }
}

class constructor{
    public static void main(String[] args) {
        System.out.println("This is a constructor example.");
        add b=new add();
        b.add();
        b.add(10);
    }
}