public class Chapter2 {
    public static void main(String[] args) {
        //1次元配列の宣言(1次元配列とは、1つの添え字で管理された配列のこと)
        //データ型[] 配列名;
        //配列名 = new データ型 [要素数];
        int[] student;
        student = new int[40];
        //配列の初期化（領域の確保と値（初期値）の代入までを行う）
        //データ型[] 配列名 = {初期値1、初期値2、初期値3、......}
        String[] size = {"S","M","L"};
        System.out.println(size[1]);

        //多次元配列
        int[][] array;
        array = new int[3][4];
        array[0][0] = 100;
        array[0][3] = 300;
        array[1][2] = 120;
        System.out.println("array[0][0]の値は" + array[0][0]);
        System.out.println("array[0][3]の値は" + array[0][3]);
        System.out.println("array[1][2]の値は" + array[1][2]);
        System.out.println("arrayのlengthは" + array.length);
        System.out.println("array[0]のlengthは" + array[0].length);
        //多次元配列の初期化
        int[][] array2 = {
            {10, 20, 30, 40},
            {100,200,300}, 
        };
        System.out.println("arrayのlengthは" + array2.length);
        System.out.println("array[0]のlengthは" + array2[0].length);

        //要素素がそろっていない配列を要素とする配列の作成
        int[][] array3 = new int[3][];
        array3[0] = new int[2];
        array3[1] = new int[5];
        array3[2] = new int[3];
        System.out.println("array3のlengthは" + array3.length);
        System.out.println("array3[0]のlengthは" + array3[0].length);
        System.out.println("array3[1]のlengthは" + array3[1].length);
        System.out.println("array3[2]のlengthは" + array3[2].length);
        //要素数がそろっていない場合の配列の初期化
        /*int[][] array3 = {
            {10, 20},
            {50, 60, 70, 80, 90},
            {100, 120, 150},
        };*/
        array3[0][0] = 10;
        array3[1][2] = 70;
        array3[2][2] = 150;
        System.out.println("array3[0][0]の値は" + array3[0][0]);
        System.out.println("array3[1][2]の値は" + array3[1][2]);
        System.out.println("array3[2][2]の値は" + array3[2][2]);
    }
}