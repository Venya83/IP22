package tasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class chamber2 extends JFrame {
    private JLabel inputLabel;
    private JTextField inputField;
    private JButton generateButton;
    private JLabel resultLabel;

    public chamber2() {
        super("Рандомный Номер Генератор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputLabel = new JLabel("Введите натуральное положительное число n без ГМО:");
        inputField = new JTextField(10);
        generateButton = new JButton("Сгенерировать");
        generateButton.addActionListener(new GenerateButtonListener());
        resultLabel = new JLabel("Сгенерированное число будет отображаться здесь");

        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(generateButton);
        panel.add(resultLabel);

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class GenerateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int n = Integer.parseInt(inputField.getText());
                Random random = new Random();
                int randomNumber = random.nextInt(2 * n + 1) - n;
                resultLabel.setText(String.format("Случайное число из отрезка [-%d;%d]: %d", n, n, randomNumber));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Ошибка: я ничё не понял");
            }
        }
    }

    public static void main(String[] args) {
        new chamber2();
    }
}
