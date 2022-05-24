/*

Program: Reverse.java          Last Date of this Revision: May 24, 2022

Purpose: An application that stores the number corresponding to the the element's index in an integer


Author: Rafat E 
School: CHHS
Course: Computer Programming 20
 

*/

import javax.swing.*;
import java.awt.*;

public class Reverse {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Countdown"); //GUI Window Name
        int[] arr = new int[10]; //Array initialized

        for (int i = 0; i < arr.length; ++i) { //Adder for count down
            arr[i] = i; //Array value
        }
        JTextArea reverseListArea = new JTextArea(); //GUI Creation
        reverseListArea.setEditable(false); //GUI Creation

        for (int i = arr.length - 1; i >= 0; --i) { //Count down creator using array
            reverseListArea.append("  " + arr[i] + "\n"); //Display message of count down
        }
        
        frame.add(reverseListArea); //GUI frame

        frame.setSize(250, 250); //GUI Size
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}


/* Screen Dump

(GUI USED) 

Countdown

9
8
7
6
5
4
3
2
1
0

 
*/