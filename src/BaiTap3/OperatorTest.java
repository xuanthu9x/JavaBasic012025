package BaiTap3;

public class OperatorTest {
    public static int x,y,z;
    public static final int number = 100;

    public static void compareValue(int x, int y, int z)
    {
        // so sánh x và y
        if(x>y)
        {
            System.out.println("x lớn hơn y");
        } else if (x<y) {
            System.out.println("x nhỏ hơn y");
        }else {
            System.out.println("x bằng y");
        }
        // so sánh x và z
        if(x >= z)
        {
            System.out.println("x lớn hơn hoặc bằng z");
        }else{
            System.out.println("x nhỏ hơn z");
        }
        // so sánh y với number
        if(x > number)
        {
            System.out.println("x lớn hơn " + number);
        } else if (x < number) {
            System.out.println("x nhỏ hơn " + number);
        }else {
            System.out.println("x bằng " + number);
        }
    }
    // Phương thức kiểm tra toán tử logic
    public static void logicOperations(int x, int y, int z){
        if(x> number && y > number && z > number) {
            System.out.println("x, y và z lớn hơn " + number);
        }else{
            System.out.println("x hoặc y hoặc z không lớn hơn " + number);
        }

    }
    public static void main(String[] args) {
        x = 5;
        y = 99;
        z = 101;
        System.out.println( "x = " + x);
        System.out.println( "y = " + y);
        System.out.println( "z = " + z);
        compareValue(x,y,z);
        logicOperations(x,y,z);
    }

}
