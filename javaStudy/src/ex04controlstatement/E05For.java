package ex04controlstatement;

import java.util.Iterator;

/*
 for문
 - while문과 같은 반복문으로 초기값, 조건식, 증감식이 한 줄에 있어 반복의 횟수를 명확히 알 수 있는 반복문.
 - 반복의 횟수가 정해져 있는 경우에 주로 사용.
 - 형식
 	for(초기값 ; 조건식 ; 증감식) { 
 		실행문장;
 	}
 */
public class E05For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5 ; i++) {
			System.out.println("i=" + i);
		}
		
		//누적합 저장용 변수 선언
		int sum = 0;
		//초기값 1부터 100이하까지 반복
		for (int j = 1; j <= 100; j++) {
			//증가하는 j의 값을 변수에 누적해서 더함
			sum += j;
		}
		System.out.println("1~100까의 합:" + sum);
		
		//방법1 : 1~10까지 10번 반복해서 if문을 통해 2의 배수를 찾은 후 누적해서 더한다.
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				total += i;
			}
		}
		System.out.println("1~10 사이 2의 배수의 합(방법1):" + total);
		
		//방법2 : if문 없이 초기값을 0부터 시작하여 2씩 증가시킴.
		total = 0;
		for (int i = 0; i <= 10; i+=2) {
			total += i;
		}
		System.out.println("1~10 사이 2의 배수의 합(방법2):" + total);
		
		//for문으로 무한루프를 만들때는 (;;)와 같이 표현
		int a = 1;
		for (;;) {
			System.out.println("나는 for문으로 만든 무한루프입니다." + a);
			a++;
			/*
			 무한루프는 기본적으로 에러 발생.
			 그리고 해당 루프를 탈출하지 못한다면 아래 코드들은 실행될 수 없다.
			 따라서 "Unreachable code"라는 에러가 발생하게 되므로,
			 아래와 같이 탈출조건을 만들어줘야 한다.
			 */
			if(a==10) break;
		}
		
		/*
		 for문의 끝에 ;을 사용하면 반복할 문장이 없는 것으로 간주되어
		 for문과 상관없이 한번만 실행된다.
		 */
		for (int j = 0; j <=5; j++); {
			System.out.println("어랏...나는 누구? 여긴 어디?");
		}
		
		/*
		 for문의 초기식에서 선언된 변수 j는 for문이 종료되는 순간 메모리에서 소멸된다.
		 여기서 사용된 변수 j는 지역변수(Local variable)라고 한다.
		 지역변수는 해당지역을 벗어나면 즉시 소멸되는 특징을 가지고 있다.
		 */
//		System.out.println("위 for문에서 선언한 변수 j=" + j);
		System.out.println("위 main함수 지역에서 선언한 변수 total=" + total);
		
		/*
		 for문의 초기값은 외부(넓은지역, 여기서는 main지역)에서 선언하면
		 해당변수는 for문 내부(좁은지역)에서 사용할 수 있다.
		 즉, 아래 선언한 변수 i는 main 메서드의 지역변수로 선언되었음.
		 */
		int i = 0;
		for (; i <= 5; i++) {
			System.out.println("for문 안에서의 i값="+ i);
		}
		System.out.println("for문 밖에서의 i값="+ i);
		/*
		 java에서는 중괄호가 나오면 하나의 지역이라고 생각하면 된다.
		 즉, if문, while문 등의 제어문도 각자의 지역을 가지게 된다.
		 */
		
		/*
		퀴즈1] 구구단을 출력하는 프로그램을 for문으로 작성하시오.
		 */
		
		for (int num1 = 1; num1 <=9; num1++) {
			for (int num2 = 1; num2 <=9 ; num2++) {
				System.out.printf("%d * %d = %-2d", num1, num2, (num1*num2));
				System.out.println();
			}
			System.out.println();
		}
		
		//단에 해당하는 for문(2~9단)
		for (int x = 2; x <= 9; x++) {
			//수에 해당하는 for문(1~9까지)
			for (int y = 1; y <= 9; y++) {
				System.out.printf("%d*%d=%-2d ", x, y, x*y);
//				System.out.print(x + "*" + y + "=" + x*y + " ");
			}
			//하나의 단을 출력한 후 줄바꿈
			System.out.println();
		}
		
		/*
		퀴즈2] 다음의 출력결과를 보이는 for문을 작성하시오
		출력결과
			0 0 0 1
			0 0 1 0
			0 1 0 0
			1 0 0 0
		해법 : x와 y를 더해서 5가 될때 1을 출력한다.
		 */

		System.out.println();
		
		for (int x = 1; x <= 4; x++) {
			int y = 1;
			while (y<=4) {
				if (x+y == 5) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
				y++;
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int x = 1; x <= 4; x++) {
			for (int y = 1; y <= 4; y++) {
				if (x+y==5) 
					System.out.print("1 ");
				else 
					System.out.print("0 ");
			}
			System.out.println();
		}

		
		
		
	}

}
