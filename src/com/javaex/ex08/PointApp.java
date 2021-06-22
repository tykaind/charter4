package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	//메소드 일반
	public static void main(String[] args) {
		
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(1,1);
		Point p02 = new Point(2,2);
		Point p03 = new Point(3,3);
		
		//map은 put을 써서 저장을하며 이름을 정해줘야한다.
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("유재석", p03);
		
		System.out.println(pMap.size()+"개");
		System.out.println(pMap.toString());
		System.out.println(pMap.get("정우성").getX());
		
		//추가할려했지만 이름값이 똑같아 수정의 의미로 쓰여졌다.
		Point p04 = new Point(100, 1000);
		pMap.put("유재석", p04);
		System.out.println(pMap.toString());
		
		//키 리스트를 만든다.
		//["정우성", "이효리", "유재석"] --> 맵이 키들을 셋으로 관리하고있다.
		//pMap.get(이름)
		
		Set<String> kyes = pMap.keySet();
		
		
		
		for(String key : kyes) {
			System.out.println(pMap.get(key).toString());
		}
	}
}
