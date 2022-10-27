package step002;

import java.util.Scanner;

/*
문제
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
시험 성적을 출력한다.
 */
public class Java9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수
        String grade; // 학점등급
        // 입력
        int score = sc.nextInt();

        // 계산
        switch (score/10){
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }

        // 출력
        System.out.println(grade);
    }
}
