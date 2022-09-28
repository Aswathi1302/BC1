package pkghotel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Billingsystem {

    static int total = 0;
    String customerName;

    public static void main(String[] args) {
        ArrayList<String> itemName=new ArrayList<>();
        ArrayList<Integer> quantity=new ArrayList<>();
        ArrayList<Integer> price=new ArrayList<>();

        int v1;
        fooditems fItems = new fooditems(10, 20, 130, 23, 45);
        fooditems dy = new fooditems(15, 20, 130, 46, 45);
        HashMap<String,String> map=new HashMap<String,String>();
        ArrayList<String> transactionList=new ArrayList<>();


        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("choose you option");
            System.out.println("Normal");
            System.out.println("dyining");
            System.out.println("display billing");

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
                            int qut = s.nextInt();
                            itemName.add("Tea");
                            quantity.add(qut);
                            price.add(qut*10);
                            break;
                        case 2:
                            System.out.println("how many quantity");
                            int qut1 = s.nextInt();
                            itemName.add("cofee");
                            quantity.add(qut1);
                            price.add(qut1*20);
                            break;
                        case 3:
                            System.out.println("how many quantity");
                            int qut2 = s.nextInt();
                            itemName.add("biriyani");
                            quantity.add(qut2);
                            price.add(qut2*45);
                            break;
                        case 4:
                            System.out.println("how many quantity");
                            int qut3 = s.nextInt();
                            itemName.add("juice");
                            quantity.add(qut3);
                            price.add(qut3*23);
                            break;
                        case 5:
                            System.out.println("how many quantity");
                            int qut4 = s.nextInt();
                            itemName.add("shake");
                            quantity.add(qut4);
                            price.add(qut4*45);
                            break;
                        case 6:
                            System.out.println("**********************************");
                            int sum=0;
                            for(int i=0;i<=itemName.size()-1;i++)
                            {

                                System.out.println("1.ItemName==>" +itemName.get(i));
                                System.out.println("2.quantity==>"+quantity.get(i));
                                System.out.println("3.Price==>"+price.get(i));
                                sum +=price.get(i);
                            }
                            System.out.println("enter your name");
                            String customerName =s.next();
                            map.put("customer name",customerName);
                            map.put("amount", String.valueOf(sum));
                            map.put("mode","Normal");

                            transactionList.add(String.valueOf(map));
                            System.out.println(customerName + "  " + "Your bill is ready");
                            System.out.println("total bill=" + sum);


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
                            int qut = s.nextInt();
                            itemName.add("Tea");
                            quantity.add(qut);
                            price.add(qut*10);
                            break;
                        case 2:
                            System.out.println("how many quantity");
                            int qut1 = s.nextInt();
                            itemName.add("cofee");
                            quantity.add(qut1);
                            price.add(qut1*20);
                            break;
                        case 3:
                            System.out.println("how many quantity");
                            int qut2 = s.nextInt();
                            itemName.add("biriyani");
                            quantity.add(qut2);
                            price.add(qut2*45);
                            break;
                        case 4:
                            System.out.println("how many quantity");
                            int qut3 = s.nextInt();
                            itemName.add("juice");
                            quantity.add(qut3);
                            price.add(qut3*23);
                            break;
                        case 5:
                            System.out.println("how many quantity");
                            int qut4 = s.nextInt();
                            itemName.add("shake");
                            quantity.add(qut4);
                            price.add(qut4*45);
                            break;
                        case 6:
                            System.out.println("**********************************");
                            int sum=0;
                            for(int i=0;i<=itemName.size()-1;i++)
                            {
                                System.out.println("1.ItemName==>" +itemName.get(i));
                                System.out.println("2.quantity==>"+quantity.get(i));
                                System.out.println("3.Price==>"+price.get(i));
                                sum +=price.get(i);
                            }
                            System.out.println("enter your name");
                            String customerName =s.next();
                            map.put("customer name",customerName);
                            map.put("amount", String.valueOf(sum));
                            map.put("mode","dyining");

                            transactionList.add(String.valueOf(map));
                            System.out.println("**********************************");
                            System.out.println(customerName + "  " + "Your bill is ready");
                            System.out.println("total bill=" + sum);
                            break;
                        case 7:
                            System.exit(0);
                            break;
                    }
                case 3:
                    System.out.println(transactionList);
            }
        }

    }
}
