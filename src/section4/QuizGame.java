package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String message;
		message=JOptionPane.showInputDialog("what is my favorite color?");
		// 3.  Use an if statement to check if their answer is correct
		if(message.equals("blue")) {
		score=score+1;
		
		}
		message=JOptionPane.showInputDialog("how old am i?");
				if(message.equals("13")) {
					score=score+1;
				}
					System.out.println(score);		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
