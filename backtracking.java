public class backtracking {
    public static void main(String[] args) {
        // int arr [] = new int [5];
        // changearr(arr, 1, 0);
        // for (int i = 0; i < arr.length; i++){
        // System.out.print(arr[i] + " ");
        // }

        String str = "abc";
        findsubset(str, "", 0);
    }

    public static void changearr(int arr[], int value, int index) {
        if (index == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        arr[index] = value; // forward recursion
        changearr(arr, value + 1, index + 1);
        arr[index] = arr[index] - 2; // backward recursion

    }

    public static void findsubset(String str, String ans, int i) {
        // Base Case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("Null");
            } else {
                System.out.print(ans);
            }
            System.out.println();
            return;
        }
        // Yes

        findsubset(str, ans + str.charAt(i), i + 1);

        // No

        findsubset(str, ans, i + 1);
    }
}