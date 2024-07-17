package chapter1.practice;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {

		// 모두 대문자로 만들기
		// 사용자로부터 문자열 statement를 입력받고
		// 입력 받은 문자열을 영어라면 모두 대문자로 변경하여
		// 문자 배열에 저장한 후 출력
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String statement = scanner.nextLine();
		char[] stateChars = new char[statement.length()];
		for(int index = 0; index < stateChars.length; index ++) {
			stateChars[index] = statement.charAt(index);
		}
		
		for(int index = 0; index < stateChars.length; index ++) {
			if(stateChars[index] >= 'a' && stateChars[index] <= 'z') {
				stateChars[index] -= 32;
			}
		}
		System.out.println(stateChars);
		scanner.close();
		
	}

}
