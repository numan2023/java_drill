/*
標準入力で3行それぞれで文字列が与えられるので、それらを入力して、そのまま3行で出力してください。

入力される値
文字列A, B, Cが各行で入力されます。

期待する出力
3行での出力

入力例1
aaaaa
bbbbbb
cccc

出力例1
aaaaa
bbbbbb
cccc
*/

// Success
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


// 模範解答
import java.util.*;
public class Main {
    public static void main(String... args) {
      Scanner sc = new Scanner(System.in);

      for (int i = 0; i < 3; i++) {
          String S = sc.nextLine();
          System.out.println(S);
      }
    }
}

/*
Please explain the following code in plain language. (deepL)
Please explain the following code in a simple and understandable way.(GPT)

1. Scanner sc = new Scanner(System.in);
    ・Here, a new Scanner object named sc is created.This scanner is configured(設定されている) to read input from System.in, which usually means it reads text that a user types into the console.
2. for (int i = 0; i < 3; i++) { ... }
    ・This is a loop that will run three times. The variable i starts at 0 and increases by 1 each time the loop runs, and the loop stops when i reaches 3.


for (int i = 0; i < 3; i++) { ... }
Please explain the following code in more detail and clarity.

1. int i = 0;
    ・Initialization: 
        This part runs only once when the loop starts. Here, i is declared as an integer variable and initialized to 0. Think of i as a counter starting from 0.
2. i < 3;
    ・Condition:
        Before each iteration(or loop cycle), this condition is checked. If it's true, the loop continues; if false, the loop stops. Here, the loop will continue as long as i is less than 3.
3. i++
    ・Increment:
        After each iteration, this part executes. i++ is shorthand for i = i + 1; it increases the value of i by 1. This incrementation(増加) moves the loop closer to its end condition.
*/
