package factorials;


public class Runner {
    public static void main(String[] args) {

//        factorial(5); //Parameter is the number to find the factorial of
        reverseFactorial(150); //Parameter is the number to find the reverse factorial of
    }

    public static void factorial(int initialNumber) { //Factorial
        int factorial = 1;

        for (int i = 1; i <= initialNumber; i++) {
            factorial = factorial * i;
            System.out.println(factorial);
        }
    }

    public static int reverseFactorial(int initialNumber) { //Reverse Factorial
        int reverseFactorial = initialNumber;
        int divider = 2;


        while (reverseFactorial % divider == 0) {
            reverseFactorial /= divider;
            divider++;
        }

        if (reverseFactorial == 1) {
            System.out.println(initialNumber + " = " + (divider - 1) + "!");
        } else {
            System.out.println(initialNumber + " NONE");
        }
        return (divider-1);
    }
}