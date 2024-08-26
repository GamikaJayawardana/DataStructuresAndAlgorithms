public class Product {
    String productTD;
    String productName;
    String category;
    double unitPrice;
    int quantitySold;
    double totalAmount;

    double calculateTotalAmount(double unitPrice, int quantitySold) {
        return unitPrice*quantitySold;
    }

    public Product(String productTD, String productName, String category, double unitPrice, int quantitySold) {
        this.productTD = productTD;
        this.productName = productName;
        this.category = category;
        this.unitPrice = unitPrice;
        this.quantitySold = quantitySold;
        totalAmount = calculateTotalAmount(unitPrice,quantitySold);
    }
}
