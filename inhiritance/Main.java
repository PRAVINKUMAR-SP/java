class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();    // Parent method
        c.display(); // Child method
    }
}
