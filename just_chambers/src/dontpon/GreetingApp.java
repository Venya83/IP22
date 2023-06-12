package dontpon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GreetingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Заход");

        // Поле ввода
        JTextField nameField = new JTextField(20);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Введите ваше имя: "));
        panel.add(nameField);

        // Кнопка "Пошёл"
        JButton button = new JButton("Пошёл");
        panel.add(button);

        // Подслушиваем кнопки
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                // Получаем введённое имя
                String name = nameField.getText();

                // Окно с приветствием
                JFrame greetingFrame = new JFrame("Приветствие");
                JLabel greetingLabel;
                if (name.equalsIgnoreCase("Jack")) {
                    greetingLabel = new JLabel("You can't hurt me Jack!");
                    greetingLabel.setFont(new Font("Arial", Font.BOLD, 20));
                    greetingLabel.setForeground(Color.WHITE);
                    greetingLabel.setHorizontalAlignment(JLabel.CENTER);
                    greetingLabel.setVerticalAlignment(JLabel.CENTER);

                    JPanel greetingPanel = new JPanel();
                    greetingPanel.setLayout(new BorderLayout());
                    greetingPanel.setBackground(Color.BLACK);
                    greetingPanel.add(greetingLabel, BorderLayout.CENTER);

                    JButton okButton = new JButton("Ок");
                    okButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                        	
                            // Окно с гифкой
                            JFrame gifFrame = new JFrame("");
                            JPanel gifPanel = new JPanel();
                            ImageIcon gifIcon = new ImageIcon("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\ИП22\\Поляков Н\\Клипса\\just_chambers\\src\\gif\\standing_here.gif");
                            JLabel gifLabel = new JLabel(gifIcon);
                            gifPanel.add(gifLabel);
                            gifFrame.getContentPane().add(gifPanel);
                            gifFrame.pack();
                            gifFrame.setLocationRelativeTo(null);
                            gifFrame.setVisible(true);
                            greetingFrame.dispose();
                        }
                    });

                    greetingPanel.add(okButton, BorderLayout.SOUTH);
                    greetingFrame.getContentPane().add(greetingPanel, BorderLayout.CENTER);
                } else {
                    greetingLabel = new JLabel("Привет, " + name + "!");
                    greetingLabel.setHorizontalAlignment(JLabel.CENTER);
                    greetingFrame.getContentPane().add(greetingLabel, BorderLayout.CENTER);

                    JButton okButton = new JButton("Ок");
                    okButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            greetingFrame.dispose();
                        }
                    });

                    JPanel buttonPanel = new JPanel();
                    buttonPanel.add(okButton);
                    greetingFrame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
                }

                greetingFrame.pack();
                greetingFrame.setSize(300, 150);
                greetingFrame.setLocationRelativeTo(null);
                greetingFrame.setVisible(true);
            }
        });

        // Панель с полем ввода и кнопку на главное окно
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}