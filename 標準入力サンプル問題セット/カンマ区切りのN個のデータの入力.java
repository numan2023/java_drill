/*
標準入力でN個の文字列が1行で与えられるので、それらを入力して、順にそのままN行で出力してください。

入力される値
1行目でNが与えらます。
2行目でN個の文字列がカンマ区切りで与えれます。

期待する出力
N行での出力


入力例1
3
aaaaa,bbbbbb,cccc

出力例1
aaaaa
bbbbbb
cccc
*/

import java.util.*;

public class Main {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        sc.useDelimiter(",");
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            System.out.println(s);
        }
    }
}

// 模範解答
/*
方針
  ・はじめに文字列の個数Nを受け取る
  ・入力を1行受け取り、カンマを区切り文字としてN個に分割
*/

import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String... args) {
        //-----------------------------------
        // 1.区切り文字を指定
        // int N = sc.nextInt();
        // sc.useDelimiter(",");
        // for (int i = 0; i < N; i++) {
        //    String s = sc.next();
        //    System.out.println(s.trim());
        // }
        //-----------------------------------

        // 2. split で分割
        String line = sc.nextLine();
        int N = Integer.value0f(line);

        line = sc.nextLine();
        String[] words = line.split(",");
        for (int i = 0; i < N; i++) {
            String s = words[i];
            System.out.println(s);
        }
    }
}