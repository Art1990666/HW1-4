import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        transient1();
        transient2();
        transient3();
        transient4();

    }

    public static void transient1() {
        System.out.println("HW-1!");
        int[] weight = new int[3];
        for (int i = 0; i <= 2; i++) {
            weight[i] = i + 1;
            System.out.print(weight[i] + ", ");
        }
        double[] weights = {1.57, 7.654, 9.986};
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i] + ", ");
        }
        int[] number = new int[2];
        for (int i = 0; i <= 1; i++) {
            number[i] = i + 1;
            System.out.print(number[i] + ", ");
        }
    }

    public static void transient2() {
        System.out.println("HW-2!");
        int[] weight = new int[3];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = i + 1;
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] weights = {1.57, 7.654, 9.986};
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i != weights.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void transient3() {
        System.out.println("HW-3!");
        int[] weight = new int[3];
        for (int i = weight.length - 1; i >= 0; i--) {
            weight[i] = i + 1;
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] weighs = {1.57, 7.654, 9.986};
        for (int i = weighs.length - 1; i >= 0; i--) {
            System.out.print(weighs[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void transient4() {
        System.out.println("HW-4!");
        int[] weight = {1, 2, 3};
        for (int i = 0; i <  weight.length; i++) {
            if (weight[i] % 2 == 1) {
                weight[i]++;
                System.out.println(Arrays.toString(weight));
            }
        }
    }
}

