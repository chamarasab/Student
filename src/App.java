public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Students!\n");

        Student student = new Student(); // calling through first constructor
        student.setStudentno("ST10781");
        student.setStudentname("Chamara");
        student.setScholarship(12);
        student.display();

        System.out.println("\n");

        Student student2 = new Student("10782","Malan",14); // calling through second constructor
        student2.display();
    }
}
