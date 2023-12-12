/*
ある電車に a 人が乗っています。駅に到着した時に b 人が降りて新たに c 人が乗車する時、電車に乗っている乗客人数を求めてください。
N = 0;
N += a;
N = N - b + c;

入力される値
a b c

期待する出力
電車に乗っている乗客人数を出力してください。

入力例1
5 3 2

出力例1
4
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a - b + c);
    }
}