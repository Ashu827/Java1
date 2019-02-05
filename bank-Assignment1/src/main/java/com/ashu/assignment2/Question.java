package com.ashu.assignment2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Question {

	private int questionId; 
	private String question;
	private List<String> answer;
	
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
		
	}
	
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question
				+ ", answer=" + answer + "]";
	}
	@SuppressWarnings("unchecked")
	public void display(){
		System.out.println("Question no..."+getQuestionId()+" Question is... "+getQuestion());
		
		 Iterator<String> li = answer.iterator(); 
		 while (li.hasNext()) 
	            System.out.print(li.next() + " "); 
		}
	}
