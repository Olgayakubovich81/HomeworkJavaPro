package Task1;

public class DataUtil {

    public static double avg(int a, int b) {
        return (a + b) / 2.0;
    }

    public static double avg(double a, double b) {
        return (a + b) / 2.0;
    }

    public static double avg(int a, double b) {
        return (a + b) / 2.0;
    }

    public static double avg(double a, int b) {
        return (a + b) / 2.0;
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    public static double max(int a, double b) {
        return Math.max(a, b);
    }

    public static double max(double a, int b) {
        return Math.max(a, b);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static double min(double a, double b) {
        return Math.min(a, b);
    }

    public static double min(int a, double b) {
        return Math.min(a, b);
    }

    public static double min(double a, int b) {
        return Math.min(a, b);
    }

    public static int avg(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double avg(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double min(double[] array) {
        double min = array[0];
        for (double num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
