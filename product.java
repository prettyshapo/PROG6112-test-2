Product.java
public class Product implements IProduct {

    String[] products;
    int[] sales;

    // Constructor
    public Product(String[] products, int[] sales) {

        this.products = products;
        this.sales = sales;
    }

    // Calculate total products sold
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < sales.length; i++) {

            total = total + sales[i];
        }

        return total;
    }

    // Calculate average products sold
    @Override
    public double GetAverageProductSold() {

        double average = GetTotalProductsSold() / 9.0;

        return average;
    }

    // Determine most popular product
    @Override
    public String GetMostPopularProduct() {

        int highestSales = 0;
        int popularProduct = 0;

        for (int i = 0; i < 3; i++) {

            int productTotal = 0;

            for (int j = 0; j < 3; j++) {

                productTotal = productTotal + sales[i * 3 + j];
            }

            if (productTotal > highestSales) {

                highestSales = productTotal;
                popularProduct = i;
            }
        }

        return products[popularProduct] + " (" + highestSales + ")";
    }
}