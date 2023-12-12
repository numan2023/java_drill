/*
以下のアルゴリズムを実行してください。


変数 N を 0 で初期化する
N に 3,286 を足した値を N へ代入する
N に 4,736 をかけた値を N へ代入する
N を 12,312 で割った余りを N へ代入する
N を出力する

入力される値
ありません

期待する出力
計算結果 N を一行で出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
N
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        var N = 0;
        N = N + 3_286;
        N = N * 4_736;
        N = N % 12_312;
        System.out.println(N);
    }
}

// 模範解答
import java.util.*;

public class Main {
    public static void main(String... args) {
        var N = 0;

        N += 3_286;
        N *= 4_736;
        N %= 12_312;

        System.out.println(n);
    }
}