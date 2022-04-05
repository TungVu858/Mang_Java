package ThucHanh;

import java.util.Scanner;

public class Tim_GTLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng : ");
        int a = sc.nextInt();
        int [] mang = new int[a];
        for (int i =0;i<mang.length;i++){
            System.out.println("Nhập vào phần tử thứ " + i);
            mang[i] = sc.nextInt();
        }
        inMang(mang);
        int max = mang[0];
        int viTri = 0;
        for (int i =1;i<mang.length;i++){
            if (mang[i] > max){
                max = mang[i];
                viTri = i;
            }
        }
        System.out.println("Phần từ lớn nhất trong mảng là : " + max + " vị trí : " + viTri);
    }
    static void inMang(int[] mang) {
        System.out.println("Mảng là: ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i]+"\t" + "\n");
        }
    }
}
