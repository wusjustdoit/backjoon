package step001;

import java.util.Scanner;

/*
문제
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

https://www.acmicpc.net/upload/images/f5NhGHVLM4Ix74DtJrwfC97KepPl27s%20(1).png

(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 */
public class Java2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 세자리 자연수
        int first;
        String second;

        //입력
        first = sc.nextInt();
        second = sc.next();

        // 출력
        System.out.println(first * Integer.parseInt(second.substring(2,3)));
        System.out.println(first * Integer.parseInt(second.substring(1,2)));
        System.out.println(first * Integer.parseInt(second.substring(0,1)));
        System.out.println(first * Integer.parseInt(second));
    }
}
