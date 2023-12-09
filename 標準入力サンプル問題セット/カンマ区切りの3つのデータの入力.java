/*
標準入力で3つの文字列が1行で与えられるので、それらを入力して、順にそのまま3行で出力してください。

入力される値
3つの文字列がカンマ区切りで1行で与えれます。

期待する出力
3行での出力

入力例1
aaaaa,bbbbbb,cccc

出力例1
aaaaa
bbbbbb
cccc
*/

import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        //-----------------------------------
        // 1. 区切り文字を指定
        sc.useDelimiter(",");
        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            System.out.println(s);
        }
        //-----------------------------------

        //-----------------------------------
        // 2. split で分割
        // String line = sc.nextLine();
        // String[] words = line.split(",");
        // for (int i = 0; i < 3; i++) {
        //      String s = words[i];
        //      System.out.println(s);
        // }
        //-----------------------------------
    }
}


/*
Please explain the following code in a way that is easy to understand for a beginner in the Java language.

Code Overview
  This java program reads and processes input strings. It has two different sections to achieve this.

Imports
  import java.util.*;
  import java.util.regex.*;
      These lines import packages from the Java library. java.util contains the Scanner class, which is used for reading inputs. java.util.regex is for regular expressions, but it's not actually used in this code.

Class Declaration
  public class Main {
    public static void main(String... args) {
        // ...
    }
}

Reading input Using Scanner
  Scanner sc = new Scanner(System.in);

Section 1: Using Scanner with Custom Delimiter
  sc.useDelimiter(",");
  for (int i = 0; i < 3; i++) {
      String s = sc.next();
      System.out.println(s);
  }
      ・sc.useDelimiter(","):This sets the delimiter of the Scanner to a comma(','). The delimiter is used to separate inputs. By default. Scanner uses whitespace(like spaces) to separate inputs. Here, it's changed to a comma.
      ・The for loop runs three times (i < 3).
      ・sc.next():Each time, it reads the next input token, which is now separated by commas, not space.
      ・System.out.println(s):It then prints each token (string) to the console.

Section 2: Using split to Divide a String
  String line = sc.nextLine();
  String[] words = line.split(",");
  for (int i = 0; i < 3; i++) {
      String s = words[i];
      System.out.println(s);
  }

       ・String line = sc.nextLine(): It reads a whole line of input.
       ・line.split(","): This splits the line into an array of strings, words, using a comma as the separator.
       ・The for loop then would print each of the first three elements of this array.
*/