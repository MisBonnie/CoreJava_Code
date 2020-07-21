package com.zzxx.arr;

public class Demo01 {
    public static void main(String[] args) {
        // int 类型的数组arr
        int[] arr = new int[3];
        // arr[0] -- int类型
        /*
            1.定义一个 int[] 类型的数组a, 数组长度是4
              a中第一个元素有5个元素
              a中第二个元素有3个元素
              a中第三个元素有6个元素, 其中第3个是 2
            2.定义一个 int[] 类型的数组b, 数组长度是3
              b中的每一个元素, 都有4个元素
              b中的第2个元素的第4个元素, 是 5
              b中的每一个元素都是5
         */
        // 二维数组: 数组中存数组
        int[][] b = new int[3][4];
        b[1][3] = 5;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++){
                b[i][j] = 5;
            }
        }
        /*for(int i = 0; i < b.length; i++) {
            b[i] = new int[4];
        }*/

        int[][] a = new int[4][];
        // a[0] --> int[] 类型
        a[0] = new int[5];
        a[1] = new int[3];
        a[2] = new int[6];
        // a[2] 表示一个int数组
        // a[2][2] 表示一个int数
        a[2][2] = 2;
    }
}
