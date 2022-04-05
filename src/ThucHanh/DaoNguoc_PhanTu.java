package ThucHanh;

import java.util.Scanner;

public class DaoNguoc_PhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử mảng : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println("Phần tử thứ " + i + " trong mảng : " + arr[i]);
        }
        for (int j = 0; j < arr.length / 2; j++) {
            int a = arr[j];
            arr[j] = arr[n - 1 - j];
            arr[n - 1 - j] = a;
        }
        System.out.println("Mảng đảo ngược là : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Phần tử thứ " + j + " trong mảng : " + arr[j]);
        }
    }

//    public int[] HamDaoNguoc(int[] arr,int i) {
//        for ( i = 0; i < arr.length/2; i++) {
//            int a = arr[i];
//            arr[i] = arr[arr.length - 1 -i];
//            arr[arr.length - 1 -i] = a;
//        }
//        return arr;
//    }
}
