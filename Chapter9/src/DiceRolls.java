/*

Program: DiceRolls.java          Last Date of this Revision: May 24, 2022

Purpose: An application that rolls die based off user customization and prints out the outcomes and sum

Author: Rafat E 
School: CHHS
Course: Computer Programming 20
 

*/


import java.util.Random;

import java.util.Scanner;

public class DiceRolls {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

Random rand = new Random(); //Random generator

int sides, noOfDice, noOfRolls, n, sum = 0;; //Variable Initialization

System.out.println("Enter Number of Sides in Each Die: "); //User input for number of sides

sides = sc.nextInt(); //Recording Variable

System.out.println("Enter Number of Dies to be Rolled: "); //User input for number of dies to be rolled

noOfDice = sc.nextInt(); //Recording Variable

System.out.println("Enter Number of Rolls to be made: "); //User input for number of rolls to be made

noOfRolls = sc.nextInt(); //Recording Variable

for(int i = 1; i <= noOfRolls; i++){ //Adder based off number of rolls

for (int j=1; j<=noOfDice; j++){ //Adder based off number of dice

n = rand.nextInt(sides) + 1; //Random number generator

System.out.println("For Roll: " + i + " Dice No: " + j + " the outcome is: " + n); // Output message of rolls and number of dice and outcomes

sum += n; //Sum calculator

}

}

System.out.println("The Possible Outcome is: " + sum); //Output message of Sum

}

}

/* Screen Dump

Enter Number of Sides in Each Die: 
3
Enter Number of Dies to be Rolled: 
3
Enter Number of Rolls to be made: 
3
For Roll: 1 Dice No: 1 the outcome is: 3
For Roll: 1 Dice No: 2 the outcome is: 3
For Roll: 1 Dice No: 3 the outcome is: 3
For Roll: 2 Dice No: 1 the outcome is: 2
For Roll: 2 Dice No: 2 the outcome is: 1
For Roll: 2 Dice No: 3 the outcome is: 1
For Roll: 3 Dice No: 1 the outcome is: 3
For Roll: 3 Dice No: 2 the outcome is: 1
For Roll: 3 Dice No: 3 the outcome is: 1
The Possible Outcome is: 18

*/
