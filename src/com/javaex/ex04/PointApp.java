package com.javaex.ex04;

import java.util.ArrayList;

public class PointApp {

	public static void main(String[] args) {

		ArrayList<Point> pList =new ArrayList<Point>();
		
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		pList.add(p01);
		System.out.println(pList.size());
		
		pList.add(p02);
		System.out.println(pList.size());
		
		pList.add(p03);
		System.out.println(pList.size());
		
		Point p = pList.get(1);
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p.toString());
		System.out.println(p);
		
		System.out.println("--------------");
		
		for(int i=0; i<pList.size(); i++) {
			Point pp = pList.get(i);
			System.out.println(pp.toString());
		}
		
		System.out.println("===============");
		System.out.println(pList);
		
		
		
		System.out.println("===============");
		for(Point ppp : pList) {
			System.out.println(ppp);
		}
		
		//원 추가
		Circle c01 = new Circle(100);
		
	}
}
