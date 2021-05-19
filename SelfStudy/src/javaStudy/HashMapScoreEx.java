package javaStudy;
import java.util.*; 

//예제 7-6
//해시맵을 이용하여 학생의 이름과 자바 점수를 기록 관리하는 프로그램을 작성하라 

public class HashMapScoreEx {
	public static void main(String[] args){
		
		//이름과 점수를 저장할 HashMap 컬렉션 생성
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>(); 
		
		//5개의 점수 저장
		scoreMap.put("김성동", 97); 
		scoreMap.put("황기태", 88); 
		scoreMap.put("김남윤", 98); 
		scoreMap.put("이재문", 70); 
		scoreMap.put("한원선", 99); 
		
		System.out.println("HashMap의 요소 개수 :" + scoreMap.size());
		
		//모든 사람의 점수 출력. scoreMap에 들어있는 모든 (key, value) 쌍 출력
		Set<String> keys = scoreMap.keySet(); //모든 key를 가진 set 컬렉션 리턴
		Iterator<String> it = keys.iterator(); //Set에 있는 모든 Key를 순서대로 검색하는 Iterator 리턴
		
		while(it.hasNext()) {
			String name = it.next(); //다음 키, 학생 이름
			int score = scoreMap.get(name); //점수 알아내기
			System.out.println(name + " : " + score);
		}
	
		
	}
	
	//*****출력된 결과는 삽입된 순서와는 다르다*****

}
