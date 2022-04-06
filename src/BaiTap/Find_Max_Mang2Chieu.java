package BaiTap;

import java.util.Scanner;

public class Find_Max_Mang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử cột của mảng : ");
        int n = sc.nextInt();
        System.out.println("Nhập vào số phần tử hàng của mảng :  ");
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for (int i =0;i<arr.length;i++){
            for (int j =0 ;j <arr[i].length;j++){
                System.out.println("Phần tử thứ " + j + " của hàng " + i);
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i =0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max là : "+max);
    }
}
