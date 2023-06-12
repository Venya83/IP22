package tasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class chamber1 extends JFrame {
    private JButton generateButton;
    private JLabel resultLabel;

    public chamber1() {
        super("Рандомный Номер Генератор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        generateButton = new JButton("Сгенерировать");
        generateButton.addActionListener(new GenerateButtonListener());

        resultLabel = new JLabel("Кликни, чтобы сгенерировать случайное число");

        JPanel panel = new JPanel(new FlowLayout());
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
            double random = Math.random() * 6 - 3; // generates a random number in [-3, 3)
            resultLabel.setText(String.format("Random number: %.2f", random));
        }
    }

    public static void main(String[] args) {
        new chamber1();
    }
}
