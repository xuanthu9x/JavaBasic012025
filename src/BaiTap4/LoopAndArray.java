package BaiTap4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class LoopAndArray {
    public static void main(String[] args) {
        int MangSoChan[] = new int[26];
        int index = 0;

        // lấy cac số từ 0 đến 50 có thể chia hết cho 2 và thêm vào mảng
        for (int i = 0; i <=50; i++){
            if(i%2==0)
            {
                MangSoChan[index]= i;
                index++;
            }
        }

        // in ra các giá trị trong mảng
        for ( int i = 0; i<MangSoChan.length;i++)
        {
            System.out.println(MangSoChan[i]);
        }
    }
}
