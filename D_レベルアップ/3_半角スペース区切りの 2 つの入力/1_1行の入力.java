/*
文字列 s が 1 行で与えられるので s をそのまま出力してください。

入力される値
以下の形式で標準入力によって与えられます。
文字列 s が 1 行で与えられます。
s

期待する出力
入力された文字列をそのまま出力してください。また、出力の末尾には改行を入れてください。
s

入力例1
paiza

出力例1
paiza
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(s);

        sc.close();
    }
}