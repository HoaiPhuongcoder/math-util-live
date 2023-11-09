public class Main {
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual: " + result);
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));
    }
}