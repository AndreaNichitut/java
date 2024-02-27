package isp.lab9.exercise1.ui;

import isp.lab9.exercise1.services.UserPortfolio;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuyJPanel extends JPanel {
    private StockMarketJFrame mainFrame;

    public BuyJPanel(StockMarketJFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }

    private void initComponents(){
        setLayout(new GridLayout(2, 2));

        JPanel buyPanel = new JPanel();
        buyPanel.setLayout(new GridLayout(10, 2));

        JLabel availableFundsLabel = new JLabel("Available funds:");
        JTextField availableFundsTextField = new JTextField(mainFrame.getPortfolio().getCash().toPlainString() + " $");
        availableFundsTextField.setEditable(false);

        JLabel symbolLabel = new JLabel("Symbol:");
        JComboBox<String> symbolComboBox = new JComboBox<>();
        symbolComboBox.setModel(new DefaultComboBoxModel(mainFrame.getMarketService().getSymbols()));

        JLabel quantityLabel = new JLabel("Quantity:");
        JTextField quantityTextField = new JTextField();

        JLabel costLabel = new JLabel("Total cost:");
        JTextField costTextField = new JTextField();
        costTextField.setEditable(false);

        JButton buyButton = new JButton("Buy");
        // todo: add event listener to 'Buy' button
        buyButton.addActionListener(e -> buyStock(availableFundsTextField,symbolComboBox,quantityTextField));

        JButton costButton = new JButton("Get cost");
        costButton.addActionListener(e ->
                calculateTotalCostActionPerformed(symbolComboBox, quantityTextField, costTextField));

        buyPanel.add(availableFundsLabel);
        buyPanel.add(availableFundsTextField);
        buyPanel.add(new JPanel()); // empty cell in the grid
        buyPanel.add(new JPanel()); // empty cell in the grid
        buyPanel.add(symbolLabel);
        buyPanel.add(symbolComboBox);
        buyPanel.add(new JPanel()); // empty cell in the grid
        buyPanel.add(new JPanel()); // empty cell in the grid
        buyPanel.add(quantityLabel);
        buyPanel.add(quantityTextField);
        buyPanel.add(new JPanel()); // empty cell in the grid
        buyPanel.add(new JPanel()); // empty cell in the grid
        buyPanel.add(costLabel);
        buyPanel.add(costTextField);
        buyPanel.add(new JPanel()); // empty cell in the grid
        buyPanel.add(new JPanel()); // empty cell in the grid
        buyPanel.add(costButton);
        buyPanel.add(buyButton);
        add(buyPanel);
        add(new JPanel()); // empty cell in the grid
        add(new JPanel()); // empty cell in the grid
        add(new JPanel()); // empty cell in the grid

    }
    private void buyStock(JTextField availableFundsTextField, JComboBox<String> symbolComboBox ,JTextField quantityTextField){
        String symbol =(String) symbolComboBox.getSelectedItem();
        try{
            int quantity =Integer.parseInt(quantityTextField.getText());
            BigDecimal price =mainFrame.getMarketService().getStockPrice(symbol);
            BigDecimal total =price.multiply(new BigDecimal(quantity));
            UserPortfolio portfolio=mainFrame.getPortfolio();
            BigDecimal cash=portfolio.getCash();
            if(cash.compareTo(total)<0){
                JOptionPane.showConfirmDialog(null,
                        "insuficient founds!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else {
                portfolio.getShares().put(symbol,quantity);
                portfolio.setCash(cash.subtract(total));
                availableFundsTextField.setText(portfolio.getCash().toPlainString()+"$");

            }

        }catch (NumberFormatException e){
            JOptionPane.showConfirmDialog(null,
                    "invalid quantity number format!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        catch (IOException e){
            JOptionPane.showInputDialog(null,
                    "Cannot communicate with Yahoo Finance",
                    "error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
private void buy(JComboBox<String> symbolComboBox,JTextField costTextField, JTextField quantityTextField) {
        System.out.println("user is buying something");
        mainFrame.getPortfolio().addStocks(symbolComboBox.getSelectedItem().toString(),Integer.parseInt(quantityTextField.getText()));
}
    /**
     * Calculates the total transaction cost
     */
    private void calculateTotalCostActionPerformed(JComboBox<String> symbolComboBox,
                                                   JTextField quantityTextField,
                                                   JTextField totalCostTextField) {
        try {
            String symbol = (String) symbolComboBox.getSelectedItem();
            BigDecimal stockPrice = mainFrame.getMarketService().getStockPrice(symbol);

            try {
                int quantity = Integer.parseInt(quantityTextField.getText());
                DecimalFormat formatter = new DecimalFormat("#,##0.##");
                totalCostTextField.setText(
                        formatter.format(stockPrice.multiply(new BigDecimal(quantity))));
            } catch (NumberFormatException e) {
                totalCostTextField.setText("Invalid quantity value!");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(StockMarketJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
