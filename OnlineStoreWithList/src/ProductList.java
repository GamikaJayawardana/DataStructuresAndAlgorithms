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

    Product deleteList(int p) {
        if (isListEmpty()) {
            System.out.println("Attempt to delete an entry from an empty list");
        }
        else if (p < 0 || p > (listSize())) {
            System.out.println("attempt to delete a position not in the list");
        }
        else {
            Product element = listEntry[p];
            for (int i = p; i < (listSize()-1) ; i++) {
                listEntry[i] = listEntry[i+1];
            }
            position--;
            return element;
        }
        return null;
    }

    public void traverse(){
        if(isListEmpty()){
            System.out.println("List is full.Can't traverse");
        }
        else {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Product ID", "Product Name", "Category", "Unite Price", "Quantity Sold", "Total Sales Amount");
            for (int i = 0; i < listSize(); i++) {
                System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", listEntry[i].productTD, listEntry[i].productName, listEntry[i].category, listEntry[i].unitPrice, listEntry[i].quantitySold, listEntry[i].totalAmount);
            }
        }

    }

    public Product retrive(int p) {
            if (isListEmpty()) {
                System.out.println("Attempt to retrive an entry from an empty list");
            }
            else if (p < 0 || p > (listSize())) {
                System.out.println("attempt to retrive a position not in the list");
            }
            else {
                return listEntry[p];
            }

        return null;
    }

    void replaceList(int p, Product x) {
        if (isListEmpty()) {
            System.out.println("Attempt to replace an entry from an empty list");
        }
        else if (p < 0 || p > (listSize())) {
            System.out.println("attempt to replace a position not in the list");
        }
        else {
            listEntry[p] = x;
        }
    }

    void selectionSort() {
        for (int i = 0; i < listSize(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < listSize(); j++) {
                if (listEntry[minIndex].totalAmount > listEntry[j].totalAmount) {
                    minIndex = j;
                }
            }
            Product temp = listEntry[i];
            listEntry[i] = listEntry[minIndex];
            listEntry[minIndex] = temp;

        }
    }

    void bubbleSort() {
        int n = listSize();
        Product temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(listEntry[j-1]. totalAmount> listEntry[j].totalAmount){
                    //swap elements
                    temp = listEntry[j-1];
                    listEntry[j-1] = listEntry[j];
                    listEntry[j] = temp;
                }
            }
        }
    }

    void quickSort(int start,int end ) {
        if ( start < end ) {
            int p = partition(start,end);
            quickSort(start,p-1);
            quickSort(p+1,end);
        }
    }

    private int partition(int start, int end) {
        double pivot = listEntry[end].totalAmount;
        int i = start-1;
        Product temp;
        for (int j = start; j < end; j++) {
            if (listEntry[j].totalAmount < pivot) {
                i++;
                temp = listEntry[i];
                listEntry[i] = listEntry[j];
                listEntry[j] = temp;
            }
        }
        temp = listEntry[i + 1];
        listEntry[i + 1] = listEntry[end];
        listEntry[end] = temp;
        return (i+1);
    }

    void insertionSort(){
        for (int i = 1; i < listSize(); i++) {
            int j = i;

            while (j > 0) {
               if (listEntry[j].totalAmount < listEntry[j-1].totalAmount) {
                   Product temp = listEntry[j];
                   listEntry[j] = listEntry[j-1];
                   listEntry[j-1] = temp;
               }
                j--;
            }

        }

    }

    public int binarySearch(int key){
        int low = 0;
        int high = listSize()-1;

        while (low <= high){
            int mid = (low + high)/2;
            if(listEntry[mid].totalAmount < key){
                low = mid + 1;
            }
            else if (listEntry[mid].totalAmount > key) {
                low = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}