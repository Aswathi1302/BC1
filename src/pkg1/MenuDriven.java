package pkg1;
import java.util.Scanner;
public class MenuDriven {
    public static void main(String args[])
    {
        int choice;
        int total=0;
        spgm fooditems =new  spgm(2,2,3);

        while(true) {
            System.out.println("Select an option");
            System.out.println("1. tea"+"price=" +fooditems.getTea());
            System.out.println("2. tea"+"price=" +fooditems.getCoffe());
            System.out.println("2. tea"+"price=" +fooditems.getVada());
            System.out.println("3. exit");

            Scanner scanner=new Scanner(System.in);
            System.out.println("enter a choice");
            choice = scanner.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("how many quantity");
                    int a = scanner.nextInt();
                    total = (10 * a) + total;
                    break;
                case 2:
                    System.out.println("how many quantity");
                    int b = scanner.nextInt();
                    total = (10 * b) + total;
                    break;
                case 3:
                    System.out.println("how many quantity");
                    int c = scanner.nextInt();
                    break;
                case 5:
                    System.exit(0);


            }

        }
    }
}
