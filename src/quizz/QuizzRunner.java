package quizz;

import java.util.ArrayList;


public class QuizzRunner {

	public static void main (String[] args) {

		Quizz quizz = new Quizz();

		String prompt = "\n"
			+ "Question 1: 3 is less than 4\n\n"
			+ "True\n"
			+ "False\n";

		ArrayList<String> answers = new ArrayList<>();
		answers.add("true");

		Question question = new Question(prompt, answers);

		quizz.addQuestion(question);

		String prompt2 = "\n"
			+ "Question 2: Select all animals\n\n"
			+ "A.) Kiwi\n"
			+ "B.) Pelican\n"
			+ "C.) Coconut\n"
			+ "D.) Turtle\n";

		ArrayList<String> answers2 = new ArrayList<>();
		answers2.add("a");
		answers2.add("b");
		answers2.add("d");

		Question question2 = new Question(prompt2, answers2);

		quizz.addQuestion(question2);

		quizz.runQuizz();

		int grade = quizz.gradeQuizz();
		int numQuestions = quizz.getNumberQuestions();

		System.out.println("You got " + grade + " questions out of " + numQuestions + " correct!\n");
	}
}
