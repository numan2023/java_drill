/*
標準入力で3つの文字列が1行で与えられるので、それらを入力して、順にそのまま3行で出力してください。

入力される値
3つの文字列が半角スペース区切りで1行で与えれます。

期待する出力
3行での出力

入力例1
aaaaa bbbbbb cccc

出力例1
aaaaa
bbbbbb
cccc


方針
・入力を1行受け取り、半角スペース区切りで３つに分割
*/




// 模範解答
import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


/*
Please explain clearly the difference between the following two codes.
String a = sc.next();
String S = sc.nextLine();

Use sc.next();
 when you need to read single word or tokens from the input.
Use sc.nextLine();
  when ou need to read a whole line of text, including spaces between words.

*/
