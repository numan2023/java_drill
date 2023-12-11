/*
整数 A = 202、B = 134、C = 107 とします。
((A+B)*C)^2を計算した結果を出力してください。

入力される値
ありません

期待する出力
計算結果 N を一行で出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
N
*/

// Wrong Code
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        var A = 202;
        var B = 134;
        var C = 107;
        var D = (A + B) * C;
        var result = Math.pow(D, 2);
        System.out.println(result);
    }
}


// 模範解答
import java.util.*;

public class Main {
    public static void main(String... args) {
        var a = 202;
        var b = 134;
        var c = 107;

        System.out.println(((a + b) * c) * ((a + b) * c));
    }
}