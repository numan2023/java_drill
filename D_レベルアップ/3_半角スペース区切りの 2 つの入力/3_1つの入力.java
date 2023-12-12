/*
半角スペースを含まない文字列 s が 1 行で与えられるので、そのまま出力してください。

入力される値
以下の形式で標準入力によって与えられます。
文字列 s が 1 行で与えられます。
s

期待する出力
入力された文字列 s をそのまま出力してください。
また、末尾に改行を入れ、余計な文字、空行を含んではいけません。
s

入力例1
hello

出力例1
hello
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