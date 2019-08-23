package kata;

public class TestBitCounting {
    public static void main(String[] args) {
        int t=1234;
        int rs=BitCounting.countBits(t);
        int rs1=BitCounting.countBits2(t);
        System.out.println(rs);
        System.out.println(rs1);
    }
}
