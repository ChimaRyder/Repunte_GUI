package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class SimpleCalculator extends JFrame{
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JPanel jpanel;
    private JTextField lblResult;

    public SimpleCalculator() {

        btnCompute.addActionListener(e -> {
            int first = parseInt(tfNumber1.getText());
            int second = parseInt(tfNumber2.getText());

            int res =0;
            int opt = cbOperations.getSelectedIndex();
            switch(opt){
                case 0:
                    res = first + second;
                    lblResult.setText(Integer.toString(res));
                    break;
                case 1:
                    res = first - second;
                    lblResult.setText(Integer.toString(res));
                    break;
                case 2:
                    res = first * second;
                    lblResult.setText(Integer.toString(res));
                    break;
                case 3:
                    res = first / second;
                    lblResult.setText(Integer.toString(res));
                    break;
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();

        sc.setContentPane(sc.jpanel);
        sc.setSize(800, 500);
        sc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        sc.setVisible(true);
        sc.setTitle("Simple Calculator");
    }
}
