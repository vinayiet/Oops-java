public class ArgumentAndParameter {

    // the variables which are declared in the function's signature
    // it represents the type and name of the values that will be passes into the
    // function
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {

        // arguments are the actual values which are passed into the function when the
        // function is called
        int Sum = sum(2, 4);
        System.out.println(Sum);
    }
}
