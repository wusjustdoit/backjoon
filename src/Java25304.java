import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제
준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다!
준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.

영수증에 적힌,

구매한 각 물건의 가격과 개수
구매한 물건들의 총 금액
을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

입력
첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.

둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.

이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.

출력
구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.

제한
1 ≤ X ≤ 1\,000\,000\,000
1 ≤ N ≤ 100
1 ≤ a ≤ 1\,000\,000
1 ≤ b ≤ 10
 */
public class Java25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 입력
        int amount = Integer.parseInt(br.readLine());  // 영수증에 적힌 총 금액
        int boughtGoodsNo = Integer.parseInt(br.readLine());  // 영수증에 적힌 구매한 물건 종류의 수

        // 계산
        for(int i = 0; i < boughtGoodsNo; i++) {
            String[] goodsPriceAndCount = br.readLine().split(" "); // 구매한 물건의 가격과 개수.

            int price = Integer.parseInt(goodsPriceAndCount[0]);
            int count = Integer.parseInt(goodsPriceAndCount[1]);

            int total = price * count;

            amount -= total; // 구매한 물품금액만큼 차감
        }

        // 출력
        if(amount == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
