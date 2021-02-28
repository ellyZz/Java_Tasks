public class Task6 {
    public static boolean isDistinct(int num) {
        String s = String.valueOf(num);
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }

    public static void showFirstDistinctNumber(int[] array) {
        for (int element : array) {
            if (isDistinct(element)) {
                System.out.println(element);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {22, 44, 55, 2727, 272727, 123, 456};
        showFirstDistinctNumber(arr);
    }
}
