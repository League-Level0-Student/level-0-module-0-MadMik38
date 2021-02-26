package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int Score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String Input = JOptionPane.showInputDialog("Whats your favorite idea?");
		if(Input.equals("Mine is being creative")) {
			Score += 1;
		}
		else {
			Score -= 1;
			System.out.print("The correct answer was: Mine is being creative");
		}
		String Input2 = JOptionPane.showInputDialog("How many weeks are in a year?");
		if(Input2.equals("52")) {
			Score += 1;
		}
		else {
			Score -= 1;
			System.out.print("\nThe correct answer was: 52");
		}
		String Input3 = JOptionPane.showInputDialog("When you look at the clouds in the sky, do you find it exciting?");
		if(Input3.equals("Yes")) {
			Score += 1;
		}
		else {
			Score -= 1;
			System.out.print("\nThe correct answer was: Yes");
		}
		System.out.print(Score);
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
