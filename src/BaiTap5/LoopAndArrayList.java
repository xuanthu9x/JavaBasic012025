package BaiTap5;

import java.util.ArrayList;

public class LoopAndArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> listSoChan = new ArrayList<Integer>();
    // check and add the number % 2 = 0 to arraylist
        for(int i = 0; i<= 50; i ++){
            if(i%2 == 0){
                listSoChan.add(i);
            }
        }
        // in gia tri trong arraylist
        for(int item : listSoChan)
        {
            System.out.println(item);
        }
        // get arraylist size
        System.out.println("Số lượng giá trị chia hết cho 2 trong khoảng 0 tới 50 là: " + listSoChan.size());
    }
}
