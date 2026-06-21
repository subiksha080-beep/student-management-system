import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student 1: ");
        String student1 = scanner.nextLine();
        System.out.print("Enter Student 2: ");
        String student2 = scanner.nextLine();
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        scanner.close();
    }
}
