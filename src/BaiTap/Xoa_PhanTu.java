package BaiTap;

import java.util.Scanner;

public class Xoa_PhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng : ");
        int N = sc.nextInt();
        int [] arr = new int[N];
        for (int i =0;i<arr.length;i++){
            System.out.println("Nhập vào phần từ thứ " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập số cần xóa : ");
        int X = sc.nextInt();
        int viTri = timViTri(arr, X);
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < viTri; i++) {
            newArr[i] = arr[i];
        }
        for (int i = viTri; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        taoMang(newArr);
    }

    static int timViTri(int[] arr, int a) {
        int viTri = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                viTri = i;
            }
        }
        return viTri;
    }

    static void taoMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
