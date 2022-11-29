import java.awt.*;
import java.io.*;
import java.util.StringTokenizer;

/*
문제
본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.

C++을 사용하고 있고 cin/cout을 사용하고자 한다면, cin.tie(NULL)과 sync_with_stdio(false)를 둘 다 적용해 주고, endl 대신 개행문자(\n)를 쓰자.
단, 이렇게 하면 더 이상 scanf/printf/puts/getchar/putchar 등 C의 입출력 방식을 사용하면 안 된다.

Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

Python을 사용하고 있다면, input 대신 sys.stdin.readline을 사용할 수 있다.
단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 .rstrip()을 추가로 해 주는 것이 좋다.

또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.

자세한 설명 및 다른 언어의 경우는 이 글에 설명되어 있다.

이 블로그 글에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.

입력
첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

출력
각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
 */
public class Java15552 {
    public static void main(String[] args) throws IOException {

        /*
        BufferedReader : Scanner와 유사
        Bufferedwriter : System.println();과 유사
        기존에 쓰던 Scanner와 System.out.println()보다 속도 측면에서 빠르다.
        (입력된 데이터가 바로 전달되지 않고 버퍼를 거쳐 전달되어 데이터 처리 효율성을 높임)
        따라서 많은 양의 데이터를 처리할 때 유용하다.

        사용법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine(); //String
        int i = Integer.parseInt(bf.readLine()); //Int

        선언은 위에 있는 예제처럼 진행하면 된다.

        입력은 readLine();이라는 메서드를 활용하는데, 여기서 반드시 주의해야할 점 2가지가 있다.

        첫번째는 readLine()시 리턴값이 String으로 고정되기에 String이 아닌 다른 타입으로 입력을 받으려면 형변환을 해주어야한다.

        두번째는 예외처리를 해야한다. readLine()을 할때마다 try&catch를 활용하여 예외처리를 해주어도 되지만 대개 throws IOException을 통하여 작업한다.

        throw 이용 시
        (1) 클래스를 import해주어야 한다.
            import java.io.IOException;
        (2) main 클래스 옆에 throws IOException를 작성한다.
            public static void main(String[] args) throws IOException {}

        StringTokenizer st = new StringTokenizer(s); //StringTokenizer 인자값에 입력 문자열 넣음
        int a = Integer.parseInt(st.nextToken()); //첫번째 호출
        int b = Integer.parseInt(st.nextToken()); //두번째 호출

        String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        String s = "abcdefg";   //출력할 문자열
        bw.write(s+"\n");   //버퍼에 있는 값 전부 출력
        bw.flush();   //남아있는 데이터를 모두 출력시킴
        bw.close();   //스트림을 닫음

        BufferedWriter 의 경우 버퍼를 잡아 놓았기 때문에 반드시 flush() / close() 를 반드시 호출해 주어 뒤처리를 해주어야 한다.

        그리고 bw.write에는 System.out.println();과 같이 자동개행기능이 없기때문에 개행을 해주어야할 경우에는 \n를 통해 따로 처리해주어야 한다.
         */
        // 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        /*
        StringTokenizer 클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스.
        그렇게 쪼개어진 문자열을 우리는 토큰(token)이라고 부름.
         */

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.close();
    }
}
