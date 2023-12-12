/*
文字列 s と t が 2 行で与えられるので、s と t の 2 行をそのまま出力してください。

入力される値
以下の形式で標準入力によって与えられます。
文字列 s と t が 2 行で与えられます。
s
t

期待する出力
入力された文字列をそのまま出力してください。また、出力の末尾には改行を入れてください。
s
t

入力例1
paiza
gino

出力例1
paiza
gino
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