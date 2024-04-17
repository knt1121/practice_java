public class Chapter3_2 {
    public static void main (String[] args) {
        System.out.println("Chapter3_2スタート！");
        //文字列の扱いについて(StringクラスとStringBuilderクラス)

        //まずはStringクラス（再代入はできるが文字列を書き換えることはできない）
        String character = "甲乙丙丁戊";
        System.out.println("charAt() :" + character.charAt(2));//引数にある文字を返す
        System.out.println("equals() :" + character.equals("甲乙丙丁戊"));//引数の文字列と同じか比較し、boolean値で返す
        System.out.println("indexOf() :" + character.indexOf('乙'));//引数の文字が最初に出現する位置を返す
        System.out.println("length() :" + character.length());//文字の数を返す
        System.out.println("replace() :" + character.replace('甲','A'));//第1引数の文字を第2引数に置換し、結果の文字列を返す
        System.out.println("substring() :" + character.substring(2));//引数で指定した位置から最後までの部分文字列を返す

        //StringBuilderクラス（変数に格納した文字列を変更することが可能）
        StringBuilder sb = new StringBuilder("Ab Cdefg");
            System.out.println("append() :" + sb.append("XYZ"));//引数で指定された文字列を現在の文字列に追加する(append:追加する)
        StringBuilder sb2 = new StringBuilder("Ab Cdefg");
            System.out.println("insert() :" + sb2.insert(2,"ZZ"));//第2引数で指定された文字列を第1引数で指定された位置にある文字の前に挿入する
        StringBuilder sb3 = new StringBuilder("Ab Cdefg");
            System.out.println("delete() :" + sb3.delete(0,5));//第1引数から第2引数の位置の1つ前の位置にある文字を削除
        StringBuilder sb4 = new StringBuilder("Ab Cdefg");
            System.out.println("replace() :" + sb4.replace(3,sb4.length(),"YYY"));//第1引数から第2引数の位置の1つ前までの位置にある文字を第3引数の文字列に置換する
        StringBuilder sb5 = new StringBuilder("Ab Cdefg");
            System.out.println("substring() :" + sb5.substring(5));//引数で指定された位置から最後までの部分文字列を返す
        

        //ここまでの知識で少し遊び
        StringBuilder momotaro = new StringBuilder("むかし、むかし、あるところに、おじいさんとおばあさんがありました。まいにち、おじいさんは山へしば刈かりに、おばあさんは川へ洗濯せんたくに行きました。");
        System.out.println(momotaro);
        //[むかし、むかし、あるところに]の部分を変えてみますか
        momotaro.replace(0, 14, "最近、近所にね");
        System.out.println(momotaro);
        //文章を少し追加してみますか
        momotaro.insert(8, "全然知らない");
        System.out.println(momotaro);
        //末尾に物語の続きを少し書いてみましょうか
        momotaro.append("川に桃が流れてきて、割ったら中から桃太郎が！いざ鬼退治へ！");
        System.out.println(momotaro);
        //おじいさんがしば刈りに行った事実をなくしましょう。サボり。
        momotaro.delete(38, 53);
        System.out.println(momotaro);
    }
}