package dontpon;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pc_block {
    public static void main(String[] args) {
        // Создание и настройка компонентов
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setUndecorated(true);
        frame.setBackground(Color.BLUE);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setLayout(null);
        
        Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
        JLabel titleLabel = new JLabel("Джотаро, ты любишь кабачки?");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        titleLabel.setBounds(20, 20, screenDimension.width - 40, 50);
        panel.add(titleLabel);
        
        JLabel subtitleLabel = new JLabel("Дио... Я их, блин, ненавижу!");
        subtitleLabel.setForeground(Color.WHITE);
        subtitleLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        subtitleLabel.setBounds(20, 80, screenDimension.width - 40, 30);
        panel.add(subtitleLabel);
        
        JTextField textField = new JTextField();
        textField.setBounds(20, 130, 200, 30); // установка размеров поля
        panel.add(textField);
        
        JLabel resultLabel = new JLabel();
        resultLabel.setForeground(Color.WHITE);
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        resultLabel.setBounds(20, 180, screenDimension.width - 40, 30);
        panel.add(resultLabel);
        
        JButton confirmButton = new JButton("Подтвердить");
        confirmButton.setBounds(240, 130, 120, 30);
        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText().trim().toLowerCase();
                if (input.equals("cirno")) {
                    System.exit(0);
                } else {
                    resultLabel.setText("А вот и нет!");
                }
            }
        });
        panel.add(confirmButton);
        
        // Установка размеров и отображение окна
        panel.setPreferredSize(screenDimension);
        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
