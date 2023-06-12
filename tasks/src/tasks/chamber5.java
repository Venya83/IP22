package tasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class chamber5 extends JFrame {
    private JTextField aField;
    private JTextField bField;
    private JLabel resultLabel;

    public chamber5() {
        super("Треугольный Кал кулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aField = new JTextField(10);
        bField = new JTextField(10);
        JButton calculateButton = new JButton("Посчитать");
        calculateButton.addActionListener(new CalculateButtonListener());

        resultLabel = new JLabel("Площадь и периметр треугольника будут отображаться здесь");

        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        inputPanel.add(new JLabel("Длина катета A:"));
        inputPanel.add(aField);
        inputPanel.add(new JLabel("Длина катета B:"));
        inputPanel.add(bField);

        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(inputPanel);
        panel.add(calculateButton);
        panel.add(resultLabel);

        setContentPane(panel);
        setSize(400, 200);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());

            double hypotenuse = Math.sqrt(a * a + b * b);
            double area = a * b / 2;
            double perimeter = a + b + hypotenuse;

            resultLabel.setText(String.format("Площадь треугольника: %.2f\n Периметр треугольника: %.2f", area, perimeter));
        }
    }

    public static void main(String[] args) {
        new chamber5();
    }
}
