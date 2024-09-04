import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculate {

    static ListHeader list;
    public static void main(String[] args) {

        loaddata();
        System.out.println("Sorted customer details according to Total Account Balance\n");
        QuickSort sortedlist = new QuickSort();
        sortedlist.quick(list,0,list.maxSize-1);
        list.traverselList();

        displayCustomerAbove(100000);

    }

    private static void displayCustomerAbove(int above) {
        System.out.println("Customers who have more than 1 000 000 in their account\n");
        System.out.printf("%-20s %-20s %-20s %20s %20s %20s%n","Acc No","Customer Name","Acc Type","Acc Balance","Interest","Total Balance");
        for (int i = 0; i < list.listSize(); i++) {
            if (list.listEntry[i].accBalance > above){
                list.retriveList(i);
                System.out.printf("%-20s %-20s %-20s %20s %20s %20s%n",list.listEntry[i].accNumber,list.listEntry[i].cusName,list.listEntry[i].accType,list.listEntry[i].accBalance,list.listEntry[i].interest,list.listEntry[i].totalBalance);
            }
        }
    }



    private static void loaddata() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the No of Customers: ");
        int no = scan.nextInt();

        list = new ListHeader(no);



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
