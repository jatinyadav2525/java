public class Test2 {
    public static void main(String[] args) {
        int[] integers = {1, 2, 3};
        double[] decimals = new double[integers.length];

        for (int i = 0; i < integers.length; i++) {
            decimals[i] = integers[i];
        }

        System.out.println(decimals[0]);
    }
}
