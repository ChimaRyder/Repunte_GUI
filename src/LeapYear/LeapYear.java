package LeapYear;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class LeapYear extends JFrame{
    private JTextField tfYear;
    private JPanel panel1;
    private JButton btnCheckYear;

    public LeapYear()
    {

        btnCheckYear.addActionListener(e ->  {
                boolean isALeapYear = false;
                int year = parseInt(tfYear.getText());

                if (year%4 == 0)
                {
                    isALeapYear = true;

                    if (year%400 != 0 && year%100 == 0)
                    {
                        isALeapYear = false;
                    }
                }

                if (isALeapYear)
                {
                    JOptionPane.showMessageDialog(this, "Leap year");
                } else {
                    JOptionPane.showMessageDialog(this, "Not a leap year");
                }
        });
    }

    public static void main(String[] args) {
        LeapYear ly = new LeapYear();

        ly.setContentPane(ly.panel1);
        ly.setSize(800, 500);
        ly.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ly.setVisible(true);
        ly.setTitle("Leap Year Checker");
    }
}
