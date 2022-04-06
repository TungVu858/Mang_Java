package BaiTap;

import java.util.Scanner;

public class Them_PhanTu {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Nhập số phần từ của mảng : ");
        int n = num.nextInt();
        int[] arr = new int[n];
        System.out.println("Mảng là : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử thứ " + i);
            arr[i] = num.nextInt();
        }
        System.out.println("Nhập số cần thêm : ");
        int X = num.nextInt();
        System.out.println("Vị trí thêm vào : ");
        int index = num.nextInt();
        if (index <= -1 && index >= arr.length - 1) {
            System.out.println("Không thêm được phần tử vào mảng ");
        }
//        for (int i =0;i<index;i++){
//            System.out.println(arr[i]);
//        }
        arr[index] = X;
        for (int i = 0;i<index;i++){

        }
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
            System.out.println(arr[i]);
        }
    }
}
