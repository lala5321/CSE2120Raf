/*

Program: StudentRoster.java          Last Date of this Revision: May 24, 2022

Purpose: An application that uses an array to print out student names based off user input and how many students there are.

Author: Rafat E 
School: CHHS
Course: Computer Programming 20
 

*/


import java.util.Scanner;

public class StudentRoster {
  public static void main(String[] args){
    int n; //Variable initialized
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of students: "); //User input
    n = scanner.nextInt(); //N variable recorded
    String arr[] = new String[n];
    System.out.println("Enter "+n+" student names:"); //Enter names of student based off number of students
    for(int i = 0;i<n;i++){ //Tracker
      arr[i] = scanner.nextLine(); //Array
    }

    System.out.println("\nStudents are:"); //Output Student Names
    for(int i = 0;i<n;i++){
      System.out.println(arr[i]); //Print out array
    }
  }
}

/* Screen Dump

Enter number of students: 
10
Enter 10 student names:
Jay
Rick
Abdalla
Jose
Rico
Marty
Chico
Delta
Lima

Students are:

Jay
Rick
Abdalla
Jose
Rico
Marty
Chico
Delta
Lima

 
 */