package javaStudy;
import java.util.*;
//예제 7-5

/*
(영어,한글) 단어를 쌍으로 해시맵에 저장하고 
 영어로 한글을 검색하는 프로그램을 작성하라
 "exit"이 입력되면 프로그램을 종료한다 
 */
public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>(); //해시맵 생성
		// var dic = new HashMap<String, String>();로 간략히 써도 가능
		
		//3개의 (key, value) 쌍을 dic에 저장
		dic.put("baby","아기"); //"baby"는 key, "아기"는 value
		dic.put("love", "사랑"); 
		dic.put("apple", "사과"); 
		
		//사용자로부터 영어 단어를 입력받고 한글 단어 검색. "exit" 입력받으면 종료 
		Scanner scanner = new Scanner(System.in); 
		
		while(true) {
			System.out.print("찾고 싶은 단어는?");
			String eng = scanner.next(); 
			if(eng.contentEquals("exit")) {
				System.out.println("종료합니다...");
				break; 
			}
			
			//해시맵에서 '키' eng의 '값' kor 검색
			String kor = dic.get(eng); 
			if(kor == null)
				 System.out.println(eng + "는 없는 단어입니다.");
			else
				 System.out.println(kor);
		}
		
		scanner.close();
	}

}
