import java.util.Random;

import java.util.Scanner;

public class DiceRolls {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

Random rand = new Random();

int sides, noOfDice, noOfRolls, n, sum = 0;;

System.out.println("Enter Number of Sides in Each Die: ");

sides = sc.nextInt();

System.out.println("Enter Number of Dies to be Rolled: ");

noOfDice = sc.nextInt();

System.out.println("Enter Number of Rolls to be made: ");

noOfRolls = sc.nextInt();

for(int i = 1; i <= noOfRolls; i++){

for (int j=1; j<=noOfDice; j++){

n = rand.nextInt(sides) + 1;

System.out.println("For Roll: " + i + " Dice No: " + j + " the outcome is: " + n);

sum += n;

}

}

System.out.println("The Possible Outcome is: " + sum);

}

}
