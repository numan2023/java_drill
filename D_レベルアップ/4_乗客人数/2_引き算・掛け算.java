/*
整数 A, B が与えられます。A と B の差 D と積 P を半角スペース区切りで出力してください。
A-B=D
A*B=P

入力される値
A B

期待する出力
期待する結果 D と P を半角スペース区切り一行で出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
D P

入力例1
397 646

出力例1
-249 256462
*/


// GPT
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers A and B
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calculate the difference and the product
        int D = A - B;
        int P = A * B;

        // Output the results separated by a space
        System.out.println(D + " " + P);

        scanner.close();
    }
}

// 模範解答
import java.util.*;

public class Main {

    public static void main(String... args) {
        var sc = new Scanner(System.in);

        var a = sc.nextInt();
        var b = sc.nextInt();

        System.out.println((a - b) + " " + (a * b));
    }
}