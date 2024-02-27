package exemplu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300,200);

        //this.setLayout(new GridLayout(3,2));
        this.setLayout(null);

        JLabel inputLabel = new JLabel("Input");
        inputLabel.setBounds(20,20,100,20);
        JLabel outputLabel = new JLabel("Output");
        outputLabel.setBounds(20,60,100,20);

        JTextField inputTextField = new JTextField();
        inputTextField.setBounds(140,20,100,20);
        JTextField outputTextField = new JTextField();
        outputTextField.setBounds(140,60,100,20);
        outputTextField.setEditable(false);

        JButton copyButton = new JButton("Copy");
        copyButton.setBounds(100,100,100,20);
        copyButton.addActionListener(new CopyButtonHandler(inputTextField,outputTextField));

        this.add(inputLabel);
        this.add(inputTextField);
        this.add(outputLabel);
        this.add(outputTextField);
        this.add(copyButton);

        this.setVisible(true);
    }

    class CopyButtonHandler implements ActionListener {
        private JTextField inputTextField;
        private JTextField outputTextField;

        public CopyButtonHandler(JTextField inputTextField, JTextField outputTextField) {
            this.inputTextField = inputTextField;
            this.outputTextField = outputTextField;
        }
        @Override
        public  void actionPerformed(ActionEvent actionEvent) {
            String text= inputTextField.getText();
            outputTextField.setText(text.toUpperCase());
        }
    }
}
