package BaiTap2;

public class Calculator {
    public static int TongHaiSoNguyen (int a, int b)
    {
        return a+b;
    }
    public static double TichHaiSoThuc (double st1, double st2)
    {
        return st1*st2;
    }
    public static void main(String[] args) {
        int SoNguyen1 = 5;
        int SoNguyen2 = 10;
        System.out.println(TongHaiSoNguyen(SoNguyen1, SoNguyen2));


        double SoThuc1 = 2.34;
        double SoThuc2 = 3.15;
        System.out.println(TichHaiSoThuc(SoThuc1, SoThuc2));
    }
}
