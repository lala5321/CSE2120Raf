import java.util.Scanner;

public class StudentRoster {
  public static void main(String[] args){
    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of students: ");
    n = scanner.nextInt();
    String arr[] = new String[n];
    System.out.println("Enter "+n+" student names:");
    for(int i = 0;i<n;i++){
      arr[i] = scanner.nextLine();
    }

    System.out.println("\nStudents are:");
    for(int i = 0;i<n;i++){
      System.out.println(arr[i]);
    }
  }
}