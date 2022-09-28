package pkg1;
import java.util.Scanner;
public class MenuDriven {
    public static void main(String args[])
    {
        int choice;
        while(true) {
            System.out.println("Select an option");
            System.out.println("1. add student");
            System.out.println("2. search student");
            System.out.println("3. delet student");
            System.out.println("4. search student");
            System.out.println("5. exit");

            Scanner scanner=new Scanner(System.in);
            System.out.println("enter a choice");
            choice = scanner.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("3. delet student");
                    break;
                case 2:
                    System.out.println("2.search student");
                    break;
                case 3:
                    System.out.println("3. delete student");
                    break;
                case 4:
                    System.out.println("4.search student");
                    break;
                case 5:
                    System.exit(0);


            }

        }
    }
}
