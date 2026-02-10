class Dad{
    int money = 10000;
}
class Son extends Dad{
    String car = "BMW";
}
public class simple {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println("Money from Dad: " + s.money);
    }
}