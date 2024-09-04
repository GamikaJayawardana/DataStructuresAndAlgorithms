import java.util.Scanner;
public class OnlineStore {

    static ProductList list;

    public static void main(String[] args) {
        loaddata();
        list.traverse();
//        list.selectionSort();
//        list.quickSort(0,list.listSize()-1);
        list.insertionSort();
        System.out.println();
        System.out.println("Sorted sales details according to the sales amount");
        list.traverse();

        Product pro = new Product("P004","Frock","clothing",4520,49);
        list.replaceList(7,pro);
        System.out.println("replace");
        list.traverse();

        System.out.println("\nproducts whose total sale amount is greater than Rs.40,000");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Product ID", "Product Name", "Category", "Unite Price", "Quantity Sold", "Total Sales Amount");
        for (int i = 0; i < list.listSize(); i++) {
            if (list.listEntry[i].totalAmount > 400000) {
                System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", list.listEntry[i].productTD, list.listEntry[i].productName, list.listEntry[i].category, list.listEntry[i].unitPrice, list.listEntry[i].quantitySold, list.listEntry[i].totalAmount);
            }
        }

        double sales = 0;
        for (int i = 0; i < list.listSize(); i++) {
            if (list.listEntry[i].category.equals("Electronics")) {
               sales = sales + list.listEntry[i].totalAmount;
            }
        }
        System.out.println("total electronics sales:" + sales);

        double salesT = 0;
        for (int i = 0; i < list.listSize(); i++) {
                salesT = salesT + list.listEntry[i].totalAmount;
        }


        System.out.println("total  sales:" + salesT);
        double percentage = sales*100/salesT;
        System.out.println("Percentage of electronics:" + percentage);

    }

    private static void loaddata() {
        System.out.println("How many product do you want to add:");

        Scanner scan = new Scanner(System.in);
        int noOfProduct = scan.nextInt();

        list = new ProductList(noOfProduct);

        for (int i = 0; i < noOfProduct; i++) {
            scan.nextLine();
            System.out.println("Product " + ( i + 1 ));

            System.out.println("Product ID:");
            String pID = scan.nextLine();

            System.out.println("Product Name:");
            String pName = scan.nextLine();

            System.out.println("Category:");
            String ctgory = scan.nextLine();

            System.out.println("Unit Price:");
            double uPrize = scan.nextDouble();

            System.out.println("Quantity Sold:");
            int qSold = scan.nextInt();

            Product product = new Product(pID, pName, ctgory, uPrize, qSold);
            list.insertLast(product);
        }
    }
}

