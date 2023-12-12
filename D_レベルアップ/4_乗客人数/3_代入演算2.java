/*
整数 A, B, C が与えられます。以下のアルゴリズムを実行してください。

変数 N を 0 で初期化する
N に A を足した値を N へ代入する
N に B をかけた値を N へ代入する
N を C で割ったあまりを N へ代入する
N を出力する

入力される値
A B C

期待する出力
計算結果 N を一行で出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
N

入力例1
149 825 262

出力例1
47
*/

import java.util.*;

public class Main {

    public static void main(String... args) {
        var sc = new Scanner(System.in);

        var a = sc.nextInt();
        var b = sc.nextInt();
        var c = sc.nextInt();

        var n = 0;

        n += a;
        n *= b;
        n %= c;

        System.out.println(n);
    }
}