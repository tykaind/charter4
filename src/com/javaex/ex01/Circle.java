package com.javaex.ex01;

import java.util.Arrays;

public class Circle {
	//필드
	private int i =0;;
	private CircleList[] cArray;
	
	
	//생성자
	public Circle() {}
	
	public Circle(int i, CircleList[] cArray) {
		super();
		this.i = i;
		this.cArray = cArray;
	}
	
	
	//메소드 겟셋
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public CircleList[] getcArray() {
		return cArray;
	}

	public void setcArray(CircleList[] cArray) {
		this.cArray = cArray;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Circle [i=" + i + ", cArray=" + Arrays.toString(cArray) + "]";
	}

}
