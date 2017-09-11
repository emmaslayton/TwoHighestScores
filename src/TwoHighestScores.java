/** “TwoHighestScores."
 *
 *  @author Emma Slayton
 *  Created: 9/8/17
 *  Last updated: 9/10/17
 *
 *  Project 5; CSC201-004N
 *  Assignment 5.9
 *
 */

import java.util.Scanner;

public class TwoHighestScores {
    public static void main(String[] args) {
        /* Create a Scanner */
        Scanner input = new Scanner(System.in);

        /*Prompt User to enter Number of Students */
        System.out.print("Enter the Number of Students: ");
        int numberOfStudents = input.nextInt();

        String studentOne = "blank";
        String studentTwo = "blank";
        String studentNext = "blank";
        int scoreOne = -1; /* Student score could be zero so needs to be -1 */
        int scoreTwo = -1;
        int scoreNext = -1;

        /* Prompt User to enter each student's name and score */
        for (int i=0; i < numberOfStudents; i++) {
            System.out.print("Enter the Student's Name:");
            studentNext = input.next();
            System.out.print("Enter the Student's Score:");
            scoreNext = input.nextInt();

            if (scoreNext > scoreOne) {
                studentTwo = studentOne;
                scoreTwo = scoreOne;
                studentOne = studentNext;
                scoreOne = scoreNext;
            }
            else if (scoreNext > scoreTwo) {
                studentTwo = studentNext;
                scoreTwo = scoreNext;
            }
        }
        /* Display Highest and Second-Highest Scores along with Student Name */
        System.out.println("Highest is: " + studentOne + " " + scoreOne);
        System.out.println("Second Highest is: " + studentTwo + " " + scoreTwo);
    }
}
