package com.javaex.ex01;

import java.util.Arrays;

import com.javaex.ex03.Point;

public class PointList {

	private Point[] pArray;
	private int crtPos;
	
	
	public PointList() {
		this.pArray = new Point[3];
		crtPos =0;
	}
	
	
	
	
	public void add(Point point) {	//추가
		pArray[crtPos] = point;
		crtPos++;
		
	}
	public Point get(int index) {
		return pArray[index];
	}
	
	public int size() {
		return crtPos;
	}



	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
	
}
