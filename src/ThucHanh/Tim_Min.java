package ThucHanh;

public class Tim_Min {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        System.out.println("Số bé nhất trong mảng là : " + timMin(arr));
    }

    static int timMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
