package com.SpringCore_Question2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SpringCore_Q2 {
	private int questionId;
	private String question;
	private List<ListAnswers> l;
	private Set<SetAnswers> s;
	private Map<Integer,String> m;

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
	public List<ListAnswers> getL() {
		return l;
	}
	public void setL(List<ListAnswers> l) {
		this.l = l;
	}
	public Set<SetAnswers> getS() {
		return s;
	}
	public void setS(Set<SetAnswers> s) {
		this.s = s;
	}
	public Map<Integer, String> getM() {
		return m;
	}
	public void setM(Map<Integer, String> m) {
		this.m = m;
	}
	public void displayList() {
		System.out.println("-------List Based Output-------");
		System.out.println("Que: "+getQuestion());
		System.out.println("Ans:");
		for(ListAnswers a:l) {
		System.out.println(a.getListAnswers());
		}
	}
	public void displaySet() {
		System.out.println("\n-------Set Based Output-------");
		System.out.println("Que: "+getQuestion());
		System.out.println("Ans:");
		for(SetAnswers s1:s) {
		System.out.println(s1.getSetAnswers());
		}
	}
	public void displayMap() {
		System.out.println("\n-------Map Based Output-------");
		System.out.println("Que: "+getQuestion());
		System.out.println("Ans:");
		for (Map.Entry<Integer, String> set : m.entrySet()) {
		    System.out.println(set.getKey() + " = " + set.getValue());
		
		}
	}
}

