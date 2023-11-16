package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{
    private JPanel jpanel;
    private JCheckBox cPizza;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JCheckBox cFries;
    private JCheckBox cBurger;
    private JCheckBox cSoftDrinks;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    public FoodOrderingSystem()
    {

        btnOrder.addActionListener(e -> {
            double amount = 0;

            if(cPizza.isSelected())
            {
                amount += 100;
            }

            if(cBurger.isSelected())
            {
                amount += 80;
            }

            if(cFries.isSelected())
            {
                amount += 65;
            }

            if(cSoftDrinks.isSelected())
            {
                amount += 55;
            }

            if(cTea.isSelected())
            {
                amount += 50;
            }

            if(cSundae.isSelected())
            {
                amount += 40;
            }

            if (rb5.isSelected())
            {
                amount-= amount*.05;
            }

            if (rb10.isSelected())
            {
                amount-= amount*.10;
            }


            if (rb15.isSelected())
            {
                amount-= amount*.15;
            }

            JOptionPane.showMessageDialog(this, "The total price is Php " + String.format("%.2f", amount));
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem fos = new FoodOrderingSystem();

        fos.setContentPane(fos.jpanel);
        fos.setSize(800, 500);
        fos.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fos.setVisible(true);
        fos.setTitle("Food Ordering System");
    }
}
