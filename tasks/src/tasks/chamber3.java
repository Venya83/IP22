package tasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class chamber3 extends JFrame {
    private JLabel inputLabel1;
    private JTextField inputField1;
    private JLabel inputLabel2;
    private JTextField inputField2;
    private JButton generateButton;
    private JLabel resultLabel;

    public chamber3() {
        super("Рандомный Номер Генератор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputLabel1 = new JLabel("Введите целое число a:");
        inputField1 = new JTextField(10);
        inputLabel2 = new JLabel("Введите целое число b:");
        inputField2 = new JTextField(10);
        generateButton = new JButton("Сгенерировать");
        generateButton.addActionListener(new GenerateButtonListener());
        resultLabel = new JLabel("Сгенерированное число будет отображаться здесь");

        JPanel panel = new JPanel(new GridLayout(5, 1));
        panel.add(inputLabel1);
        panel.add(inputField1);
        panel.add(inputLabel2);
        panel.add(inputField2);
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
                int a = Integer.parseInt(inputField1.getText());
                int b = Integer.parseInt(inputField2.getText());
                Random random = new Random();
                int randomNumber = random.nextInt(b - a + 1) + a;
                resultLabel.setText(String.format("Случайное число из отрезка [%d;%d]: %d", a, b, randomNumber));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Ошибка: я ничё не понял");
            }
        }
    }

    public static void main(String[] args) {
        new chamber3();
    }
}
