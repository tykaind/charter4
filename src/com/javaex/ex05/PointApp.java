package com.javaex.ex05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.javaex.ex04.Point;

public class PointApp {

	public static void main(String[] args) {
		 
		LinkedList<Point> ppList = new LinkedList<Point>();
		
		List<Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		for(Point p : pList) {
			System.out.println(p);
		}
	}
}
