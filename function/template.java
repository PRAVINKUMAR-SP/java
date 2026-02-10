class template {
    int roll_no;
    String name;
    public static void main(String[] args) {
        template student = new template();
        student.roll_no = 101;
        student.name = "pravin";
        System.out.println("Roll No: " + student.roll_no);
        System.out.println("Name: " + student.name);

        template student2 = new template();
        student2.roll_no = 102;
        student2.name = "abi";
        System.out.println("Roll No: " + student2.roll_no);
        System.out.println("Name: " + student2.name);
    }
}
