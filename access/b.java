package access;

public class b {
    public static void main(String[] args) {
        a obj = new a();
        System.out.println(obj.x); // ✅ allowed
        obj.show();                // ✅ allowed
    }
}
