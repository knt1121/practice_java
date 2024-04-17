public class Chapter3_1 {
    public static void main (String[] args) {
        System.out.println("Chapter3");
        //算術演算子と単項演算子の練習
        int a = 1;
        int b = 2;
        System.out.println("aは1、bは2です");
        System.out.println("a+bの値は" + (a+b));
        System.out.println("a-bの値は" + (a-b));
        System.out.println("a*bの値は" + (a*b));
        System.out.println("a/bの値は" + (a/b));
        System.out.println("a%bの値は" + (a%b));
        System.out.println("a++の値は" + (a++));
        System.out.println("a--の値は" + (a--));
        System.out.println("++aの値は" + (++a));
        System.out.println("--aの値は" + (--a));

        //整数と少数での差異
        System.out.println("10/3の値は" + 10 / 3);
        System.out.println("10/3.0の値は" + 10 / 3.0);

        //文字列と数字の結合
        String name = "KK"; int age = 26; int weight = 50;
        System.out.println("nameはKK、ageは26、weightは50です");
        System.out.println("name + age + weightの値は" + name + age + weight);
        System.out.println("age + name + weightの値は" + age + name + weight);
        System.out.println("age + weight + nameの値は" + age + weight + name);//なぜ76KKにならない？
        System.out.println("name + (age + weight)の値は" + name + (age + weight));

        //インクリメントとデクリメント
        //[++x]は計算が先[x++]は計算が後
        int w = 1; int x = 1; int y = 1; int z = 1;
        System.out.println("wは1、xは1、yは1、zは1");
        System.out.println("++wの値は" + ++w);//計算処理が先
        System.out.println("x++の値は" + x++);//出力が先
        System.out.println("y--の値は" + y--);//出力が先
        System.out.println("--zの値は" + --z);//計算処理が先

        //代入演算子と複合代入演算子
        System.out.println("代入演算子と複合代入演算子について");
        System.out.println("a = bは aにbを代入する");
        System.out.println("a += bは aにbを加えた値を代入する");
        System.out.println("a -= bは aからbを引いた値を代入する");
        System.out.println("a *= bは aにbをかけた値を代入する");
        System.out.println("a /= bは aをbで割った代入する");
        System.out.println("a %= bは aをbで割った余りを代入する");

        //関係演算子
        System.out.println("代入演算子と複合代入演算子について");
        System.out.println("a == bは aとbの値が等しければtrue、異なればfalse");
        System.out.println("a != bは aとbの値が異なればtrue、等しければfalse");
        System.out.println("a > bは  aがbよりも大きければのtrue、以下ならばfalse");
        System.out.println("a >= bは aがb以上であればtrue、小さければfalse");
        System.out.println("a < bは  aがbよりも小さければtrue、以上ならばfalse");
        System.out.println("a <= bは aがb以下であればtrue、大きければfalse");

        //論理演算子
        System.out.println("a & bは aとbの両方がtrueであればtrue、そうでなければfalse");
        System.out.println("↑の場合、aがfalseであってもbは評価される");
        System.out.println("a && bは aとbの両方がtrueであればtrue、そうでなければfalse");
        System.out.println("↑の場合、aがfalseであればbは評価されない。aがfalseの時点でfalseが確定するから合理的");
        System.out.println("a | bは aとbのどちらかがtrueであればtrue、そうでなければfalse");
        System.out.println("↑の場合、aがtrueであってもbは評価される");
        System.out.println("a || bは aとbの両方がtrueであればtrue、そうでなければfalse");
        System.out.println("↑の場合、aがtrueであればbは評価されない。aがtrueの時点でtrueが確定するから合理的");
        System.out.println("a ^ bは aとbの値が異なるときにtrue、そうでなければfalse");
        System.out.println("!a は aの値がtrueのときにfalse、falseのときにtrue");

        //インクリメントと論理演算子についてここまでの知識で練習（頭の整理）
        int e = 10; int f = 10; int g = 10; int h = 10;
        System.out.println("int e = 10; int f = 10; int g = 10; int h = 10");
        System.out.println("boolean result = e++ > 10 & ++f > 10");
        System.out.println("問1 : 上記のresultの値は何でしょうか。");
        System.out.println("問2 : 変数eとfの値はそれぞれ何でしょうか。");

        System.out.println("boolean result2 = g++ > 10 && ++h > 10");
        System.out.println("問1 : 上記のresult2の値は何でしょうか。");
        System.out.println("問2 : 変数gとhの値はそれぞれ何でしょうか。なぜそうなるか。");
    }
}