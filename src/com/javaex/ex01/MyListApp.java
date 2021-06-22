package com.javaex.ex01;

import com.javaex.ex03.Point;

public class MyListApp {

	public static void main(String[] args) {
		//포인트를 관리하는 리스트(배열대용)를 만든다.
		
		PointList pList = new PointList();
		
		Point p00 = new Point(2,2);
		Point p01 = new Point(3,3);
		Point p02 = new Point(4,4);
		
		pList.add(p00); //배열1개
		pList.add(p01); //배열2개
		pList.add(p02); //배열3개
		
		System.out.println(pList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println(pList.size()); //갯수
		
		System.out.println(pList.get(1)); //꺼내서 출력
		
		pList.remove(1); //인덱스가 1번째 자리인 데이터 삭제
		
		
		Point p03 = new Point(100,100);
		pList.add(p03);
		*/
		
		
		
		
		
		
		
		
	/*  배열사용시
		Point[] pArray = new Point[2]; //갯수를 정해야된다.
		
		Point p00 = new Point(2,2);
		Point p01 = new Point(3,3);

		pArray[0] = p00;
		pArray[1] = p01;
		
		for(int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i]);
		}
	*/
	}

}
