package BaiTap;

import java.util.Scanner;

public class Find_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng : ");
        int SIZE = sc.nextInt();
        int[] arr = new int[SIZE];
        System.out.println("Mảng là : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử thứ " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Min là : " + timMin(arr));
    }

    static int timMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
