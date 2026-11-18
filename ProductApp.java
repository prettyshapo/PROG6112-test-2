import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductApp extends JFrame implements ActionListener {
    private JTextField txtCustomerName;
    private JComboBox<String> cmbProduct;
    private JTextField txtPrice;
    private JButton btnProcess;

    public ProductApp() {
        setTitle("Product App");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        setJMenuBar(menuBar);

        add(new JLabel("Customer Name:"));
        txtCustomerName = new JTextField("Joe Bloggs");
        add(txtCustomerName);

        add(new JLabel("Select Product:"));
        String[] products = {"Cozy Nights Monarch", "Cozy Nights Deluxe", "Cozy Nights Supreme", "Cozy Nights Classic"};
        cmbProduct = new JComboBox<>(products);
        add(cmbProduct);

        add(new JLabel("Enter Price:"));
        txtPrice = new JTextField("3500");
        add(txtPrice);

        add(new JLabel(""));
        btnProcess = new JButton("PROCESS");
        btnProcess.addActionListener(this);
        add(btnProcess);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String customerName = txtCustomerName.getText();
        String productName = (String) cmbProduct.getSelectedItem();
        double price = Double.parseDouble(txtPrice.getText());

        Product product = new Product(customerName, productName, price);

        String output = "Customer Name: " + product.getCustomerName()
                + "\nProduct Name: " + product.getProductName()
                + "\nPrice: R" + product.getPrice()
                + "\nVAT Amount: R" + product.getVATAmount()
                + "\nCommission Amount: R" + product.getCommissionAmount()
                + "\nTotal Sale Amount: R" + product.getTotalSaleAmount();

        JOptionPane.showMessageDialog(this, output);
    }

    public static void main(String[] args) {
        new ProductApp();
    }
}