/**
 * 
 */
package revisingchallenges;

import java.util.Random;
import java.util.Scanner;

/**
 * @author DKieran
 *
 */
public class Challenge3PubQuiz {

	/**
	 * Write a program that'll have the expected actions and output for a simple
	 * quiz.
	 * 
	 * Actions:
	 * 
	 * 1. The user should be given a random question from the question Array (see
	 * below)
	 * 
	 * 2. User responds
	 * 
	 * 3. User answer should be checked against the answer in the answer Array (see
	 * below)
	 * 
	 * 4. User is notified of outcome
	 * 
	 * 5. User is prompted to continue (get another question) or quit
	 * 
	 * Use these arrays for the questions and answers (the index of the question
	 * corresponds to the index of the answer) eg jokeQuestions[0] has the answer
	 * jokeAnswers[0]
	 * 
	 * // declaring the questions and answers String[] jokeQuestions = { "Largest
	 * planet ? ", "Worse song ever ? ", "Capital of Peru?", "Roman god of War ?" };
	 * String[] jokeAnswers = { "Jupiter", "Castles in the Sky", "Lima", "Mars" };
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String questions[] = { "Largest planet ? ", "Worst song ever ? ", "Capital of Peru?", "Roman god of War ?" };
		String answers[] = { "Jupiter", "Castles in the Sky", "Lima", "Mars" };
		int randomlyGeneratedQuestion;
		String userAnswer, continuation;

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		continuation = null;

		//switch on pseudo-random index from question array and output question/answer to user
		do {
			randomlyGeneratedQuestion = random.nextInt(questions.length);
			switch (randomlyGeneratedQuestion) {
			case 0:
				System.out.println(questions[0]);
				userAnswer = scanner.nextLine();
				if (userAnswer.equalsIgnoreCase(answers[0])) {
					System.out.println("Correct");
				} else {
					System.out.println("Incorrect");
				}
				break;
			case 1:
				System.out.println(questions[1]);
				userAnswer = scanner.nextLine();
				if (userAnswer.equalsIgnoreCase(answers[1])) {
					System.out.println("Correct");
				} else {
					System.out.println("Incorrect");
					break;
				}
			case 2:
				System.out.println(questions[2]);
				userAnswer = scanner.nextLine();
				if (userAnswer.equalsIgnoreCase(answers[2])) {
					System.out.println("Correct");
				} else {
					System.out.println("Incorrect");
				}
				break;

			case 3:
				System.out.println(questions[3]);
				userAnswer = scanner.nextLine();
				if (userAnswer.equalsIgnoreCase(answers[3])) {
					System.out.println("Correct");
				} else {
					System.out.println("Incorrect");
				}
			}

			//ask user if they want another question, loop if they answer yes and ask again if they enter neither yes or no
			do {
				System.out.println("Would you like another randomly generated question?(Please Enter Yes or No)");
				continuation = scanner.nextLine();
			} while (!continuation.equalsIgnoreCase("Yes") && !continuation.equalsIgnoreCase("No"));

		} while (continuation.equalsIgnoreCase("Yes"));
		
		scanner.close();

		System.out.println("Thank you for playing");

	}

}
