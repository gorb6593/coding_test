import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //이 문제는 잘 모르겠음..다시 풀 필요가 있음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a1 = Integer.parseInt(arr[0]);
        int a0 = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        int result = (a1 * n0 + a0 <= c * n0) && (c >= a1)?1:0;
        System.out.println(result);

    }
}