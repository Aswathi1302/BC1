package pkghotel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Billingsystem {

    static int total = 0;

    public static void main(String[] args) {

        int v1;
        fooditems fItems = new fooditems(10, 20, 45, 23, 45);
        fooditems dy = new fooditems(10, 20, 23, 46, 45);
        HashMap<String,String> map=new HashMap<String,String>();
        ArrayList<HashMap> transactionList=new ArrayList<>();


        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("choose you option");
            System.out.println("Normal");
            System.out.println("dyining");

            v1 = s.nextInt();
            switch (v1) {
                case 1:
                    System.out.println("enter your  choice");
                    System.out.println("1.Tea " + "price=" + fItems.getTea());
                    System.out.println("2.cofee" + "price=" + fItems.getCoffe());
                    System.out.println("3.biriyani " + "price=" + fItems.getBiriyani());
                    System.out.println("4.juice " + "price=" + fItems.getJuice());
                    System.out.println("5.shake" + "price=" + fItems.getShake());
                    System.out.println("6.BILL");
                    System.out.println("7.exit");
                    System.out.println(" select your food item");
                    int ch = s.nextInt();
                    switch (ch) {
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
                        case 6:
                            System.out.println("total bill=" + total);
                            break;
                        case 7:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("invalid input");
                    }
                case 2:
                    System.out.println("enter your  choice");
                    System.out.println("1.Tea " + "price=" + dy.getTea());
                    System.out.println("2.cofee" + "price=" + dy.getCoffe());
                    System.out.println("3.biriyani " + "price=" + dy.getBiriyani());
                    System.out.println("4.juice " + "price=" + dy.getJuice());
                    System.out.println("5.shake" + "price=" + dy.getShake());
                    System.out.println("6.BILL");
                    System.out.println("7.exit");
                    System.out.println("select your food items");
                    int ch1 = s.nextInt();
                    switch (ch1) {
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
                        case 6:
                            System.out.println("total bill=" + total);
                            break;
                        case 7:
                            System.exit(0);
                            break;
                    }
            }
        }

    }
}
