class Solution {
    public String getSmallestString(String s) {
         char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if ((arr[i] % 2 == arr[i + 1] % 2) && arr[i] > arr[i + 1]) {
                // If both digits have the same parity and a swap makes it smaller
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                break;
            }
        }

        return new String(arr);
    }
}