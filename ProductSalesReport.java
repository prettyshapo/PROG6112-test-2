import java.util.Scanner;

public class ProductSalesReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[] sales = new int[9];

        int index = 0;

        // Enter sales information
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + products[i] + ": ");

                sales[index] = input.nextInt();

                index++;
            }
        }

        // Create Product object
        Product p = new Product(products, sales);

        // Display sales report
        System.out.println("\nPRODUCT SALES REPORT - 2026");

        System.out.println("************************************");

        System.out.println("TOTAL PRODUCT SALES: "
                + p.GetTotalProductsSold());

        System.out.println("AVERAGE PRODUCT SALES: "
                + p.GetAverageProductSold());

        System.out.println("MOST POPULAR PRODUCT: "
                + p.GetMostPopularProduct());

        input.close();
    }
}