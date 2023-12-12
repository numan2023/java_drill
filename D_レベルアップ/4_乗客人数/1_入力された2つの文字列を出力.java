/*
2 つの文字列 S, T が入力されます。S, T を改行区切りで出力してください。

入力される値
S
T

期待する出力
答えの文字列を 2 行で出力してください。
S
T

入力例1
paiza
learning

出力例1
paiza
learning
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(s);
        System.out.println(t);

        sc.close();
    }
}