package tasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class chamber4 extends JFrame {
    private JLabel resultLabel;

    public chamber4() {
        super("Кал кулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton calculateButton = new JButton("Посчитать");
        calculateButton.addActionListener(new CalculateButtonListener());

        resultLabel = new JLabel("Косинусы углов 60, 45 и 40 градусов будут отображаться здесь");

        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(calculateButton);
        panel.add(resultLabel);

        setContentPane(panel);
        setSize(600, 150);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double radians60 = Math.PI / 3;
            double radians45 = Math.PI / 4;
            double radians40 = Math.PI * 2 / 9;

            double cosine60 = Math.cos(radians60);
            double cosine45 = Math.cos(radians45);
            double cosine40 = Math.cos(radians40);

            resultLabel.setText(String.format("Косинус угла 60 градусов: %.2f\n Косинус угла 45 градусов: %.2f\n Косинус угла 40 градусов: %.2f", cosine60, cosine45, cosine40));
        }
    }

    public static void main(String[] args) {
        new chamber4();
    }
}
