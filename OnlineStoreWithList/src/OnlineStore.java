import java.util.Scanner;
public class OnlineStore {

    static ProductList list;

    public static void main(String[] args) {
        loaddata();
        list.traverse();

    }

    private static void loaddata() {
        System.out.println("How many product do you want to add:");

        Scanner scan = new Scanner(System.in);
        int  noOfProduct = scan.nextInt();



        list = new ProductList(noOfProduct);

        for (int i = 0; i < noOfProduct; i++) {
            scan.nextLine();
            System.out.println("Product " + (i+1));

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

            Product product = new Product(pID,pName,ctgory,uPrize,qSold);
            list.insertLast(product);


        }


    }
}
