/*
標準入力でN個の文字列が1行で与えられるので、それらを入力して、順にそのままN行で出力してください。

入力される値
1行目でNが与えらます。
2行目でN個の文字列が半角スペース区切りで与えれます。

期待する出力
N行での出力

入力例1
3
aaaaa bbbbbb cccc

出力例1
aaaaa
bbbbbb
cccc
*/

import java.util.*;

public class Main {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            System.out.println(s);
        }
    }
}