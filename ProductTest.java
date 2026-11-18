public class Product {
    private String customerName;
    private String productName;
    private double price;

    public Product(String customerName, String productName, double price) {
        this.customerName = customerName;
        this.productName = productName;
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getVATAmount() {
        return price * 0.15;
    }

    public double getCommissionAmount() {
        return price * 0.05;
    }

    public double getTotalSaleAmount() {
        return price + getVATAmount() + getCommissionAmount();
    }
}