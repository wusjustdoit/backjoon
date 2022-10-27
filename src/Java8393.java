import java.util.Scanner;

/*
문제
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

출력
1부터 n까지 합을 출력한다.
 */
public class Java8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수
        int result = 0;

        // 입력
        int n = sc.nextInt();

        // 계산
        for(int i = 1; i <= n; i ++) {
            result += i;
        }

        // 출력
        System.out.println(result);
    }
}
