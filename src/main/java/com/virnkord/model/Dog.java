package com.virnkord.model;

public class Dog {

	private String hair;
	private String breed;
	private int height;
	private String tail;
	private String ears;
	private String body;
	private int weight;
	private String marks;
	private String character;
	private String color;
	
	//порода
	public String getBreed() {return breed;}
	public void setBreed(String breed) {this.breed = breed;}
	
	//Короткошерстная, длинношерстная
	public String getHair() {return hair;}
	public void setHair(String hair) {this.hair = hair;}
	
	//Pocт <50, >50 <70, >70
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	
	//Хвост
	public String getTail() {return tail;}
	public void setTail(String tail) {this.tail = tail;}
	
	//Уши
	public String getEars() {return ears;}
	public void setEars(String ears) {this.ears = ears;}
	
	//Длина тела
	public String getBody() {return body;}
	public void setBody(String body) {this.body = body;}
	
	//Вес
	public int getWeight() {return weight;}
	public void setWeight(int weight) {this.weight = weight;}
	
	//Отметины
	public String getMarks() {return marks;}
	public void setMarks(String marks) {this.marks = marks;}
	
	//Характер
	public String getCharacter() {return character;}
	public void setCharacter(String character) {this.character = character;}
	
	//Окрас
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}

}