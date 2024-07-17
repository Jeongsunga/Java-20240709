package chapter1;

public class ControlEtc {

	public static void main(String[] args) {

		// continue : 반복문에서 continue를 만나면 조건 검사로 넘어감
		// break : 반복문에서 break를 만나면 반복문을 종료함
		// continue, break문은 조건문과 같이 사용됨
		
		// count가 3의 배수가 아니면 count 출력
		// count가 4의 배수면서 11의 배수이면 반복을 종료
		for(int count = 1; count <= 1000; count++) {
			if(count % 3 == 0) continue;
			if(count % 4 == 0 && count % 11 == 0) break;
			System.out.println(count);
		}
	}

}
