/*

Program: Squares.java          Last Date of this Revision: May 24, 2022

Purpose: An application that stores the square of an element's index in an integer array of 5 elements.


Author: Rafat E 
School: CHHS
Course: Computer Programming 20
 

*/


public class Squares {

public static void main(String[] args) {

int [] arr; //Array

arr = new int [5]; //Element

for (int i = 0; i < arr.length; i++) { //Tracker

arr[i] = i*i; //Formula for elements of array

}

System.out.println("Elements of Array are: "); //Output message for elements and values

for (int i = 0; i < arr.length; i++) { //Adder starting from array of 0

System.out.println("arr["+i+"] = "+arr[i]); //Output arrays with values 

}

}

}

/* Screen Dump
 
Elements of Array are: 
arr[0] = 0
arr[1] = 1
arr[2] = 4
arr[3] = 9
arr[4] = 16
 
*/
