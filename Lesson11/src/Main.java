
public class Main {
    public static void main(String[] args) {
//        Ex1(5);

//        Ex2(5);

//        int result = Ex3(2, 4);
//        System.out.println(result);

//        int result = Ex4(252532);
//        System.out.println(result);

//        int result = Ex5(252532);
//        System.out.println(result);

//        int result = Ex6(123456);
//        System.out.println(result);

//        Ex7(300, 2);

    }

    public static void Ex1(int x)
    {
        if (x >= 1)
        {
            System.out.println(x);
            Ex1(x - 1);
        }
    }
    public static void Ex2(int x)
    {
        if (x >= 1)
        {
            Ex1(x - 1);
            System.out.println(x);
        }
    }

    public static int Ex3(int x, int n)
    {
        if (n == 0)
        {
            return 1;
        }

        return x * Ex3(x, n - 1);
    }

    public static int Ex4(int x)
    {
        if (x < 10)
        {
            return 1;
        }

        return 1 + Ex4(x / 10);
    }

    public static int Ex5(int x)
    {
        if (x < 10) {
            if (x % 2 == 0)
                return 1;
            else
                return 0;
        }

        if (x % 2 == 0) {
            return 1 + Ex5(x / 10);
        }
        else {
            return Ex5(x / 10);
        }
    }

    public static int Ex6(int number)
    {
        if (number < 10) {
            return number;
        }


        int lastDigit = number % 10;
        int maxDigitInRemaining = Ex6(number / 10);

        return Math.max(lastDigit, maxDigitInRemaining);
    }

    public static void Ex7(int number, int x) {
        if (number < 2) {
            return;
        }

        if (x <= number) {
            if (number % x == 0) {
                System.out.println(x);
                Ex7(number / x, x);
            } else {
                Ex7(number, x + 1);
            }
        }
    }
}