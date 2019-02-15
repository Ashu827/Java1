package com.ashu.assignment2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapQuestion {

	private int questionId; 
	private String question;
	private Map<String,Integer> answer;

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

	public Map<String,Integer> getAnswer() {
		return answer;
	}

	public void setAnswer(Map<String,Integer> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "MapQuestion [questionId=" + questionId + ", question="
				+ question + ", answer=" + answer + "]";
	}
	
	public void show(){
		
		System.out.println("Question no..."+getQuestionId()+" Question is... "+getQuestion());	
	Set<Entry<String, Integer>> set=answer.entrySet();  
    Iterator<Entry<String, Integer>> itr=set.iterator();  
    while(itr.hasNext()){  
        Entry<String,Integer> entry=itr.next();  
        System.out.println("Answer:"+entry.getKey()+" answer seq No.:"+entry.getValue());  
    }  
}
}
