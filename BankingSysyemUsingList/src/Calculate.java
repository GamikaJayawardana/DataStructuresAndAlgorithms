import java.util.Scanner;

public class Calculate {




    public static void main(String[] args) {

        loaddata();

    }

    private static void loaddata() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the No of Customers: ");
        int no = scan.nextInt();

        ListHeader list = new ListHeader(no);

        System.out.println("Enter Customer Details");
        System.out.println("__________________________\n");

        for (int i = 0; i < no; i++) {

            System.out.println("Customer " + (i+1));

            System.out.println("Acc NO: ");
            int accountNumber = scan.nextInt();
            scan.nextLine();

            System.out.println("Customer Name: ");
            String customerName = scan.nextLine();

            System.out.println("Account Type: ");
            String accountType = scan.nextLine();

            System.out.println("Account Balance: ");
            Double accountBalance = scan.nextDouble();

            System.out.println("__________________________\n");

            Bank bank = new Bank(accountNumber,customerName,accountType,accountBalance);
            list.insertLast(bank);

        }

        list.traverselList();

    }
}
