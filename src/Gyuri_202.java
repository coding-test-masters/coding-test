import  java.util.*;

public class Gyuri_202 {
    public static boolean isHappy(int n) {
        int cnt = 0;

        while (n != 1) {
            int cal = 0;

            String s = "" + n;
            char[] arr = s.toCharArray();

            for (char c : arr) {
                cal += (c - '0') * (c - '0');
            }

            n = cal;
            cnt++;

            if (cnt >= 10) {
                return false;
            }
        }

        return n == 1;
    }

    public boolean isHappy2(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1) {
            String s = n + "";
            char[] arr = s.toCharArray();
            int cal = 0;

            for (char c : arr) {
                cal += (c - '0') * (c - '0');
            }

            if (set.contains(cal)) {
                return false;
            }

            set.add(cal);

            n = cal;
        }

        return true;
    }

    public static boolean isHappy3(int n) {
        Set<Integer> set = new HashSet<>();

        while (!set.contains(n)) {
            set.add(n);
            n = getNextNumber(n);

            if (n == 1) {
                return true;
            }
        }

        return false;
    }

    private static int getNextNumber(int n) {
        int output = 0;

        while (n > 0) {
            int digit = n % 10;
            output += digit * digit;
            n = n / 10;
        }

        return output;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy3(n));
    }
}
