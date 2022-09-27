package Calc;
import java.util.Scanner;
public class calculator {
    public static void main(String args[])
    {
        int choice;
        int ans;
        while(true) {
            System.out.println("Select an option");
            System.out.println("1. addition");
            System.out.println("2. subtraction");
            System.out.println("3. multiplication");
            System.out.println("4. divsion");
            System.out.println("5. exit");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            System.out.println("enter 2 number");
            int a = input.nextInt();
            int b = input.nextInt();

            switch (choice) {
                case 1:
                    ans = a + b;
                    System.out.println("result=" + ans);
                    break;
                case 2:
                    ans = a - b;
                    System.out.println("result=" + ans);
                    break;
                case 3:
                    ans = a * b;
                    System.out.println("result=" + ans);
                    break;
                case 4:
                    try {
                        System.out.println("division");
                        ans = a / b;
                        System.out.println("result=" + ans);
                    }catch(Exception e)
                    {
                        System.out.println("division by zero is not possible");
                    }
                    break;

                case 5:
                    System.exit(0);


            }
        }


    }
}
