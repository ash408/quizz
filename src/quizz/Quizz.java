package quizz;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class Quizz {

	private ArrayList<Question> questions = new ArrayList<>();
	private ArrayList<String> answers = new ArrayList<>();

	public Quizz () {}

	public void addQuestion(Question question) { this.questions.add(question); }

	public int gradeQuizz(){

		if (this.answers.size() != this.questions.size()) { return 0; }

		int grade = 0;

		for (int i = 0; i < questions.size(); i++) {

			Question question = this.questions.get(i);
			String answer = this.answers.get(i);
			
			String [] tmpArr = answer.split(" ");
			ArrayList<String> answers = new ArrayList<>(Arrays.asList(tmpArr));

			boolean isCorrect = question.checkAnswers(answers);
			if (isCorrect) { grade++; };
		}

		return grade;
	}

	public int getNumberQuestions () { return this.questions.size(); };

	public void runQuizz() {

		for (Question question : this.questions) {
			System.out.println(question.getPrompt());

			Scanner input = new Scanner(System.in);
			System.out.print("Answer: ");

			String answer = input.nextLine();
			this.answers.add(answer);

			System.out.println();
		}
	}
}
