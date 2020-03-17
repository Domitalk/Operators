package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3  in the background this is actually two operators + and =
        // int result = 3; is one operator
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        // 3

        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        // 2
        System.out.println("previousResult = " + previousResult);
        // 3

        // like primitive datatype in JS, variables in Java just copy the value and it DOESN'T refer to it

        result = result * 10;
        System.out.println("2 * 10  = " + result);
        // 20

        result = result / 5;
        System.out.println("20 / 5 = " + result);
        // 4

        result = result % 3;
        System.out.println("4 / 3 what is remainder " + result);
        // 1

        result++;
        // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--;
        // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        result += 2;
        // just like JavaScript...
        System.out.println("1 + 2 = " + result);

        result *= 10;
        // 3 * 10 = 30
        System.out.println("3 + 10 = " + result);

        // += -= *= /= all work in Java

        // just testing to see if modelo work s

        result %= 4;
        System.out.println("modelo 2 " + result);

        // yay it works
    }
}
