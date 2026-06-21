import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student 1 Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Student 1 Roll Number: ");
        String roll1 = scanner.nextLine();
        System.out.print("Enter Student 1 City: ");
        String city1 = scanner.nextLine();
        System.out.print("Enter Student 2 Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter Student 2 Roll Number: ");
        String roll2 = scanner.nextLine();
        System.out.print("Enter Student 2 City: ");
        String city2 = scanner.nextLine();
        System.out.println("Student 1 -> Name: " + name1 + ", Roll No: " + roll1 + ", City: " + city1);
        System.out.println("Student 2 -> Name: " + name2 + ", Roll No: " + roll2 + ", City: " + city2);

        scanner.close();
    }
}
