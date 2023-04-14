package quizz;

import java.util.ArrayList;


public class Question {
	
	private String prompt;
	private ArrayList <String> answers;

	public Question (String prompt, ArrayList<String> answers) {
		
		this.prompt = prompt;
		this.answers = answers;		
	}

	public boolean checkAnswers (ArrayList<String> answers) {
		
		if (this.answers.size() != answers.size()) { return false; }

		ArrayList<String> answerCopy = new ArrayList<>(this.answers);
		
		for (String answer : answers) {
			answer = answer.toLowerCase();

			if (answerCopy.contains(answer)) {
				answerCopy.remove(answer);
			}
			
			else { return false; }
		}

		return true;
	}

	public String getPrompt() { return this.prompt; }
}

