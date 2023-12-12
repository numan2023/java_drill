/*
文字列 s_1, s_2 が半角スペースで区切られて 1 行で与えられます。
各文字列を出力するごとに改行し 2 行で出力してください。

入力される値
以下の形式で標準入力によって与えられます。
半角スペースで区切られた文字列 s_1, s_2 が 1 行で与えられます。
s_1 s_2

期待する出力
入力された文字列 s_1, s_2 をそれぞれ改行区切りで出力してください。
また、末尾に改行を入れ、余計な文字、空行を含んではいけません。
s_1
s_2

入力例1
hello paiza

出力例1
hello
paiza
*/

// GPTのコード -> Success
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] parts = line.split(" ");

        System.out.println(parts[0]);
        System.out.println(parts[1]);

        sc.close();
    }
}

// 模範解答 <- これって問題文に合ってる？ -> next();だからなりたってる？？
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        // sc.nextLine()の場合、error

        System.out.println(s);
        System.out.println(t);

        sc.close();
    }
}