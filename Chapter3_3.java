public class Chapter3_3 {
    public static void main (String[] args) {
        System.out.println("Chapter3_3");
        //関係演算子による基本データ型の比較
        int n1 = 10;
        int n2 = 1_0;
        long n3 = 10L;
        byte n4 = 10;
        char n5 = 'a';
        float n6 = 10.0f;
        double n7 = 10.0;
        boolean n8 = true;

        System.out.println("n1 == n2 : " + ( n1 == n2 ));
        System.out.println("n1 == n3 : " + ( n1 == n3 ));
        System.out.println("n1 == n4 : " + ( n1 == n4 ));
        System.out.println("n5 == 'a' : " + ( n5 == 'a' ));
        System.out.println("n6 == n7 : " + ( n6 == n7 ));
        System.out.println("n8 == true : " + ( n8 == true ));

        //==演算子による参照型データの比較
        int[] a1 = {10}; int[] a2 = {10};
        System.out.println(" a1 == a2 : " + ( a1 == a2 ));
        //a1とa2は異なるデータを参照している。配列は参照型

        int[] a3 = {10}; int[] a4 = a3;
        System.out.println(" a3 == a4 : " + ( a3 == a4 ));
        //a3とa4は同じデータを参照している。a4の参照先はa3と同じ。
    }
}