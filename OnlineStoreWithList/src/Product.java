public class Product {
    String productTD;
    String productName;
    String category;
    double unitPrice;
    int quantitySold;

    public Product(String productTD, String productName, String category, double unitPrice, int quantitySold) {
        this.productTD = productTD;
        this.productName = productName;
        this.category = category;
        this.unitPrice = unitPrice;
        this.quantitySold = quantitySold;
    }
}
