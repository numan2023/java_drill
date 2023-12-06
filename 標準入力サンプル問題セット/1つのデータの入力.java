/* 
標準入力で1つの文字列が与えられるので、それを入力して、そのまま1行で出力してください。

入力される値
文字列Sが1行で入力されます。
期待する出力
1行での出力

入力例1
abc

出力例1
abc

入力例2
a

出力例2
a

Code the following problem that is about to appear in the Java language.
You will be given a single string as standard input, which you should enter and output on a single line as is.
Value to be input
The string S is input on a single line.
Expected output
Output on one line

input example 1
abc
Output example 1
abc

be about to do 〜しようとしている
*/

/*
方針
・入力を受け取って文字列Sに代入する
・Sをそのまま出力
*/

// 模範解答
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);
    }
}

// GPT
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(inputString);
        scanner.close();
    }
}


/*
Please explain the following statement in plain language

1. import java.util.Scanner;
    This line brings in a tool called Scanner from Java's standard library. The Scanner is used to read text input, like words or numbers, from different sources such as the keyboard.
2. public class Main {...}
    This defines a container or a blueprint named Main. In Java, everything is organized into these containers called classes.
3. public static void main(String[] args) {...}
    This is a special method in Java. Think of it as the starting point of any Java application.
    When you run a Java program, this is the first piece of code that gets executed.
4. Scanner scanner = new Scanner(System,in);
    Here, we create a new Scanner object named scanner. This particular scanner is set up to read input from System,in, which typically means it reads text that a user types into the console.
5. String inputString = scanner.nextLine();
    This line reads a full line of text that a user types in and stores it in a variable called inputString. This is done using the next Line() method of the scanner object, which waits for the user to type something and press Enter.
6. System.put.println(inputString);
    This line prints out the text stored in inputString onto the console. It's like saying, "Display whatever the user typed in."
7. scanner.close();
    Finally, this line tells the scanner that we are done using it. It's a good practice to close the scanner when it's no longer needed to free up resources that it might be holding onto.

So, in summary, this program waits for a user to type a line of text, then it repeats that same text back to the user.
*/