/*
標準入力でN行それぞれで文字列が与えられるので、それらを入力して、順にそのままN行で出力してください。

入力される値
1行目でNが与えらます。
続くN行の各行で文字列が与えられます。

期待する出力
N行での出力

入力例1
3
aaaaa
bbbbbb
cccc

出力例1
aaaaa
bbbbbb
cccc
*/


// Error
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Int n = sc.next();
        for (int i = 0; i < n; i++) {
            String S = sc.nextLine();
            System.out.println(S);
        }
    }
}
/*
Int n = sc.next();
        ^
  symbol:   class Int
  location: class Main
1 error
*/


// 模範解答
import java.util.*;
public lass Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < N; i++) {
            System.out.println(sc.nextLine());
        }
    }
}

/*
1. Reading an Integer: int N = Integer.parseInt(sc.nextLine());
    ・sc.nextLine() reads a line of input from the console and returns it as a String.
    ・Integer.parseInt() converts this String to an int.
    ・The integer read is stored in the variable N.
2. Loop Declaration: for (int i = 0; i < N; i++) { ... }
    ・This is a for loop, which is used to repeat b block of code multiple times/
3. inside the Loop: System.out.println(sc.nextLine());
    ・Within the loop, each iteration reads a line of input from the console using sc.nextLine().
    ・This input is then immediately printed to the console using System.out.println().

parse(解析)
*/