public class ProductList {
    int position;
    int maxSize;
    Product[] listEntry;

    public ProductList(int size) {
        position = -1;
        maxSize = size;
        listEntry = new Product[size];
    }

    public boolean isListFull() {
        return (position == maxSize-1);
    }

    public boolean isListEmpty() {
        return (position == -1);
    }



    public void insertLast(Product p) {
        if (isListFull()) {
            System.out.println("List is Full");
        }
        else {
            position++;
            listEntry[position] = p;
        }
    }

    public int listSize() {
        return (position + 1);
    }

    public void traverse(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n","Product ID","Product Name","Category","Unite Price","Quantity Sold","Total Sales Amount");
        for (int i = 0; i < listSize(); i++) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n",listEntry[i].productTD,listEntry[i].productName,listEntry[i].category,listEntry[i].unitPrice,listEntry[i].quantitySold,listEntry[i].totalAmount);
        }
    }

    void sort(){
        for (int i = 0; i < listSize(); i++) {
            int minIndex = i;
            for (int j = i+1; j < listSize(); j++) {
                if (listEntry[minIndex].totalAmount > listEntry[j].totalAmount) {
                    minIndex = j;
                }
            }
            double temp = listEntry[i].totalAmount;
            listEntry[i].totalAmount = listEntry[minIndex].totalAmount;
            listEntry[minIndex].totalAmount = temp;

        }
    }

    

}