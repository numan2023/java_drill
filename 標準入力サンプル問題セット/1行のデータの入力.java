/*
標準入力で1行の文字列が与えられるので、それを入力して、そのまま1行で出力してください。

入力される値
文字列Sが1行で入力されます。

期待する出力
1行での出力

入力例1
abc

出力例1
abc
*/

// Success 100
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);
    }
}