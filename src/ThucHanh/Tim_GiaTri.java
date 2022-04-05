package ThucHanh;

import java.util.Scanner;

public class Tim_GiaTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Hiển thị mảng : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println("Phần tử thứ " + i + " là : " + arr[i]);
        }
        System.out.println("Nhập số a cần tìm : ");
        int a = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                check = true;
                System.out.println(a + " có trong mảng, vị trí là : " + i);
            }
        }
        if (!check) {
            System.out.println(a + " không có trong mảng ");
        }
    }
}
