package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		System.out.println("point 관리------------");
		MyList pList = new MyList();
		
		Point p00 = new Point(1,1);
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		
		pList.add(p00);
		pList.add(p01);
		pList.add(p02);
		
		for(int i =0; i<pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		System.out.println("cirlcle 관리----------------");
		MyList cList = new MyList();
	}
	

}
