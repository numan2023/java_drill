// # # カンマ区切りで２つ出力（D）
// # "Output two numbers separated by a comma(D)"

// # # 2 つの数値が半角スペース区切りで与えられます。これらの数値をカンマ区切りで出力してください。
// # Two numerical values separated by a space will be given. Please output these numbers separated by a comma.
// # (numerical:数値の、数値に関連する, ex:numerical data=数値データ)

// # # 入力される値
// # # N M
// # Values to be input:

// # # 期待する出力
// # # 答えの数値を出力してください。
// # # N,M
// # Expected output:
// # Please output the numerical answer.

// # # 条件
// # # すべてのテストケースにおいて、以下の条件をみたします。
// # # * 1 ≦ N, M ≦ 10
// # Conditions:
// # In all test cases, the following conditions are met:

// # # 入力例1
// # # 5 1
// # Input example 1:

// # # 出力例1
// # # 5,1
// # Output example 1:

// ---------------------------
// 模範解答
// Javaの場合
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(n + "," + m);

        sc.close();
    }
}

/*
・入力される2つの整数を、nextInメソッドを2回使って受け取る
・出力時、+を使い、複数の値を1行で出力

1. パッケージのインポート：import java.util.*;
    javaのユーティリティパッケージから必要なクラスやインターフェースをプログラムで使えるようにインポート。Scannerクラスを使用するために必要。
Importing the Package:
    This line imports the necessary classes and interfaces from Java's utility package for use in the program. This is particularly needed for using the Scanner class.
2. Mainクラスの定義：public class Main {...}
Defining the Main Class:
    Here, a class named Main is defined. Java programs are executed within a class.
3. mainメソッドの定義：public static void main (String[] args) {...}
    javaプログラムのエントリーポイント。プログラム実行されると、mainメソッドが最初に呼び出される。
Defining the main Method:
    This is the entry point of a java program. When the program is run, this main method is called first.
4. Scannerのインスタンス化：Scanner sc = new Scanner(System.in);
    Scannerオブジェクトを作成。Scannerはユーザーからの入力を読み取るために使用される。System.inは標準入力（通常はキーボード）を指す。
Instantiating the Scanner:
    Here, a Scanner object is created. The Scanner is used to read user input. System.in refers to the standard input, usually the key board.
5. ユーザー入力の読み取り：
    ・int n = sc.nextInt(); 最初の整数値を読み取り、変数nに代入
Reading User Input:
    Reads the first integer value and assigns it to the variable `n`
6. 入力値の出力：System.out.println(n + "," + m);
    読み取った2つの整数をカンマ区切りで出力
Outputting the Input Values:
    Here, the two integers read(`n` and `m`) are output separated by a comma.
7. Scannerのクローズ：sc.close();
    Scannerオブジェクトを閉じる。リソースを適切に解放するための良い習慣。
Closing the Scanner:
    Finally, the Scanner object is closed. This is a good practice for properly releasing resources.
*/