import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
문제
1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.

입력
첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.

출력R
첫째 줄에 게임의 상금을 출력 한다.
 */
public class Java2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if (a == b && a == c) {
            System.out.print(10000+a*1000);
        } else if (a == b) {
            System.out.print(1000+a*100);
        } else if (a == c) {
            System.out.print(1000+a*100);
        } else if (b == c) {
            System.out.print(1000+b*100);
        } else {
            System.out.print(Math.max(a,Math.max(b,c)) * 100);
        }
//        Scanner sc = new Scanner(System.in);
//
//        // 변수 설정 및 입력
//        int i = sc.nextInt();
//        int j = sc.nextInt();
//        int k = sc.nextInt();
//
//        int reward = 0; // 상금
//        int max;        // 최대값
//
//        // 로직
//        // 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//        if(i == j && i == k && j == k) {
//                reward = 10000 + ((i + j + k) / 3) * 1000;
//        }
//        //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//        else if(i == j || i == k || j == k) {
//            if(i == j) {
//                reward = 1000 + (i * 100);
//            } else if(i == k) {
//                reward = 1000 + (i * 100);
//            } else if(j == k) {
//                reward = 1000 + (i * 100);
//            }
//        }
//        //모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
//        else if(i != j && i != k && j != k) {
//            max = Math.max(i,Math.max(j,k));
//            reward = max * 100;
//        }
//
//        System.out.println(reward);

    }
}
