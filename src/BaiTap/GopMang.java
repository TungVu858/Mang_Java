package BaiTap;

public class GopMang {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int[] arr1 = {3, 5, 10};
        int[] arrNew = new int[10];
        for (int i =0;i<arr.length;i++){
            arrNew[i] = arr[i];
            System.out.println(arrNew[i]);
        }
        for (int i =0 ;i<arr1.length;i++){
            arrNew[i] = arr1[i];
            System.out.println(arrNew[i]);
        }
    }
}
