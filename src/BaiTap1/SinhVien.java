package BaiTap1;

public class SinhVien {
    public static String ten = "";
    public static int tuoi = 0;
    public static String mssv = "";

    public static void HienThiThongTinSV(String ten, int tuoi, String mssv){
        System.out.println("Ho ten sv: " + ten);
        System.out.println("Tuoi " + tuoi);
        System.out.println("mssv " + mssv);
        System.out.println("khoa " + ThongTin.khoa);
        System.out.println("truong " + ThongTin.truong);
    }

    public static void main(String[] args) {

        ten= "Nguyen Van A";
        tuoi= 15;
        mssv= "0123456789";

        HienThiThongTinSV(ten, tuoi, mssv);
    }
}
