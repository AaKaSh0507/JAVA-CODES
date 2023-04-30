public class NumtoText {
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", 
    "eight", "nine" };

    public static void Printdigits(int number) {
        if (number == 0) {
            return;
        }
        int lastdigit = number % 10;
        Printdigits(number / 10);
        System.out.print(digits[lastdigit] + " ");
    }

    public static void main(String args[]) {
        Printdigits(1234);
        System.out.println();
    }
}