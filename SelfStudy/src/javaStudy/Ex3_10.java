package javaStudy;

//다차원 배열
//3차원 이상의 배열은 특별한 경우에만 사용하기 때문에 보통은 2차원 배열만 다룬다.

//2차원 배열의 선언과 생성 
/*
 1차원 배열과 마찬가지로 2차원 배열에서도 레퍼런스 변수 선언 후 배열을 생성한다.
 2차원 배열의 레퍼런스 변수를 선언하는 방법은 다음 두 가지가 있다.
 
  int intArray[][]; 
  char charArray[][];
  double doubleArray[][];
  또는
  int [][] intArray; 
  char [][] charArray; 
  double [][] doubleArray;
  
  2차원 배열의 저장공간은 다음과 같이 new 연산자를 이용하여 생성하며,
  첫번째 []는 행의 개수를, 두번째 []는 열의 개수를 나타낸다.
  intArray = new int[2][5]; //2행 5열의 2차원 배열 생성
  charArray = new char[5][5]; //5행 5열의 2차원 배열 생성
  doubleArray = new double[5][2]; //5행 2열의 2차원배열생성
 
 2차원 배열에서 행의 각 원소는 1차원 배열에 대한 레퍼런스가 된다.
 
 int i[][] = new int[2][5]; 
 int size1 = i.length; //2
 int size2 = i[0].length; //5
 int size3 = i[1].length; //5
 new int [2][5]에 의해 생성된 2차원 배열의 구조에서 length의 의미를 살펴보면 다음과 같다
 i.length -> 2차원 배열의 행의 개수, 2
 i[0].length -> 0번째 행에 있는 열의 개수, 5
 i[1].length -> 1번째 행에 있는 열의 개수, 5
 
 2차원 배열도 레퍼런스 변수 선언과 배열 생성을 동시에  할 수 있다
 int intArray [][] = new int[2][5]; 
 char charArray [][] = new char[5][5]; 
 double doubleArray [][] = new double[5][2]; 

 */

/* 2차원 배열의 초기화
 : 다음과 같이 2차원 배열을 선언할 때각 원소를 초기화할 수 있다. 그러면 자동으로
 원소개수만한 배열 공간이 할당되고, 원소 값으로 초기화된다
 int intArray[][] = {{0,1,2},{3,4,5},{6,7,8}}; //3x3배열생성
 char charArray[][] = {{'a','b','c'},{'d','e','f'}}; //2x3배열생성
 double doubleArray[][] = {{0.01,0.02},{0.03,0.04}}; //2x2배열생성
  
 */

//2차원 배열에 학년별로 1,2학기 성적으로 저장하고, 4년간 전체 평점 평균을 출력하라. 
public class Ex3_10 {
	public static void main(String[] args) {

		double score[][] = { { 3.3, 3.4 }, // 1학년 1, 2학기 평점
				{ 3.5, 3.6 }, // 2학년 1학기,2학기 평점
				{ 3.7, 4.0 }, // 3학년 1학기, 2학기 평점
				{ 4.1, 4.2 } // 4학년 1학기, 2학기 평점
		};

		double sum = 0;
		for (int year = 0; year < score.length; year++) // 각 학년별로 반복
			for (int term = 0; term < score[year].length; term++) // 학기별로 반복
				sum += score[year][term]; // 전체 평점 합
		int n = score.length; // 배열의 행 개수, 4(4학년)
		int m = score[0].length; // 배열의 열 개수, 2(2학기)

		System.out.println("4년 전체 평점 평균은 " + sum / (n * m));

	}

}