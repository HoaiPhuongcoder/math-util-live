public class Main {
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual: " + result);
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));
        //THEM CODE SAU LAN DAU TIEN LAM CHUYEN AY- CODE LEN SEVER 5:35 10/11/2023
        System.out.println("3! = 6; actual: " + MathUtil.getFactorial(3));
        System.out.println("1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(0));
    }
}