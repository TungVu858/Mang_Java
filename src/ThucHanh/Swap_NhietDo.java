package ThucHanh;

import java.util.Scanner;

public class Swap_NhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("1. Fahrenheit to Celsius");
//            System.out.println("2. Celsius to Fahrenheit");
//            System.out.println("0. Exit");
//            System.out.println("Nhập lựa chon : ");
//            chon = sc.nextInt();
//            switch (chon) {
//                case 1:
//                    System.out.println("Nhập độ F : ");
//                    f = sc.nextDouble();
//                    System.out.println("Độ F qua độ C là : " + ((5.0 / 9) * (f - 32)));
//                    break;
//                case 2:
//                    System.out.println("Nhập độ C : ");
//                    c = sc.nextDouble();
//                    System.out.println("Độ C qua độ F là : " + ((9.0 / 5) * c + 32));
//                    break;
//                case 0:
//                    System.exit(0);
//            }
//        } while (true);
        while (true) {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chon : ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Nhập độ F : ");
                    double f = sc.nextDouble();
//                    System.out.println("Độ F qua độ C là : " + ((5.0 / 9) * (f - 32)));
                    System.out.println("Độ F qua độ C là : " + swapFtoC(f));
                    break;
                case 2:
                    System.out.println("Nhập độ C : ");
                    double c = sc.nextDouble();
//                    System.out.println("Độ C qua độ F là : " + ((9.0 / 5) * c + 32));
                    System.out.println("Độ C qua độ F là : " + swapCtoF(c));
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    static double swapCtoF(double c){
        double f = (9.0 / 5) * c + 32;
        return f;
    }
    static double swapFtoC(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}
