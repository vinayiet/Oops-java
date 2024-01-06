public class methodOverloading {
    // Overloading : methods which are having same name and have diffrent parameters

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String args[]) {
        System.out.println(sum(2, 3));
        System.out.println(sum(4, 5, 6));
        System.out.println(sum(7, 8, 9, 10));
    }
}
