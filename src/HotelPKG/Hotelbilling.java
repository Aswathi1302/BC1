package HotelPKG;

import java.util.Scanner;

public class Hotelbilling {
    static int total=0;
    public static void main(String[] args) {

        int v1;

        Scanner s=new Scanner(System.in);
        while (true) {
            System.out.println("enter your  choice");
            System.out.println("1.Tea 10$");
            System.out.println("2.cofee 15$");
            System.out.println("3.biriyani 200$");
            System.out.println("4.juice 45$");
            System.out.println("5.shake 75$");
            System.out.println("6.BILL");
            System.out.println("7.exit");
            v1=s.nextInt();

            switch (v1) {
                case 1:
                    System.out.println("how many quantity");
                    int a = s.nextInt();
                    total = (10 * a) + total;
                    break;
                case 2:
                    System.out.println("how many quantity");
                    int b = s.nextInt();
                    total = (15 * b) + total;
                    break;
                case 3:
                    System.out.println("how many quantity");
                    int c = s.nextInt();
                    total = (200 * c) + total;
                    break;
                case 4:
                    System.out.println("how many quantity");
                    int d = s.nextInt();
                    total = (45 * d) + total;
                    break;
                case 5:
                    System.out.println("how many quantity");
                    int e = s.nextInt();
                    total = (75 * e) + total;
                    break;
                case 6:System.out.println("total bill="+total);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input");
            }
        }

    }
}
